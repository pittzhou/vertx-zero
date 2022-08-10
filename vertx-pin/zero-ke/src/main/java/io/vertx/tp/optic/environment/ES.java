package io.vertx.tp.optic.environment;

import io.vertx.up.experiment.specification.request.KAppEnv;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface ES {
    /*
     * KEnvironment connecting for Ambient Environment
     * Data Extracting
     *
     * Here id maybe following such as
     * - sigma field
     * - appId field
     * - appKey field
     */
    KAppEnv connect(String id);

    /*
     * Single ES searching without sigma
     * 1. Checking the cache size
     * 2. Fetch the only one `KEnv`
     */
    KAppEnv connect();
}
