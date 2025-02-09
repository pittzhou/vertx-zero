package cn.originx.migration.backup;

import cn.originx.migration.AbstractStep;
import cn.originx.migration.MigrateStep;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.em.Environment;
import io.vertx.up.unity.Ux;

public class ReportAll extends AbstractStep {
    private transient final MigrateStep number;
    private transient final MigrateStep code;

    public ReportAll(final Environment environment) {
        super(environment);
        this.number = new ReportNumber(environment);
        this.code = new ReportCode(environment);
    }

    @Override
    public Future<JsonObject> procAsync(final JsonObject config) {
        this.banner("002. 报表生成");
        return Ux.future(config)
            /* Before */
            .compose(processed -> this.aspectAsync(processed, "before-report"))
            /* 生成Number */
            .compose(this.number.bind(this.app)::procAsync)
            /* 生成Code */
            .compose(this.code.bind(this.app)::procAsync)
            /* After */
            .compose(processed -> this.aspectAsync(processed, "after-report"));
    }
}
