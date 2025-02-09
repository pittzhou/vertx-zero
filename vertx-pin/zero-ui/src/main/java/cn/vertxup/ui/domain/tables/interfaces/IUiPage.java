/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IUiPage extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.KEY</code>. 「key」- 页面唯一主键
     */
    public IUiPage setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.KEY</code>. 「key」- 页面唯一主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.APP</code>. 「app」- 入口APP名称，APP中的path
     */
    public IUiPage setApp(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.APP</code>. 「app」- 入口APP名称，APP中的path
     */
    public String getApp();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.MODULE</code>. 「module」- 模块相关信息
     */
    public IUiPage setModule(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.MODULE</code>. 「module」- 模块相关信息
     */
    public String getModule();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.PAGE</code>. 「page」- 页面路径信息
     */
    public IUiPage setPage(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.PAGE</code>. 「page」- 页面路径信息
     */
    public String getPage();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.LAYOUT_ID</code>. 「layoutId」-
     * 使用的模板ID，最终生成 layout 顶层节点数据
     */
    public IUiPage setLayoutId(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.LAYOUT_ID</code>. 「layoutId」-
     * 使用的模板ID，最终生成 layout 顶层节点数据
     */
    public String getLayoutId();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.SECURE</code>. 「secure」-
     * 是否执行安全检查（安全检查才会被权限系统捕捉）
     */
    public IUiPage setSecure(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.SECURE</code>. 「secure」-
     * 是否执行安全检查（安全检查才会被权限系统捕捉）
     */
    public Boolean getSecure();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.PARAM_MAP</code>. 「paramMap」-
     * URL地址中的配置key=value
     */
    public IUiPage setParamMap(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.PARAM_MAP</code>. 「paramMap」-
     * URL地址中的配置key=value
     */
    public String getParamMap();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_NAME</code>.
     * 「containerName」- 当前页面是否存在容器，如果有容器，那么设置容器名称
     */
    public IUiPage setContainerName(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_NAME</code>.
     * 「containerName」- 当前页面是否存在容器，如果有容器，那么设置容器名称
     */
    public String getContainerName();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_CONFIG</code>.
     * 「containerConfig」- 当前页面容器相关配置
     */
    public IUiPage setContainerConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CONTAINER_CONFIG</code>.
     * 「containerConfig」- 当前页面容器相关配置
     */
    public String getContainerConfig();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.STATE</code>. 「state」- 当前页面的初始化状态信息
     */
    public IUiPage setState(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.STATE</code>. 「state」- 当前页面的初始化状态信息
     */
    public String getState();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.GRID</code>. 「grid」-
     * 当前页面的布局信息，Grid布局格式
     */
    public IUiPage setGrid(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.GRID</code>. 「grid」-
     * 当前页面的布局信息，Grid布局格式
     */
    public String getGrid();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.ASSIST</code>. 「assist」-
     * 当前页面的辅助数据Ajax配置
     */
    public IUiPage setAssist(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.ASSIST</code>. 「assist」-
     * 当前页面的辅助数据Ajax配置
     */
    public String getAssist();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public IUiPage setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IUiPage setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.METADATA</code>. 「metadata」- 附加配置
     */
    public IUiPage setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IUiPage setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IUiPage setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IUiPage setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IUiPage setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.UI_PAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IUiPage setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_PAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IUiPage
     */
    public void from(IUiPage from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IUiPage
     */
    public <E extends IUiPage> E into(E into);

        @Override
        public default IUiPage fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setApp,json::getString,"APP","java.lang.String");
                setOrThrow(this::setModule,json::getString,"MODULE","java.lang.String");
                setOrThrow(this::setPage,json::getString,"PAGE","java.lang.String");
                setOrThrow(this::setLayoutId,json::getString,"LAYOUT_ID","java.lang.String");
                setOrThrow(this::setSecure,json::getBoolean,"SECURE","java.lang.Boolean");
                setOrThrow(this::setParamMap,json::getString,"PARAM_MAP","java.lang.String");
                setOrThrow(this::setContainerName,json::getString,"CONTAINER_NAME","java.lang.String");
                setOrThrow(this::setContainerConfig,json::getString,"CONTAINER_CONFIG","java.lang.String");
                setOrThrow(this::setState,json::getString,"STATE","java.lang.String");
                setOrThrow(this::setGrid,json::getString,"GRID","java.lang.String");
                setOrThrow(this::setAssist,json::getString,"ASSIST","java.lang.String");
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
                json.put("APP",getApp());
                json.put("MODULE",getModule());
                json.put("PAGE",getPage());
                json.put("LAYOUT_ID",getLayoutId());
                json.put("SECURE",getSecure());
                json.put("PARAM_MAP",getParamMap());
                json.put("CONTAINER_NAME",getContainerName());
                json.put("CONTAINER_CONFIG",getContainerConfig());
                json.put("STATE",getState());
                json.put("GRID",getGrid());
                json.put("ASSIST",getAssist());
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
