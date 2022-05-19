/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.ETeam;
import cn.vertxup.erp.domain.tables.interfaces.IETeam;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ETeamRecord extends UpdatableRecordImpl<ETeamRecord> implements VertxPojo, Record16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, IETeam {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.KEY</code>. 「key」- 组主键
     */
    @Override
    public ETeamRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.KEY</code>. 「key」- 组主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.NAME</code>. 「name」- 组名称
     */
    @Override
    public ETeamRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.NAME</code>. 「name」- 组名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CODE</code>. 「code」- 组编号
     */
    @Override
    public ETeamRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CODE</code>. 「code」- 组编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    @Override
    public ETeamRecord setLeaderId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LEADER_ID</code>. 「leaderId」- 组长
     */
    @Override
    public String getLeaderId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    @Override
    public ETeamRecord setLeaderName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LEADER_NAME</code>. 「leaderName」- 组长姓名
     */
    @Override
    public String getLeaderName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public ETeamRecord setDeptId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public String getDeptId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    @Override
    public ETeamRecord setTeamId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.TEAM_ID</code>. 「teamId」- 父组ID
     */
    @Override
    public String getTeamId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    @Override
    public ETeamRecord setComment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.COMMENT</code>. 「comment」- 组备注
     */
    @Override
    public String getComment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public ETeamRecord setMetadata(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public ETeamRecord setActive(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public ETeamRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public ETeamRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public ETeamRecord setCreatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public ETeamRecord setCreatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public ETeamRecord setUpdatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public ETeamRecord setUpdatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_TEAM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ETeam.E_TEAM.KEY;
    }

    @Override
    public Field<String> field2() {
        return ETeam.E_TEAM.NAME;
    }

    @Override
    public Field<String> field3() {
        return ETeam.E_TEAM.CODE;
    }

    @Override
    public Field<String> field4() {
        return ETeam.E_TEAM.LEADER_ID;
    }

    @Override
    public Field<String> field5() {
        return ETeam.E_TEAM.LEADER_NAME;
    }

    @Override
    public Field<String> field6() {
        return ETeam.E_TEAM.DEPT_ID;
    }

    @Override
    public Field<String> field7() {
        return ETeam.E_TEAM.TEAM_ID;
    }

    @Override
    public Field<String> field8() {
        return ETeam.E_TEAM.COMMENT;
    }

    @Override
    public Field<String> field9() {
        return ETeam.E_TEAM.METADATA;
    }

    @Override
    public Field<Boolean> field10() {
        return ETeam.E_TEAM.ACTIVE;
    }

    @Override
    public Field<String> field11() {
        return ETeam.E_TEAM.SIGMA;
    }

    @Override
    public Field<String> field12() {
        return ETeam.E_TEAM.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return ETeam.E_TEAM.CREATED_AT;
    }

    @Override
    public Field<String> field14() {
        return ETeam.E_TEAM.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return ETeam.E_TEAM.UPDATED_AT;
    }

    @Override
    public Field<String> field16() {
        return ETeam.E_TEAM.UPDATED_BY;
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
        return getLeaderId();
    }

    @Override
    public String component5() {
        return getLeaderName();
    }

    @Override
    public String component6() {
        return getDeptId();
    }

    @Override
    public String component7() {
        return getTeamId();
    }

    @Override
    public String component8() {
        return getComment();
    }

    @Override
    public String component9() {
        return getMetadata();
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
        return getLanguage();
    }

    @Override
    public LocalDateTime component13() {
        return getCreatedAt();
    }

    @Override
    public String component14() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component15() {
        return getUpdatedAt();
    }

    @Override
    public String component16() {
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
        return getLeaderId();
    }

    @Override
    public String value5() {
        return getLeaderName();
    }

    @Override
    public String value6() {
        return getDeptId();
    }

    @Override
    public String value7() {
        return getTeamId();
    }

    @Override
    public String value8() {
        return getComment();
    }

    @Override
    public String value9() {
        return getMetadata();
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
        return getLanguage();
    }

    @Override
    public LocalDateTime value13() {
        return getCreatedAt();
    }

    @Override
    public String value14() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value15() {
        return getUpdatedAt();
    }

    @Override
    public String value16() {
        return getUpdatedBy();
    }

    @Override
    public ETeamRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public ETeamRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ETeamRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public ETeamRecord value4(String value) {
        setLeaderId(value);
        return this;
    }

    @Override
    public ETeamRecord value5(String value) {
        setLeaderName(value);
        return this;
    }

    @Override
    public ETeamRecord value6(String value) {
        setDeptId(value);
        return this;
    }

    @Override
    public ETeamRecord value7(String value) {
        setTeamId(value);
        return this;
    }

    @Override
    public ETeamRecord value8(String value) {
        setComment(value);
        return this;
    }

    @Override
    public ETeamRecord value9(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public ETeamRecord value10(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public ETeamRecord value11(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public ETeamRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ETeamRecord value13(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ETeamRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ETeamRecord value15(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public ETeamRecord value16(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public ETeamRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, String value11, String value12, LocalDateTime value13, String value14, LocalDateTime value15, String value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IETeam from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setLeaderId(from.getLeaderId());
        setLeaderName(from.getLeaderName());
        setDeptId(from.getDeptId());
        setTeamId(from.getTeamId());
        setComment(from.getComment());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IETeam> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ETeamRecord
     */
    public ETeamRecord() {
        super(ETeam.E_TEAM);
    }

    /**
     * Create a detached, initialised ETeamRecord
     */
    public ETeamRecord(String key, String name, String code, String leaderId, String leaderName, String deptId, String teamId, String comment, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(ETeam.E_TEAM);

        setKey(key);
        setName(name);
        setCode(code);
        setLeaderId(leaderId);
        setLeaderName(leaderName);
        setDeptId(deptId);
        setTeamId(teamId);
        setComment(comment);
        setMetadata(metadata);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised ETeamRecord
     */
    public ETeamRecord(cn.vertxup.erp.domain.tables.pojos.ETeam value) {
        super(ETeam.E_TEAM);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setLeaderId(value.getLeaderId());
            setLeaderName(value.getLeaderName());
            setDeptId(value.getDeptId());
            setTeamId(value.getTeamId());
            setComment(value.getComment());
            setMetadata(value.getMetadata());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public ETeamRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
