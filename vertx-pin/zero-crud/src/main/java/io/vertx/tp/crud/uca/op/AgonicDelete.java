package io.vertx.tp.crud.uca.op;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.crud.init.IxPin;
import io.vertx.tp.crud.refine.Ix;
import io.vertx.tp.crud.uca.desk.IxIn;
import io.vertx.tp.crud.uca.output.Post;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.optic.Trash;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class AgonicDelete implements Agonic {
    @Override
    public Future<JsonObject> runAsync(final JsonObject input, final IxIn in) {
        final UxJooq jooq = IxPin.jooq(in);
        return jooq.fetchOneAsync(input).compose(entity -> {
            if (Objects.isNull(entity)) {
                /* Could not find the original */
                return Post.success204Pre(Boolean.TRUE);
            } else {
                final KModule module = in.module();
                final JsonObject json = Ux.toJson(entity, module.getPojo());
                /* BackUp future */
                return Ke.channelAsync(Trash.class, () -> Ux.future(json),
                                (stub) -> stub.backupAsync(module.getIdentifier(), json))

                        /* 200, IxLinker deleted first and then delete related record */
                        .compose(processed -> Ix.<Boolean>seekFn(in)
                                .apply(processed)
                                .apply(() -> Boolean.FALSE, UxJooq::deleteByAsync)
                                .compose(Post::success200Pre));
            }
        });
    }
}
