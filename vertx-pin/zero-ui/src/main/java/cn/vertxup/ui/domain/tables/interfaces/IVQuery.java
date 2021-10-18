/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVQuery extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.KEY</code>. 「key」- 选项主键
     */
    public IVQuery setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.KEY</code>. 「key」- 选项主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.PROJECTION</code>. 「projection」-
     * query/projection:[], 默认列过滤项
     */
    public IVQuery setProjection(String value);

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.PROJECTION</code>. 「projection」-
     * query/projection:[], 默认列过滤项
     */
    public String getProjection();

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.PAGER</code>. 「pager」-
     * query/pager:{}, 分页选项
     */
    public IVQuery setPager(String value);

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.PAGER</code>. 「pager」-
     * query/pager:{}, 分页选项
     */
    public String getPager();

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.SORTER</code>. 「sorter」-
     * query/sorter:[], 排序选项
     */
    public IVQuery setSorter(String value);

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.SORTER</code>. 「sorter」-
     * query/sorter:[], 排序选项
     */
    public String getSorter();

    /**
     * Setter for <code>DB_ETERNAL.V_QUERY.CRITERIA</code>. 「criteria」-
     * query/criteria:{}, 查询条件选项
     */
    public IVQuery setCriteria(String value);

    /**
     * Getter for <code>DB_ETERNAL.V_QUERY.CRITERIA</code>. 「criteria」-
     * query/criteria:{}, 查询条件选项
     */
    public String getCriteria();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IVQuery
     */
    public void from(IVQuery from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IVQuery
     */
    public <E extends IVQuery> E into(E into);

        @Override
        public default IVQuery fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setProjection,json::getString,"PROJECTION","java.lang.String");
                setOrThrow(this::setPager,json::getString,"PAGER","java.lang.String");
                setOrThrow(this::setSorter,json::getString,"SORTER","java.lang.String");
                setOrThrow(this::setCriteria,json::getString,"CRITERIA","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("PROJECTION",getProjection());
                json.put("PAGER",getPager());
                json.put("SORTER",getSorter());
                json.put("CRITERIA",getCriteria());
                return json;
        }

}
