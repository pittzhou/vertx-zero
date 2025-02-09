package io.vertx.up.uca.marshal;

import io.vertx.core.ClusterOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.up.fn.Fn;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.options.JTransformer;

public class ClusterSetUp implements JTransformer<ClusterOptions> {

    private static final Annal LOGGER = Annal.get(ClusterSetUp.class);

    @Override
    public ClusterOptions transform(final JsonObject config) {
        return Fn.orSemi(null == config, LOGGER,
            ClusterOptions::new,
            () -> new ClusterOptions(config));
    }
}
