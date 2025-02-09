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
public interface IUiList extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.KEY</code>. 「key」- 主键
     */
    public IUiList setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.KEY</code>. 「key」- 主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.NAME</code>. 「name」- 名称
     */
    public IUiList setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.NAME</code>. 「name」- 名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.CODE</code>. 「code」- 系统编码
     */
    public IUiList setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.CODE</code>. 「code」- 系统编码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.IDENTIFIER</code>. 「identifier」-
     * 表单所属的模型ID
     */
    public IUiList setIdentifier(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.IDENTIFIER</code>. 「identifier」-
     * 表单所属的模型ID
     */
    public String getIdentifier();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.V_QUERY</code>. 「vQuery」- 连接query到
     * grid -&gt; query 节点
     */
    public IUiList setVQuery(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.V_QUERY</code>. 「vQuery」- 连接query到
     * grid -&gt; query 节点
     */
    public String getVQuery();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.V_SEARCH</code>. 「vSearch」- 连接search到
     * grid -&gt; options 节点
     */
    public IUiList setVSearch(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.V_SEARCH</code>. 「vSearch」- 连接search到
     * grid -&gt; options 节点
     */
    public String getVSearch();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.V_TABLE</code>. 「vTable」- 连接table到
     * grid -&gt; table 节点
     */
    public IUiList setVTable(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.V_TABLE</code>. 「vTable」- 连接table到
     * grid -&gt; table 节点
     */
    public String getVTable();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.V_SEGMENT</code>. 「vSegment」-
     * Json结构，对应到 grid -&gt; component 节点
     */
    public IUiList setVSegment(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.V_SEGMENT</code>. 「vSegment」-
     * Json结构，对应到 grid -&gt; component 节点
     */
    public String getVSegment();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.DYNAMIC_COLUMN</code>.
     * 「dynamicColumn」- 动态列？
     */
    public IUiList setDynamicColumn(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.DYNAMIC_COLUMN</code>.
     * 「dynamicColumn」- 动态列？
     */
    public Boolean getDynamicColumn();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.DYNAMIC_SWITCH</code>.
     * 「dynamicSwitch」- 动态切换？
     */
    public IUiList setDynamicSwitch(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.DYNAMIC_SWITCH</code>.
     * 「dynamicSwitch」- 动态切换？
     */
    public Boolean getDynamicSwitch();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.OPTIONS_AJAX</code>. 「optionsAjax」-
     * 所有 ajax系列的配置
     */
    public IUiList setOptionsAjax(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.OPTIONS_AJAX</code>. 「optionsAjax」-
     * 所有 ajax系列的配置
     */
    public String getOptionsAjax();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.OPTIONS_SUBMIT</code>.
     * 「optionsSubmit」- 所有提交类的配置
     */
    public IUiList setOptionsSubmit(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.OPTIONS_SUBMIT</code>.
     * 「optionsSubmit」- 所有提交类的配置
     */
    public String getOptionsSubmit();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.OPTIONS</code>. 「options」- 配置项
     */
    public IUiList setOptions(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.OPTIONS</code>. 「options」- 配置项
     */
    public String getOptions();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.CLASS_COMBINER</code>.
     * 「classCombiner」- 组装器
     */
    public IUiList setClassCombiner(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.CLASS_COMBINER</code>.
     * 「classCombiner」- 组装器
     */
    public String getClassCombiner();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.ACTIVE</code>. 「active」- 是否启用
     */
    public IUiList setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.SIGMA</code>. 「sigma」- 统一标识
     */
    public IUiList setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.METADATA</code>. 「metadata」- 附加配置
     */
    public IUiList setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IUiList setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IUiList setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IUiList setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IUiList setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.UI_LIST.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IUiList setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_LIST.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IUiList
     */
    public void from(IUiList from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IUiList
     */
    public <E extends IUiList> E into(E into);

        @Override
        public default IUiList fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setIdentifier,json::getString,"IDENTIFIER","java.lang.String");
                setOrThrow(this::setVQuery,json::getString,"V_QUERY","java.lang.String");
                setOrThrow(this::setVSearch,json::getString,"V_SEARCH","java.lang.String");
                setOrThrow(this::setVTable,json::getString,"V_TABLE","java.lang.String");
                setOrThrow(this::setVSegment,json::getString,"V_SEGMENT","java.lang.String");
                setOrThrow(this::setDynamicColumn,json::getBoolean,"DYNAMIC_COLUMN","java.lang.Boolean");
                setOrThrow(this::setDynamicSwitch,json::getBoolean,"DYNAMIC_SWITCH","java.lang.Boolean");
                setOrThrow(this::setOptionsAjax,json::getString,"OPTIONS_AJAX","java.lang.String");
                setOrThrow(this::setOptionsSubmit,json::getString,"OPTIONS_SUBMIT","java.lang.String");
                setOrThrow(this::setOptions,json::getString,"OPTIONS","java.lang.String");
                setOrThrow(this::setClassCombiner,json::getString,"CLASS_COMBINER","java.lang.String");
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
                json.put("IDENTIFIER",getIdentifier());
                json.put("V_QUERY",getVQuery());
                json.put("V_SEARCH",getVSearch());
                json.put("V_TABLE",getVTable());
                json.put("V_SEGMENT",getVSegment());
                json.put("DYNAMIC_COLUMN",getDynamicColumn());
                json.put("DYNAMIC_SWITCH",getDynamicSwitch());
                json.put("OPTIONS_AJAX",getOptionsAjax());
                json.put("OPTIONS_SUBMIT",getOptionsSubmit());
                json.put("OPTIONS",getOptions());
                json.put("CLASS_COMBINER",getClassCombiner());
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
