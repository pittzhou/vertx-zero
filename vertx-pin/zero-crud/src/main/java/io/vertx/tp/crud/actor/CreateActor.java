package io.vertx.tp.crud.actor;

import io.vertx.core.json.JsonObject;
import io.vertx.tp.crud.refine.Ix;
import io.vertx.tp.ke.atom.KField;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.up.util.Ut;

/*
 * Creation for body processing and inject auditor information
 * {
 *     "createdAt": "x",
 *     "createdBy": "xx"
 * }
 */
class CreateActor extends AbstractActor {

    @Override
    public JsonObject proc(final JsonObject data, final KModule config) {
        /* UserId */
        final String userId = this.getUser();
        if (Ut.notNil(userId)) {
            final KField field = config.getField();
            /* Created */
            Ix.onAuditor(data, field.getCreated(), userId);
        }
        return data;
    }
}
