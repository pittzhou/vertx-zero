package io.vertx.up.commune.compare;

import io.vertx.core.json.JsonObject;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
final class VsJsonObject extends AbstractSame {
    public VsJsonObject() {
        super(JsonObject.class);
    }

    @Override
    public boolean isAnd(final Object valueOld, final Object valueNew) {
        return false;
    }
}
