/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XEmailServer;
import cn.vertxup.ambient.domain.tables.interfaces.IXEmailServer;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XEmailServerRecord extends UpdatableRecordImpl<XEmailServerRecord> implements VertxPojo, Record19<String, String, String, String, String, Integer, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IXEmailServer {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.KEY</code>. 「key」- 邮件服务器主键
     */
    @Override
    public XEmailServerRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.KEY</code>. 「key」- 邮件服务器主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.NAME</code>. 「name」- 邮件服务器名称
     */
    @Override
    public XEmailServerRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.NAME</code>. 「name」- 邮件服务器名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public XEmailServerRecord setIpV4(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public String getIpV4() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public XEmailServerRecord setIpV6(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public String getIpV6() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public XEmailServerRecord setHostname(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public String getHostname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.PORT</code>. 「port」- 端口号
     */
    @Override
    public XEmailServerRecord setPort(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.PORT</code>. 「port」- 端口号
     */
    @Override
    public Integer getPort() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.PROTOCOL</code>.
     * 「protocol」协议类型,POP3, STMP 等
     */
    @Override
    public XEmailServerRecord setProtocol(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.PROTOCOL</code>.
     * 「protocol」协议类型,POP3, STMP 等
     */
    @Override
    public String getProtocol() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.SENDER</code>. 「sender」- 发送者账号
     */
    @Override
    public XEmailServerRecord setSender(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.SENDER</code>. 「sender」- 发送者账号
     */
    @Override
    public String getSender() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.PASSWORD</code>. 「password」-
     * 口令
     */
    @Override
    public XEmailServerRecord setPassword(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.PASSWORD</code>. 「password」-
     * 口令
     */
    @Override
    public String getPassword() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.OPTIONS</code>. 「options」-
     * 连接字符串中的配置key=value
     */
    @Override
    public XEmailServerRecord setOptions(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.OPTIONS</code>. 「options」-
     * 连接字符串中的配置key=value
     */
    @Override
    public String getOptions() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public XEmailServerRecord setAppId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XEmailServerRecord setActive(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XEmailServerRecord setSigma(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public XEmailServerRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public XEmailServerRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public XEmailServerRecord setCreatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public XEmailServerRecord setCreatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public XEmailServerRecord setUpdatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_EMAIL_SERVER.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public XEmailServerRecord setUpdatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_EMAIL_SERVER.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, Integer, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<String, String, String, String, String, Integer, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return XEmailServer.X_EMAIL_SERVER.KEY;
    }

    @Override
    public Field<String> field2() {
        return XEmailServer.X_EMAIL_SERVER.NAME;
    }

    @Override
    public Field<String> field3() {
        return XEmailServer.X_EMAIL_SERVER.IP_V4;
    }

    @Override
    public Field<String> field4() {
        return XEmailServer.X_EMAIL_SERVER.IP_V6;
    }

    @Override
    public Field<String> field5() {
        return XEmailServer.X_EMAIL_SERVER.HOSTNAME;
    }

    @Override
    public Field<Integer> field6() {
        return XEmailServer.X_EMAIL_SERVER.PORT;
    }

    @Override
    public Field<String> field7() {
        return XEmailServer.X_EMAIL_SERVER.PROTOCOL;
    }

    @Override
    public Field<String> field8() {
        return XEmailServer.X_EMAIL_SERVER.SENDER;
    }

    @Override
    public Field<String> field9() {
        return XEmailServer.X_EMAIL_SERVER.PASSWORD;
    }

    @Override
    public Field<String> field10() {
        return XEmailServer.X_EMAIL_SERVER.OPTIONS;
    }

    @Override
    public Field<String> field11() {
        return XEmailServer.X_EMAIL_SERVER.APP_ID;
    }

    @Override
    public Field<Boolean> field12() {
        return XEmailServer.X_EMAIL_SERVER.ACTIVE;
    }

    @Override
    public Field<String> field13() {
        return XEmailServer.X_EMAIL_SERVER.SIGMA;
    }

    @Override
    public Field<String> field14() {
        return XEmailServer.X_EMAIL_SERVER.METADATA;
    }

    @Override
    public Field<String> field15() {
        return XEmailServer.X_EMAIL_SERVER.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return XEmailServer.X_EMAIL_SERVER.CREATED_AT;
    }

    @Override
    public Field<String> field17() {
        return XEmailServer.X_EMAIL_SERVER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return XEmailServer.X_EMAIL_SERVER.UPDATED_AT;
    }

    @Override
    public Field<String> field19() {
        return XEmailServer.X_EMAIL_SERVER.UPDATED_BY;
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
        return getIpV4();
    }

    @Override
    public String component4() {
        return getIpV6();
    }

    @Override
    public String component5() {
        return getHostname();
    }

    @Override
    public Integer component6() {
        return getPort();
    }

    @Override
    public String component7() {
        return getProtocol();
    }

    @Override
    public String component8() {
        return getSender();
    }

    @Override
    public String component9() {
        return getPassword();
    }

    @Override
    public String component10() {
        return getOptions();
    }

    @Override
    public String component11() {
        return getAppId();
    }

    @Override
    public Boolean component12() {
        return getActive();
    }

    @Override
    public String component13() {
        return getSigma();
    }

    @Override
    public String component14() {
        return getMetadata();
    }

    @Override
    public String component15() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component16() {
        return getCreatedAt();
    }

    @Override
    public String component17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component18() {
        return getUpdatedAt();
    }

    @Override
    public String component19() {
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
        return getIpV4();
    }

    @Override
    public String value4() {
        return getIpV6();
    }

    @Override
    public String value5() {
        return getHostname();
    }

    @Override
    public Integer value6() {
        return getPort();
    }

    @Override
    public String value7() {
        return getProtocol();
    }

    @Override
    public String value8() {
        return getSender();
    }

    @Override
    public String value9() {
        return getPassword();
    }

    @Override
    public String value10() {
        return getOptions();
    }

    @Override
    public String value11() {
        return getAppId();
    }

    @Override
    public Boolean value12() {
        return getActive();
    }

    @Override
    public String value13() {
        return getSigma();
    }

    @Override
    public String value14() {
        return getMetadata();
    }

    @Override
    public String value15() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value16() {
        return getCreatedAt();
    }

    @Override
    public String value17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value18() {
        return getUpdatedAt();
    }

    @Override
    public String value19() {
        return getUpdatedBy();
    }

    @Override
    public XEmailServerRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public XEmailServerRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public XEmailServerRecord value3(String value) {
        setIpV4(value);
        return this;
    }

    @Override
    public XEmailServerRecord value4(String value) {
        setIpV6(value);
        return this;
    }

    @Override
    public XEmailServerRecord value5(String value) {
        setHostname(value);
        return this;
    }

    @Override
    public XEmailServerRecord value6(Integer value) {
        setPort(value);
        return this;
    }

    @Override
    public XEmailServerRecord value7(String value) {
        setProtocol(value);
        return this;
    }

    @Override
    public XEmailServerRecord value8(String value) {
        setSender(value);
        return this;
    }

    @Override
    public XEmailServerRecord value9(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public XEmailServerRecord value10(String value) {
        setOptions(value);
        return this;
    }

    @Override
    public XEmailServerRecord value11(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public XEmailServerRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public XEmailServerRecord value13(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public XEmailServerRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public XEmailServerRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public XEmailServerRecord value16(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public XEmailServerRecord value17(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public XEmailServerRecord value18(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public XEmailServerRecord value19(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public XEmailServerRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, String value13, String value14, String value15, LocalDateTime value16, String value17, LocalDateTime value18, String value19) {
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
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXEmailServer from) {
        setKey(from.getKey());
        setName(from.getName());
        setIpV4(from.getIpV4());
        setIpV6(from.getIpV6());
        setHostname(from.getHostname());
        setPort(from.getPort());
        setProtocol(from.getProtocol());
        setSender(from.getSender());
        setPassword(from.getPassword());
        setOptions(from.getOptions());
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
    public <E extends IXEmailServer> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XEmailServerRecord
     */
    public XEmailServerRecord() {
        super(XEmailServer.X_EMAIL_SERVER);
    }

    /**
     * Create a detached, initialised XEmailServerRecord
     */
    public XEmailServerRecord(String key, String name, String ipV4, String ipV6, String hostname, Integer port, String protocol, String sender, String password, String options, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XEmailServer.X_EMAIL_SERVER);

        setKey(key);
        setName(name);
        setIpV4(ipV4);
        setIpV6(ipV6);
        setHostname(hostname);
        setPort(port);
        setProtocol(protocol);
        setSender(sender);
        setPassword(password);
        setOptions(options);
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
     * Create a detached, initialised XEmailServerRecord
     */
    public XEmailServerRecord(cn.vertxup.ambient.domain.tables.pojos.XEmailServer value) {
        super(XEmailServer.X_EMAIL_SERVER);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setIpV4(value.getIpV4());
            setIpV6(value.getIpV6());
            setHostname(value.getHostname());
            setPort(value.getPort());
            setProtocol(value.getProtocol());
            setSender(value.getSender());
            setPassword(value.getPassword());
            setOptions(value.getOptions());
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

        public XEmailServerRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
