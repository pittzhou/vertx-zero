package io.vertx.tp.workflow.uca.conformity;

import cn.zeroup.macrocosm.cv.em.NodeType;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.runtime.WTask;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class GearMulti extends AbstractGear {
    public GearMulti() {
        super(NodeType.Multi);
    }

    @Override
    public Future<JsonObject> todoAsync(final JsonObject parameters, final WTask task) {
        return null;
    }
}
