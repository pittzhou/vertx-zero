/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISUser extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.S_USER.KEY</code>. 「key」- 用户ID
     */
    public ISUser setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.KEY</code>. 「key」- 用户ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.USERNAME</code>. 「username」- 用户登录账号
     */
    public ISUser setUsername(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.USERNAME</code>. 「username」- 用户登录账号
     */
    public String getUsername();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.REALNAME</code>. 「realname」- 用户真实姓名
     */
    public ISUser setRealname(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.REALNAME</code>. 「realname」- 用户真实姓名
     */
    public String getRealname();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.ALIAS</code>. 「alias」- 用户昵称
     */
    public ISUser setAlias(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.ALIAS</code>. 「alias」- 用户昵称
     */
    public String getAlias();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.MOBILE</code>. 「mobile」- 用户登录手机
     */
    public ISUser setMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.MOBILE</code>. 「mobile」- 用户登录手机
     */
    public String getMobile();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.EMAIL</code>. 「email」- 用户登录EMAIL地址
     */
    public ISUser setEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.EMAIL</code>. 「email」- 用户登录EMAIL地址
     */
    public String getEmail();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.PASSWORD</code>. 「password」- 用户登录密码
     */
    public ISUser setPassword(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.PASSWORD</code>. 「password」- 用户登录密码
     */
    public String getPassword();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    public ISUser setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public ISUser setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.CATEGORY</code>. 「category」- 用户分类
     */
    public ISUser setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.CATEGORY</code>. 「category」- 用户分类
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.SIGMA</code>. 「sigma」- 用户绑定的统一标识
     */
    public ISUser setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.SIGMA</code>. 「sigma」- 用户绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISUser setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public ISUser setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISUser setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISUser setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISUser setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISUser setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_USER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISUser setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_USER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISUser
     */
    public void from(ISUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISUser
     */
    public <E extends ISUser> E into(E into);

        @Override
        public default ISUser fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setUsername,json::getString,"USERNAME","java.lang.String");
                setOrThrow(this::setRealname,json::getString,"REALNAME","java.lang.String");
                setOrThrow(this::setAlias,json::getString,"ALIAS","java.lang.String");
                setOrThrow(this::setMobile,json::getString,"MOBILE","java.lang.String");
                setOrThrow(this::setEmail,json::getString,"EMAIL","java.lang.String");
                setOrThrow(this::setPassword,json::getString,"PASSWORD","java.lang.String");
                setOrThrow(this::setModelId,json::getString,"MODEL_ID","java.lang.String");
                setOrThrow(this::setModelKey,json::getString,"MODEL_KEY","java.lang.String");
                setOrThrow(this::setCategory,json::getString,"CATEGORY","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("USERNAME",getUsername());
                json.put("REALNAME",getRealname());
                json.put("ALIAS",getAlias());
                json.put("MOBILE",getMobile());
                json.put("EMAIL",getEmail());
                json.put("PASSWORD",getPassword());
                json.put("MODEL_ID",getModelId());
                json.put("MODEL_KEY",getModelKey());
                json.put("CATEGORY",getCategory());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
