package io.vertx.tp.ke.refine;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import io.vertx.up.atom.record.Apt;
import io.vertx.up.atom.secure.Vis;
import io.vertx.up.eon.KName;
import io.vertx.up.experiment.mixture.HTAtom;
import io.vertx.up.log.Annal;
import io.vertx.up.util.Ut;
import org.jooq.Configuration;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

@SuppressWarnings("all")
public class Ke {

    /*
     * Jooq related:
     * Read jooq configuration database name `catalog`
     *
     * 1. getDatabase()
     * 2. getConfiguration()
     */
    public static String getDatabase() {
        return KeTool.getCatalog();
    }

    public static Configuration getConfiguration() {
        return KeTool.getConfiguration();
    }

    /*
     * Data Importing / Exporting Feature
     *
     * 1. combineAsync(JsonArray, ConcurrentMap<String,String>)
     * 2. combineAsync(JsonArray, ConcurrentMap<String,String>, List<String>)
     * 3. combineAsync(JsonArray, ConcurrentMap<String,String>, List<String>, TypeAtom)
     *
     * Dict Transfer Method
     * 1. fabricAsync(String field)
     */
    public static Future<JsonArray> combineAsync(final JsonArray data, final ConcurrentMap<String, String> headers) {
        return KeCompare.combineAsync(data, headers);
    }

    public static Future<JsonArray> combineAsync(final JsonArray data, final ConcurrentMap<String, String> headers,
                                                 final List<String> columns) {
        return KeCompare.combineAsync(data, headers, columns, null);
    }

    public static Future<JsonArray> combineAsync(final JsonArray data, final ConcurrentMap<String, String> headers,
                                                 final List<String> columns,
                                                 final HTAtom HTAtom) {
        return KeCompare.combineAsync(data, headers, columns, HTAtom);
    }

    /*
     * 1. mapFn(String, ConcurrentMap<String,JsonObject>, fn)
     * 2. mapFn(ConcurrentMap<String,JsonObject>, fn)
     */
    public static Function<JsonObject, Future<JsonObject>> mapFn(final String field, final ConcurrentMap<String, JsonObject> fieldConfig,
                                                                 final BiFunction<JsonObject, JsonArray, Future<JsonArray>> fileFn) {
        return data -> KeTool.map(data, field, fieldConfig, fileFn);
    }

    public static Function<JsonObject, Future<JsonObject>> mapFn(final ConcurrentMap<String, JsonObject> fieldConfig,
                                                                 final BiFunction<JsonObject, JsonArray, Future<JsonArray>> fileFn) {
        return data -> KeTool.map(data, KName.KEY, fieldConfig, fileFn);
    }


    /*
     * Banner Message
     * 1. banner(String)
     *
     * Log Method
     * 1. infoKe
     * 2. debugKe
     */
    public static void banner(final String module) {
        KeTool.banner(module);
    }

    public static void infoKe(final Annal logger, final String pattern, final Object... args) {
        KeLog.infoKe(logger, pattern, args);
    }

    public static void debugKe(final Annal logger, final String pattern, final Object... args) {
        KeLog.debugKe(logger, pattern, args);
    }

    /*
     * Session key generation
     *
     * 1. uri(String, String)
     * 2. uri(RoutingContext)
     *
     * Key Generation for different usage
     * 1. keyView(String, String, Vis)
     * 2. keyView(RoutingContext)
     * 3. keyAuthorized(String, String)
     * 4. keyResource(String, String)
     *
     */
    public static String uri(final String uri, final String requestUri) {
        return KeCache.uri(uri, requestUri);
    }

    public static String uri(final RoutingContext context) {
        return KeCache.uri(context);
    }

    public static String keyView(final String method, final String uri, final Vis view) {
        return KeCache.keyView(method, uri, view);
    }

    public static String keyView(final RoutingContext context) {
        return KeCache.keyView(context);
    }

    public static String keyAuthorized(final String method, final String uri) {
        return KeCache.keyAuthorized(method, uri);
    }

    public static String keyResource(final String method, final String uri) {
        return KeCache.keyResource(method, uri);
    }

    /*
     * Comparing method
     * 1. compared(Apt, String)
     * 2. compared(Apt, String, String)
     * 3. atomyFn(Class<?>, Apt)
     */
    public static Apt compmared(final Apt apt, final String user) {
        return KeCompare.compared(apt, KName.CODE, user);
    }

    public static Apt compmared(final Apt apt, final String field, final String user) {
        return KeCompare.compared(apt, field, user);
    }

    public static BiFunction<Function<JsonArray, Future<JsonArray>>, Function<JsonArray, Future<JsonArray>>, Future<JsonArray>> atomyFn(final Class<?> clazz, final Apt compared) {
        return KeCompare.atomyFn(clazz, compared);
    }

    /*
     * Data Audit
     * - umCreated
     *      - active
     *      - language
     *      - sigma
     *      - metadata
     *      - updatedAt
     *      - updatedBy
     *      - createdAt
     *      - createdBy
     * - umUpdated
     *      - active
     *      - language
     *      - sigma
     *      - metadata
     *      - updatedAt
     *      - updatedBy
     * - umIndent
     *      - XNumber Generation
     *      - Support T and Json
     */

    public static <T, I> void umCreated(final I output, final T input) {
        KeEnv.audit(output, null, input, null, false);
    }

    public static <T, I> void umCreated(final I output, final T input, final String pojo) {
        KeEnv.audit(output, null, input, pojo, false);
    }

    public static <T, I> void umCreated(final I output, final String pojo, final T input) {
        KeEnv.audit(output, pojo, input, null, false);
    }

    public static <T, I> void umCreated(final I output, final String outPojo, final T input, final String inPojo) {
        KeEnv.audit(output, outPojo, input, inPojo, false);
    }

    public static <T, I> void umUpdated(final I output, final T input) {
        KeEnv.audit(output, null, input, null, true);
    }

    public static <T, I> void umUpdated(final I output, final T input, final String pojo) {
        KeEnv.audit(output, null, input, pojo, true);
    }

    public static <T, I> void umUpdated(final I output, final String pojo, final T input) {
        KeEnv.audit(output, pojo, input, null, true);
    }

    public static <T, I> void umUpdated(final I output, final String outPojo, final T input, final String inPojo) {
        KeEnv.audit(output, outPojo, input, inPojo, true);
    }

    public static Future<JsonObject> umIndent(final JsonObject data, final String code) {
        return KeEnv.indent(data, code);
    }

    public static Future<JsonArray> umIndent(final JsonArray data, final String code) {
        return KeEnv.indent(data, code);
    }

    public static <T> Future<T> umIndent(final T input, final Function<T, String> fnSigma,
                                         final String code,
                                         final BiConsumer<T, String> fnConsumer) {
        final String sigma = fnSigma.apply(input);
        return KeEnv.indent(input, sigma, code, fnConsumer);
    }

    public static <T> Future<T> umIndent(final T input, final String sigma,
                                         final String code,
                                         final BiConsumer<T, String> fnConsumer) {
        return KeEnv.indent(input, sigma, code, fnConsumer);
    }

    public static <T> Future<List<T>> umIndent(final List<T> input, final Function<List<T>, String> fnSigma,
                                               final String code,
                                               final BiConsumer<T, String> fnConsumer) {
        final String sigma = fnSigma.apply(input);
        return KeEnv.indent(input, sigma, code, fnConsumer);
    }

    public static <T> Future<List<T>> umIndent(final List<T> input, final String sigma,
                                               final String code,
                                               final BiConsumer<T, String> fnConsumer) {
        return KeEnv.indent(input, sigma, code, fnConsumer);
    }

    public static Future<JsonObject> umJData(final JsonObject config, final JsonObject params) {
        return KeEnv.daoJ(config, params);
    }

    public static Future<JsonObject> umAData(final JsonObject config, final JsonObject params) {
        return KeEnv.daoJ(config, params);
    }

    public static Future<JsonArray> umALink(final String field, final String key, final Class<?> daoCls) {
        return KeEnv.daoR(field, key, daoCls);
    }

    public static <T> Future<List<T>> umALink(final String field, final String key, final Class<?> daoCls,
                                              final Function<T, Integer> priorityFn) {
        return KeEnv.daoR(field, key, daoCls, priorityFn);
    }

    public static Future<JsonObject> umUser(final JsonObject input, final JsonObject config) {
        return KeUser.umUser(input, config);
    }

    public static Future<JsonObject> umUser(final JsonObject input) {
        final JsonObject config = Ut.valueJObject(input, KName.__.USER);
        return KeUser.umUser(input, config);
    }
}
