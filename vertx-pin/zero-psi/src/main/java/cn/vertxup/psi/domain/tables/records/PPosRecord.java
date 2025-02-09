/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.records;


import cn.vertxup.psi.domain.tables.PPos;
import cn.vertxup.psi.domain.tables.interfaces.IPPos;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PPosRecord extends UpdatableRecordImpl<PPosRecord> implements VertxPojo, IPPos {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.P_POS.KEY</code>. 「key」- 仓位主键
     */
    @Override
    public PPosRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.KEY</code>. 「key」- 仓位主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.NAME</code>. 「name」- 仓位名称
     */
    @Override
    public PPosRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.NAME</code>. 「name」- 仓位名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CODE</code>. 「code」- 仓位编号（系统可用）
     */
    @Override
    public PPosRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CODE</code>. 「code」- 仓位编号（系统可用）
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.TYPE</code>. 「type」- 仓位类型
     */
    @Override
    public PPosRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.TYPE</code>. 「type」- 仓位类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.STATUS</code>. 「status」- 仓位状态
     */
    @Override
    public PPosRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.STATUS</code>. 「status」- 仓位状态
     */
    @Override
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.WH_ID</code>. 「whId」- 所属仓库信息
     */
    @Override
    public PPosRecord setWhId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.WH_ID</code>. 「whId」- 所属仓库信息
     */
    @Override
    public String getWhId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.DIRECT</code>. 「direct」- 直接仓位，1对1
     */
    @Override
    public PPosRecord setDirect(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.DIRECT</code>. 「direct」- 直接仓位，1对1
     */
    @Override
    public Boolean getDirect() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CAPACITY</code>. 「capacity」- 仓位容量
     */
    @Override
    public PPosRecord setCapacity(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CAPACITY</code>. 「capacity」- 仓位容量
     */
    @Override
    public Long getCapacity() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CAPACITY_EXCEED</code>.
     * 「capacityExceed」- 仓位超容部分
     */
    @Override
    public PPosRecord setCapacityExceed(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CAPACITY_EXCEED</code>.
     * 「capacityExceed」- 仓位超容部分
     */
    @Override
    public Long getCapacityExceed() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.LIMIT_TYPE</code>. 「limitType」- 仓位类型限制
     */
    @Override
    public PPosRecord setLimitType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.LIMIT_TYPE</code>. 「limitType」- 仓位类型限制
     */
    @Override
    public String getLimitType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.LIMIT_RULE</code>. 「limitRule」- 仓位限制规则
     */
    @Override
    public PPosRecord setLimitRule(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.LIMIT_RULE</code>. 「limitRule」- 仓位限制规则
     */
    @Override
    public String getLimitRule() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_ROW</code>. 「posRow」- 行维度
     */
    @Override
    public PPosRecord setPosRow(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_ROW</code>. 「posRow」- 行维度
     */
    @Override
    public Integer getPosRow() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_COLUMN</code>. 「posColumn」- 列维度
     */
    @Override
    public PPosRecord setPosColumn(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_COLUMN</code>. 「posColumn」- 列维度
     */
    @Override
    public Integer getPosColumn() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_HEIGHT</code>. 「posHeight」- 高维度
     */
    @Override
    public PPosRecord setPosHeight(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_HEIGHT</code>. 「posHeight」- 高维度
     */
    @Override
    public Integer getPosHeight() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_TAGS</code>. 「posTags」- 标签，横切维度位置管理
     */
    @Override
    public PPosRecord setPosTags(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_TAGS</code>. 「posTags」- 标签，横切维度位置管理
     */
    @Override
    public String getPosTags() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.POS_TRACE</code>. 「posTrace」- 空间位置描述
     */
    @Override
    public PPosRecord setPosTrace(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.POS_TRACE</code>. 「posTrace」- 空间位置描述
     */
    @Override
    public String getPosTrace() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.COMMENT</code>. 「comment」- 仓库备注
     */
    @Override
    public PPosRecord setComment(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.COMMENT</code>. 「comment」- 仓库备注
     */
    @Override
    public String getComment() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PPosRecord setActive(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PPosRecord setSigma(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public PPosRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public PPosRecord setLanguage(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public PPosRecord setCreatedAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public PPosRecord setCreatedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public PPosRecord setUpdatedAt(LocalDateTime value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_POS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public PPosRecord setUpdatedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_POS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(24);
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
    public void from(IPPos from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setWhId(from.getWhId());
        setDirect(from.getDirect());
        setCapacity(from.getCapacity());
        setCapacityExceed(from.getCapacityExceed());
        setLimitType(from.getLimitType());
        setLimitRule(from.getLimitRule());
        setPosRow(from.getPosRow());
        setPosColumn(from.getPosColumn());
        setPosHeight(from.getPosHeight());
        setPosTags(from.getPosTags());
        setPosTrace(from.getPosTrace());
        setComment(from.getComment());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IPPos> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PPosRecord
     */
    public PPosRecord() {
        super(PPos.P_POS);
    }

    /**
     * Create a detached, initialised PPosRecord
     */
    public PPosRecord(String key, String name, String code, String type, String status, String whId, Boolean direct, Long capacity, Long capacityExceed, String limitType, String limitRule, Integer posRow, Integer posColumn, Integer posHeight, String posTags, String posTrace, String comment, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(PPos.P_POS);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setStatus(status);
        setWhId(whId);
        setDirect(direct);
        setCapacity(capacity);
        setCapacityExceed(capacityExceed);
        setLimitType(limitType);
        setLimitRule(limitRule);
        setPosRow(posRow);
        setPosColumn(posColumn);
        setPosHeight(posHeight);
        setPosTags(posTags);
        setPosTrace(posTrace);
        setComment(comment);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised PPosRecord
     */
    public PPosRecord(cn.vertxup.psi.domain.tables.pojos.PPos value) {
        super(PPos.P_POS);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setStatus(value.getStatus());
            setWhId(value.getWhId());
            setDirect(value.getDirect());
            setCapacity(value.getCapacity());
            setCapacityExceed(value.getCapacityExceed());
            setLimitType(value.getLimitType());
            setLimitRule(value.getLimitRule());
            setPosRow(value.getPosRow());
            setPosColumn(value.getPosColumn());
            setPosHeight(value.getPosHeight());
            setPosTags(value.getPosTags());
            setPosTrace(value.getPosTrace());
            setComment(value.getComment());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public PPosRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
