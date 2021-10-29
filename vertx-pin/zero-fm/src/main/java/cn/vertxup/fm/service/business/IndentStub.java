package cn.vertxup.fm.service.business;

import cn.vertxup.fm.domain.tables.pojos.FBill;
import cn.vertxup.fm.domain.tables.pojos.FBillItem;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface IndentStub {
    /*
     * Serial Generation by `indent`
     */
    default Future<FBill> initAsync(final JsonObject data) {
        return this.initAsync(data.getString(KName.INDENT), data);
    }

    Future<FBill> initAsync(String indent, JsonObject data);

    Future<FBillItem> itemAsync(String key, JsonObject data);

    Future<ConcurrentMap<Boolean, List<FBillItem>>> itemAsync(JsonArray items, JsonObject data);
}
