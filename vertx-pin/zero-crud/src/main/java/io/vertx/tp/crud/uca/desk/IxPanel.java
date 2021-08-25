package io.vertx.tp.crud.uca.desk;

import io.vertx.core.CompositeFuture;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.Values;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@SuppressWarnings("all")
public class IxPanel {
    private final transient IxIn active;
    private transient IxIn standBy;

    private transient boolean sequence = Boolean.TRUE;
    private transient BiFunction activeFn;
    private transient BiFunction standByFn;

    private transient BiFunction[] executors = new BiFunction[]{};
    private transient BiFunction outputFn = null;
    private transient BiFunction nextFn = null;

    private IxPanel(final Envelop envelop, final String module) {
        this.active = IxIn.active(envelop);
        this.standBy = IxIn.standBy(envelop, module);
        /* Build Connect */
        this.active.connect(this.standBy.module());
        this.outputFn = (a, s) -> Ux.future(s);
        this.nextFn = (i, a) -> Ux.future(a);
    }

    public static IxPanel on(final Envelop envelop, final String module) {
        return new IxPanel(envelop, module);
    }

    /*
     * Input:     active ( Json )     standBy ( Json )
     *                \                  /
     *                 \               /
     *                  \            /
     *                   <inputFn1>
     *                       |
     *                   <inputFn2>  ( executors )
     *                       |
     *                   <inputFn3>
     *                /             \
     *               /               \
     *              /                 \
     * Mode:   ( parallel )        ( passion )
     *     <activeFn>,<standFn>     <activeFn>
     *             \                   |
     *              \                  |
     *               \              <standFn>
     *                \             /
     *                 \          /
     *                  \       /
     * Output:         <outputFn>
     *
     *
     * 1. The executors are pre for input data
     * 2. Here are two mode for `activeFn, standFn`
     * 3. The `outputFn` could combine two output data.
     */
    @SafeVarargs
    public final <T> IxPanel input(final BiFunction<T, IxIn, Future<T>>... executors) {
        if (Objects.isNull(executors)) {
            this.executors = new BiFunction[]{};
        } else {
            this.executors = executors;
        }
        return this;
    }

    public <A, S, O> IxPanel output(final BiFunction<A, S, Future<O>> outputFn) {
        this.outputFn = outputFn;
        return this;
    }

    public <I, A> IxPanel next(final Function<IxIn, BiFunction<I, A, Future<I>>> nextFn) {
        this.nextFn = nextFn.apply(this.active);
        return this;
    }

    public <I, O> IxPanel parallel(final BiFunction<I, IxIn, Future<O>> activeFn,
                                   final BiFunction<I, IxIn, Future<O>> standFn) {
        this.sequence = false;
        this.activeFn = activeFn;
        this.standByFn = standFn;
        return this;
    }

    public <I, O> IxPanel parallel(final BiFunction<I, IxIn, Future<O>> activeAndStandFn) {
        this.sequence = false;
        this.activeFn = activeAndStandFn;
        this.standByFn = activeAndStandFn;
        return this;
    }

    public <I, O> IxPanel passion(final BiFunction<I, IxIn, Future<O>> activeFn,
                                  final BiFunction<I, IxIn, Future<O>> standFn) {
        this.sequence = true;
        this.activeFn = activeFn;
        this.standByFn = standFn;
        return this;
    }

    public <I, O> IxPanel passion(final BiFunction<I, IxIn, Future<O>> activeAndStandFn) {
        this.sequence = true;
        this.activeFn = activeAndStandFn;
        this.standByFn = activeAndStandFn;
        return this;
    }

    public <A, S, O> Future<O> runJ(final JsonObject input) {
        final JsonObject sure = Ut.sureJObject(input);
        return this.<JsonObject, A, S, O>runInternal(sure.copy(), outputFn);
    }

    public <A, S, O> Future<O> runA(final JsonArray input) {
        final JsonArray sure = Ut.sureJArray(input);
        return this.<JsonArray, A, S, O>runInternal(sure.copy(), outputFn);
    }

    /*
     *  sequence = false
     *  I -> A,
     *  I -> S
     *  (A, S) -> O
     *  sequence = true
     *  I -> A, ( A = I ) A -> S
     *  (A, S) -> O
     *
     *  I - Input
     *  A - Active
     *  S - StandBy
     *  O - Output
     */
    private <I, A, S, O> Future<O> runInternal(final I input, final BiFunction<A, S, Future<O>> outputFn) {
        /*
         * standByFn is null, return A
         */
        final Function<I, Future<A>> activeFn =
                (inputActive) -> this.active.ready(inputActive, this.executors)
                        .compose(normalized -> this.activeFn.apply(normalized, this.active));
        final Function<I, Future<S>> standFn;
        if (Objects.isNull(this.standByFn)) {
            /*
             * standByFn is null, directly return.
             */
            standFn = (inputStand) -> (Future<S>) Ux.future(inputStand);
        } else {
            /*
             * standByFn return S.
             */
            standFn = (inputStand) -> this.standBy.ready(inputStand, this.executors)
                    .compose(normalized -> (Future<S>) this.standByFn.apply(normalized, this.standBy));
        }
        if (this.sequence) {
            /*
             * After active, the result should be <A>
             */
            Future activeFuture = activeFn.apply(input)
                    .compose(a -> (Future<I>) this.nextFn.<I, A>apply(input, a));
            /*
             * Suppose the A = S
             * ( I -> A ), ( A -> S )
             */
            return activeFuture.compose(a -> standFn.apply((I) a)
                    .compose(s -> {
                        /*
                         * Check whether outputFn has value
                         */
                        if (Objects.isNull(outputFn)) {
                            return outputFn.apply((A) a, s);
                        } else {
                            return Ux.future((O) s);
                        }
                    })
            );
        } else {
            return CompositeFuture.join(activeFn.apply(input), standFn.apply(input)).compose(composite -> {
                final List result = composite.list();
                final A firstR = (A) result.get(Values.IDX);
                final S secondR = (S) result.get(Values.ONE);
                /*
                 * Here the outputFn should not be null
                 */
                return outputFn.apply(firstR, secondR);
            }).otherwise(Ux.otherwise(() -> null));
        }
    }
}
