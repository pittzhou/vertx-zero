package io.vertx.up.extension.pointer;

import io.vertx.core.Future;
import io.vertx.ext.web.RoutingContext;
import io.vertx.up.commune.Envelop;
import io.vertx.up.extension.PlugRegion;
import io.vertx.up.uca.cache.Cc;
import io.vertx.up.util.Ut;

class PluginRegion {
    /*
     * Plugin for Region
     */
    private static final String REGION = "region";
    private static final Cc<String, PlugRegion> CC_PLUGIN = Cc.openThread();

    static Future<Envelop> before(final RoutingContext context, final Envelop envelop) {
        return Plugin.mountPlugin(REGION, envelop, (auditCls, config) -> {
            /*
             * Data Region Before: Request
             */
            final PlugRegion region = CC_PLUGIN.pick(() -> Ut.instance(auditCls), auditCls.getName());
            // Fn.po?lThread(POOL_PLUGIN, () -> Ut.instance(auditCls), auditCls.getName());
            return region.bind(config).before(context, envelop);
        });
    }

    static Future<Envelop> after(final RoutingContext context, final Envelop envelop) {
        return Plugin.mountPlugin(REGION, envelop, (auditCls, config) -> {
            /*
             * Data Region After: Response
             */
            final PlugRegion region = CC_PLUGIN.pick(() -> Ut.instance(auditCls), auditCls.getName());
            // Fn.po?lThread(POOL_PLUGIN, () -> Ut.instance(auditCls), auditCls.getName());
            return region.bind(config).after(context, envelop);
        });
    }
}
