/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXTabular extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    public IXTabular setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    public IXTabular setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    public IXTabular setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    public IXTabular setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    public IXTabular setIcon(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    public String getIcon();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    public IXTabular setSort(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    public Integer getSort();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    public IXTabular setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IXTabular setAppId(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    public IXTabular setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXTabular setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    public IXTabular setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXTabular setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IXTabular setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXTabular setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IXTabular setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXTabular setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXTabular
     */
    public void from(IXTabular from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXTabular
     */
    public <E extends IXTabular> E into(E into);

        @Override
        public default IXTabular fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setIcon,json::getString,"ICON","java.lang.String");
                setOrThrow(this::setSort,json::getInteger,"SORT","java.lang.Integer");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setAppId,json::getString,"APP_ID","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("TYPE",getType());
                json.put("ICON",getIcon());
                json.put("SORT",getSort());
                json.put("COMMENT",getComment());
                json.put("APP_ID",getAppId());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
