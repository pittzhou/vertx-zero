/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XNotice;
import cn.vertxup.ambient.domain.tables.interfaces.IXNotice;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XNoticeRecord extends UpdatableRecordImpl<XNoticeRecord> implements VertxPojo, Record17<String, String, String, String, String, String, String, LocalDateTime, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IXNotice {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.KEY</code>. 「key」- 公告主键
     */
    @Override
    public XNoticeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.KEY</code>. 「key」- 公告主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.NAME</code>. 「name」- 公告名称
     */
    @Override
    public XNoticeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.NAME</code>. 「name」- 公告名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.CODE</code>. 「code」- 公告编码
     */
    @Override
    public XNoticeRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.CODE</code>. 「code」- 公告编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.TYPE</code>. 「type」- 公告类型
     */
    @Override
    public XNoticeRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.TYPE</code>. 「type」- 公告类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.STATUS</code>. 「status」- 公告状态
     */
    @Override
    public XNoticeRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.STATUS</code>. 「status」- 公告状态
     */
    @Override
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.SUBJECT</code>. 「subject」- 公告标题
     */
    @Override
    public XNoticeRecord setSubject(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.SUBJECT</code>. 「subject」- 公告标题
     */
    @Override
    public String getSubject() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.CONTENT</code>. 「content」- 公告内容
     */
    @Override
    public XNoticeRecord setContent(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.CONTENT</code>. 「content」- 公告内容
     */
    @Override
    public String getContent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.EXPIRED_AT</code>. 「createdAt」-
     * 公告到期时间
     */
    @Override
    public XNoticeRecord setExpiredAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.EXPIRED_AT</code>. 「createdAt」-
     * 公告到期时间
     */
    @Override
    public LocalDateTime getExpiredAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public XNoticeRecord setAppId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XNoticeRecord setActive(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XNoticeRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XNoticeRecord setMetadata(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XNoticeRecord setLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XNoticeRecord setCreatedAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XNoticeRecord setCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XNoticeRecord setUpdatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_NOTICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XNoticeRecord setUpdatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_NOTICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, String, LocalDateTime, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, String, LocalDateTime, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return XNotice.X_NOTICE.KEY;
    }

    @Override
    public Field<String> field2() {
        return XNotice.X_NOTICE.NAME;
    }

    @Override
    public Field<String> field3() {
        return XNotice.X_NOTICE.CODE;
    }

    @Override
    public Field<String> field4() {
        return XNotice.X_NOTICE.TYPE;
    }

    @Override
    public Field<String> field5() {
        return XNotice.X_NOTICE.STATUS;
    }

    @Override
    public Field<String> field6() {
        return XNotice.X_NOTICE.SUBJECT;
    }

    @Override
    public Field<String> field7() {
        return XNotice.X_NOTICE.CONTENT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return XNotice.X_NOTICE.EXPIRED_AT;
    }

    @Override
    public Field<String> field9() {
        return XNotice.X_NOTICE.APP_ID;
    }

    @Override
    public Field<Boolean> field10() {
        return XNotice.X_NOTICE.ACTIVE;
    }

    @Override
    public Field<String> field11() {
        return XNotice.X_NOTICE.SIGMA;
    }

    @Override
    public Field<String> field12() {
        return XNotice.X_NOTICE.METADATA;
    }

    @Override
    public Field<String> field13() {
        return XNotice.X_NOTICE.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return XNotice.X_NOTICE.CREATED_AT;
    }

    @Override
    public Field<String> field15() {
        return XNotice.X_NOTICE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return XNotice.X_NOTICE.UPDATED_AT;
    }

    @Override
    public Field<String> field17() {
        return XNotice.X_NOTICE.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getSubject();
    }

    @Override
    public String component7() {
        return getContent();
    }

    @Override
    public LocalDateTime component8() {
        return getExpiredAt();
    }

    @Override
    public String component9() {
        return getAppId();
    }

    @Override
    public Boolean component10() {
        return getActive();
    }

    @Override
    public String component11() {
        return getSigma();
    }

    @Override
    public String component12() {
        return getMetadata();
    }

    @Override
    public String component13() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedAt();
    }

    @Override
    public String component15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component16() {
        return getUpdatedAt();
    }

    @Override
    public String component17() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getSubject();
    }

    @Override
    public String value7() {
        return getContent();
    }

    @Override
    public LocalDateTime value8() {
        return getExpiredAt();
    }

    @Override
    public String value9() {
        return getAppId();
    }

    @Override
    public Boolean value10() {
        return getActive();
    }

    @Override
    public String value11() {
        return getSigma();
    }

    @Override
    public String value12() {
        return getMetadata();
    }

    @Override
    public String value13() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedAt();
    }

    @Override
    public String value15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value16() {
        return getUpdatedAt();
    }

    @Override
    public String value17() {
        return getUpdatedBy();
    }

    @Override
    public XNoticeRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public XNoticeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public XNoticeRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public XNoticeRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public XNoticeRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public XNoticeRecord value6(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public XNoticeRecord value7(String value) {
        setContent(value);
        return this;
    }

    @Override
    public XNoticeRecord value8(LocalDateTime value) {
        setExpiredAt(value);
        return this;
    }

    @Override
    public XNoticeRecord value9(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public XNoticeRecord value10(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public XNoticeRecord value11(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public XNoticeRecord value12(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public XNoticeRecord value13(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public XNoticeRecord value14(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public XNoticeRecord value15(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public XNoticeRecord value16(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public XNoticeRecord value17(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public XNoticeRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, LocalDateTime value8, String value9, Boolean value10, String value11, String value12, String value13, LocalDateTime value14, String value15, LocalDateTime value16, String value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXNotice from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setSubject(from.getSubject());
        setContent(from.getContent());
        setExpiredAt(from.getExpiredAt());
        setAppId(from.getAppId());
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
    public <E extends IXNotice> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XNoticeRecord
     */
    public XNoticeRecord() {
        super(XNotice.X_NOTICE);
    }

    /**
     * Create a detached, initialised XNoticeRecord
     */
    public XNoticeRecord(String key, String name, String code, String type, String status, String subject, String content, LocalDateTime expiredAt, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XNotice.X_NOTICE);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setStatus(status);
        setSubject(subject);
        setContent(content);
        setExpiredAt(expiredAt);
        setAppId(appId);
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
     * Create a detached, initialised XNoticeRecord
     */
    public XNoticeRecord(cn.vertxup.ambient.domain.tables.pojos.XNotice value) {
        super(XNotice.X_NOTICE);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setStatus(value.getStatus());
            setSubject(value.getSubject());
            setContent(value.getContent());
            setExpiredAt(value.getExpiredAt());
            setAppId(value.getAppId());
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

        public XNoticeRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
