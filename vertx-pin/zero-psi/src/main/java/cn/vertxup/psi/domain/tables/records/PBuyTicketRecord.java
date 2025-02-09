/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.records;


import cn.vertxup.psi.domain.tables.PBuyTicket;
import cn.vertxup.psi.domain.tables.interfaces.IPBuyTicket;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PBuyTicketRecord extends UpdatableRecordImpl<PBuyTicketRecord> implements VertxPojo, IPBuyTicket {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.KEY</code>. 「key」- 采购申请主键
     */
    @Override
    public PBuyTicketRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.KEY</code>. 「key」- 采购申请主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.SERIAL</code>. 「serial」-
     * 采购单号（系统可用）
     */
    @Override
    public PBuyTicketRecord setSerial(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.SERIAL</code>. 「serial」-
     * 采购单号（系统可用）
     */
    @Override
    public String getSerial() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.TYPE</code>. 「type」- 单据类型
     */
    @Override
    public PBuyTicketRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.TYPE</code>. 「type」- 单据类型
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.STATUS</code>. 「status」- 单据状态
     */
    @Override
    public PBuyTicketRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.STATUS</code>. 「status」- 单据状态
     */
    @Override
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.OP_AT</code>. 「opAt」- 申请时间（单据日期）
     */
    @Override
    public PBuyTicketRecord setOpAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.OP_AT</code>. 「opAt」- 申请时间（单据日期）
     */
    @Override
    public LocalDateTime getOpAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.OP_BY</code>. 「opBy」- 申请人
     */
    @Override
    public PBuyTicketRecord setOpBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.OP_BY</code>. 「opBy」- 申请人
     */
    @Override
    public String getOpBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.OP_DEPT</code>. 「opDept」- 申请部门
     */
    @Override
    public PBuyTicketRecord setOpDept(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.OP_DEPT</code>. 「opDept」- 申请部门
     */
    @Override
    public String getOpDept() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.SOURCE</code>. 「source」- 单据来源
     */
    @Override
    public PBuyTicketRecord setSource(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.SOURCE</code>. 「source」- 单据来源
     */
    @Override
    public String getSource() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.CUSTOMER_ID</code>.
     * 「customerId」- 建议供应商
     */
    @Override
    public PBuyTicketRecord setCustomerId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.CUSTOMER_ID</code>.
     * 「customerId」- 建议供应商
     */
    @Override
    public String getCustomerId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.CURRENCY_ID</code>.
     * 「currencyId」- 币种
     */
    @Override
    public PBuyTicketRecord setCurrencyId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.CURRENCY_ID</code>.
     * 「currencyId」- 币种
     */
    @Override
    public String getCurrencyId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    @Override
    public PBuyTicketRecord setCompanyId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    @Override
    public String getCompanyId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.APPROVED_BY</code>.
     * 「approvedBy」- 审核人
     */
    @Override
    public PBuyTicketRecord setApprovedBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.APPROVED_BY</code>.
     * 「approvedBy」- 审核人
     */
    @Override
    public String getApprovedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.APPROVED_AT</code>.
     * 「approvedAt」- 审核时间
     */
    @Override
    public PBuyTicketRecord setApprovedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.APPROVED_AT</code>.
     * 「approvedAt」- 审核时间
     */
    @Override
    public LocalDateTime getApprovedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    @Override
    public PBuyTicketRecord setToId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.TO_ID</code>. 「toId」- 收货地址ID
     */
    @Override
    public String getToId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.TO_ADDRESS</code>. 「toAddress」-
     * 收货地址
     */
    @Override
    public PBuyTicketRecord setToAddress(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.TO_ADDRESS</code>. 「toAddress」-
     * 收货地址
     */
    @Override
    public String getToAddress() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    @Override
    public PBuyTicketRecord setTags(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.TAGS</code>. 「tags」- 单据标签
     */
    @Override
    public String getTags() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    @Override
    public PBuyTicketRecord setComment(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.COMMENT</code>. 「comment」- 单据备注
     */
    @Override
    public String getComment() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public PBuyTicketRecord setActive(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public PBuyTicketRecord setSigma(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public PBuyTicketRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public PBuyTicketRecord setLanguage(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public PBuyTicketRecord setCreatedAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public PBuyTicketRecord setCreatedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public PBuyTicketRecord setUpdatedAt(LocalDateTime value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.P_BUY_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public PBuyTicketRecord setUpdatedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.P_BUY_TICKET.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
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
    public void from(IPBuyTicket from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setType(from.getType());
        setStatus(from.getStatus());
        setOpAt(from.getOpAt());
        setOpBy(from.getOpBy());
        setOpDept(from.getOpDept());
        setSource(from.getSource());
        setCustomerId(from.getCustomerId());
        setCurrencyId(from.getCurrencyId());
        setCompanyId(from.getCompanyId());
        setApprovedBy(from.getApprovedBy());
        setApprovedAt(from.getApprovedAt());
        setToId(from.getToId());
        setToAddress(from.getToAddress());
        setTags(from.getTags());
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
    public <E extends IPBuyTicket> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PBuyTicketRecord
     */
    public PBuyTicketRecord() {
        super(PBuyTicket.P_BUY_TICKET);
    }

    /**
     * Create a detached, initialised PBuyTicketRecord
     */
    public PBuyTicketRecord(String key, String serial, String type, String status, LocalDateTime opAt, String opBy, String opDept, String source, String customerId, String currencyId, String companyId, String approvedBy, LocalDateTime approvedAt, String toId, String toAddress, String tags, String comment, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(PBuyTicket.P_BUY_TICKET);

        setKey(key);
        setSerial(serial);
        setType(type);
        setStatus(status);
        setOpAt(opAt);
        setOpBy(opBy);
        setOpDept(opDept);
        setSource(source);
        setCustomerId(customerId);
        setCurrencyId(currencyId);
        setCompanyId(companyId);
        setApprovedBy(approvedBy);
        setApprovedAt(approvedAt);
        setToId(toId);
        setToAddress(toAddress);
        setTags(tags);
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
     * Create a detached, initialised PBuyTicketRecord
     */
    public PBuyTicketRecord(cn.vertxup.psi.domain.tables.pojos.PBuyTicket value) {
        super(PBuyTicket.P_BUY_TICKET);

        if (value != null) {
            setKey(value.getKey());
            setSerial(value.getSerial());
            setType(value.getType());
            setStatus(value.getStatus());
            setOpAt(value.getOpAt());
            setOpBy(value.getOpBy());
            setOpDept(value.getOpDept());
            setSource(value.getSource());
            setCustomerId(value.getCustomerId());
            setCurrencyId(value.getCurrencyId());
            setCompanyId(value.getCompanyId());
            setApprovedBy(value.getApprovedBy());
            setApprovedAt(value.getApprovedAt());
            setToId(value.getToId());
            setToAddress(value.getToAddress());
            setTags(value.getTags());
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

        public PBuyTicketRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
