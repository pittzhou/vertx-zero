package io.vertx.tp.plugin.cache.hit;

import io.vertx.core.json.JsonObject;

import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class AlgorithmRecord extends AbstractL1Algorithm {

    @Override
    public String dataType() {
        return "RECORD";
    }

    @Override
    public void dataProcess(final ConcurrentMap<String, Object> resultMap, final JsonObject jsonBody) {
    }

    @Override
    public void dataRefer(final ConcurrentMap<String, Object> resultMap, final JsonObject jsonBody) {
    }

    @Override
    public void dataTree(final ConcurrentMap<String, Object> resultMap, final JsonObject jsonBody) {
    }
}
