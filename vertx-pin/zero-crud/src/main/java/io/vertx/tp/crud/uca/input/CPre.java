package io.vertx.tp.crud.uca.input;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.tp.crud.refine.Ix;
import io.vertx.tp.crud.uca.desk.IxIn;
import io.vertx.tp.ke.atom.KField;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class CPre implements Pre {
    @Override
    public Future<JsonObject> inAsync(final JsonObject data, final IxIn in) {
        /* UserId */
        final User user = in.user();
        final KModule module = in.module();
        if (Objects.nonNull(user)) {
            final String userId = Ke.keyUser(user);
            if (Ut.notNil(userId)) {
                final KField field = module.getField();
                /* Created */
                Ix.audit(data, field.getCreated(), userId);
            }
        }
        return Ux.future(data);
    }
}
