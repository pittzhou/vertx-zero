/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.records;


import cn.vertxup.rbac.domain.tables.SPath;
import cn.vertxup.rbac.domain.tables.interfaces.ISPath;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SPathRecord extends UpdatableRecordImpl<SPathRecord> implements VertxPojo, ISPath {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.KEY</code>. 「key」- 规则主键
     */
    @Override
    public SPathRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.KEY</code>. 「key」- 规则主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.NAME</code>. 「name」- 规则名称
     */
    @Override
    public SPathRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.NAME</code>. 「name」- 规则名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    @Override
    public SPathRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.PHASE</code>. 「phase」- UI读取数据的操作周期
     */
    @Override
    public SPathRecord setPhase(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.PHASE</code>. 「phase」- UI读取数据的操作周期
     */
    @Override
    public String getPhase() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.MAPPING</code>. 「mapping」- 从 dm -&gt;
     * ui 转换
     */
    @Override
    public SPathRecord setMapping(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.MAPPING</code>. 「mapping」- 从 dm -&gt;
     * ui 转换
     */
    @Override
    public String getMapping() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.PARENT_ID</code>. 「parentId」-
     * 区域模式下的父ID，系统内部读取
     */
    @Override
    public SPathRecord setParentId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.PARENT_ID</code>. 「parentId」-
     * 区域模式下的父ID，系统内部读取
     */
    @Override
    public String getParentId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.RUN_COMPONENT</code>. 「runComponent」-
     * HValve执行组件，组件内置处理 dm / ui 两部分内容
     */
    @Override
    public SPathRecord setRunComponent(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.RUN_COMPONENT</code>. 「runComponent」-
     * HValve执行组件，组件内置处理 dm / ui 两部分内容
     */
    @Override
    public String getRunComponent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.RUN_TYPE</code>. 「runType」-
     * 视图管理类型（查询用）
     */
    @Override
    public SPathRecord setRunType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.RUN_TYPE</code>. 「runType」-
     * 视图管理类型（查询用）
     */
    @Override
    public String getRunType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_TYPE</code>. 「dmType」- 分组类型
     */
    @Override
    public SPathRecord setDmType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_TYPE</code>. 「dmType」- 分组类型
     */
    @Override
    public String getDmType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_COMPONENT</code>. 「dmComponent」-
     * 必须绑定组专用Dao组件
     */
    @Override
    public SPathRecord setDmComponent(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_COMPONENT</code>. 「dmComponent」-
     * 必须绑定组专用Dao组件
     */
    @Override
    public String getDmComponent() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_CONDITION</code>. 「dmCondition」-
     * 分组条件
     */
    @Override
    public SPathRecord setDmCondition(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_CONDITION</code>. 「dmCondition」-
     * 分组条件
     */
    @Override
    public String getDmCondition() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.DM_CONFIG</code>. 「dmConfig」-
     * 组配置信息，配置呈现部分
     */
    @Override
    public SPathRecord setDmConfig(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.DM_CONFIG</code>. 「dmConfig」-
     * 组配置信息，配置呈现部分
     */
    @Override
    public String getDmConfig() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    @Override
    public SPathRecord setUiType(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    @Override
    public String getUiType() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public SPathRecord setUiConfig(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public String getUiConfig() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_CONDITION</code>. 「uiCondition」-
     * 查询模板
     */
    @Override
    public SPathRecord setUiCondition(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_CONDITION</code>. 「uiCondition」-
     * 查询模板
     */
    @Override
    public String getUiCondition() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_COMPONENT</code>. 「uiComponent」-
     * 特殊组件
     */
    @Override
    public SPathRecord setUiComponent(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_COMPONENT</code>. 「uiComponent」-
     * 特殊组件
     */
    @Override
    public String getUiComponent() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_SURFACE</code>. 「uiSurface」-
     * 界面呈现模式，已经被降维之后（列表、树、其他等相关配置）
     */
    @Override
    public SPathRecord setUiSurface(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_SURFACE</code>. 「uiSurface」-
     * 界面呈现模式，已经被降维之后（列表、树、其他等相关配置）
     */
    @Override
    public String getUiSurface() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_SORT</code>. 「sort」- 该板块的排序（前端）
     */
    @Override
    public SPathRecord setUiSort(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_SORT</code>. 「sort」- 该板块的排序（前端）
     */
    @Override
    public Integer getUiSort() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SPathRecord setSigma(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SPathRecord setLanguage(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SPathRecord setActive(Boolean value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SPathRecord setMetadata(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SPathRecord setCreatedAt(LocalDateTime value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SPathRecord setCreatedBy(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SPathRecord setUpdatedAt(LocalDateTime value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SPathRecord setUpdatedBy(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(25);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISPath from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setPhase(from.getPhase());
        setMapping(from.getMapping());
        setParentId(from.getParentId());
        setRunComponent(from.getRunComponent());
        setRunType(from.getRunType());
        setDmType(from.getDmType());
        setDmComponent(from.getDmComponent());
        setDmCondition(from.getDmCondition());
        setDmConfig(from.getDmConfig());
        setUiType(from.getUiType());
        setUiConfig(from.getUiConfig());
        setUiCondition(from.getUiCondition());
        setUiComponent(from.getUiComponent());
        setUiSurface(from.getUiSurface());
        setUiSort(from.getUiSort());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ISPath> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SPathRecord
     */
    public SPathRecord() {
        super(SPath.S_PATH);
    }

    /**
     * Create a detached, initialised SPathRecord
     */
    public SPathRecord(String key, String name, String code, String phase, String mapping, String parentId, String runComponent, String runType, String dmType, String dmComponent, String dmCondition, String dmConfig, String uiType, String uiConfig, String uiCondition, String uiComponent, String uiSurface, Integer uiSort, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(SPath.S_PATH);

        setKey(key);
        setName(name);
        setCode(code);
        setPhase(phase);
        setMapping(mapping);
        setParentId(parentId);
        setRunComponent(runComponent);
        setRunType(runType);
        setDmType(dmType);
        setDmComponent(dmComponent);
        setDmCondition(dmCondition);
        setDmConfig(dmConfig);
        setUiType(uiType);
        setUiConfig(uiConfig);
        setUiCondition(uiCondition);
        setUiComponent(uiComponent);
        setUiSurface(uiSurface);
        setUiSort(uiSort);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised SPathRecord
     */
    public SPathRecord(cn.vertxup.rbac.domain.tables.pojos.SPath value) {
        super(SPath.S_PATH);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setPhase(value.getPhase());
            setMapping(value.getMapping());
            setParentId(value.getParentId());
            setRunComponent(value.getRunComponent());
            setRunType(value.getRunType());
            setDmType(value.getDmType());
            setDmComponent(value.getDmComponent());
            setDmCondition(value.getDmCondition());
            setDmConfig(value.getDmConfig());
            setUiType(value.getUiType());
            setUiConfig(value.getUiConfig());
            setUiCondition(value.getUiCondition());
            setUiComponent(value.getUiComponent());
            setUiSurface(value.getUiSurface());
            setUiSort(value.getUiSort());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public SPathRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
