package io.vertx.tp.ambient.uca.differ;

import cn.vertxup.ambient.domain.tables.pojos.XActivity;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.Strings;
import io.vertx.up.experiment.mixture.HAtom;
import io.vertx.up.uca.cache.Cc;

import java.util.function.Supplier;

/**
 * Split the data source into different part here
 * 1. New interface for output processing: Returned to JSix
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface Schism {

    Cc<String, Schism> CC_SCHISM = Cc.openThread();

    static Schism diffJ(final HAtom atom) {
        final String unique = atom.sigma() + Strings.SLASH +
            atom.identifier() + Strings.SLASH +
            SchismJ.class.getName();
        return CC_SCHISM.pick(SchismJ::new, unique).bind(atom);
    }

    /*
     * Bind the definition of atom, the data structure is as following:
     *
     */
    Schism bind(HAtom atom);

    // ============================= Generate XActivity Records ========================
    /*
     * Diff on record to generate activity record
     * Generate twins data structure
     * {
     *     "__OLD__": {},
     *     "__NEW__": {}
     * }
     */
    Future<JsonObject> diffAsync(JsonObject recordO, JsonObject recordN, Supplier<Future<XActivity>> activityFn);
}
