/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EDept;
import cn.vertxup.erp.domain.tables.interfaces.IEDept;

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
public class EDeptRecord extends UpdatableRecordImpl<EDeptRecord> implements VertxPojo, Record16<String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, IEDept {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.KEY</code>. 「key」- 部门主键
     */
    @Override
    public EDeptRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.KEY</code>. 「key」- 部门主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.NAME</code>. 「name」- 部门名称
     */
    @Override
    public EDeptRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.NAME</code>. 「name」- 部门名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.CODE</code>. 「code」- 部门编号
     */
    @Override
    public EDeptRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.CODE</code>. 「code」- 部门编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.MANAGER_ID</code>. 「managerId」- 部门经理
     */
    @Override
    public EDeptRecord setManagerId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.MANAGER_ID</code>. 「managerId」- 部门经理
     */
    @Override
    public String getManagerId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.MANAGER_NAME</code>. 「managerName」-
     * 部门名称
     */
    @Override
    public EDeptRecord setManagerName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.MANAGER_NAME</code>. 「managerName」-
     * 部门名称
     */
    @Override
    public String getManagerName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public EDeptRecord setCompanyId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public String getCompanyId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.DEPT_ID</code>. 「deptId」- 父部门
     */
    @Override
    public EDeptRecord setDeptId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.DEPT_ID</code>. 「deptId」- 父部门
     */
    @Override
    public String getDeptId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.COMMENT</code>. 「comment」- 部门备注
     */
    @Override
    public EDeptRecord setComment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.COMMENT</code>. 「comment」- 部门备注
     */
    @Override
    public String getComment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EDeptRecord setMetadata(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EDeptRecord setActive(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public EDeptRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EDeptRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EDeptRecord setCreatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EDeptRecord setCreatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EDeptRecord setUpdatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_DEPT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EDeptRecord setUpdatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_DEPT.UPDATED_BY</code>. 「updatedBy」- 更新人
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
        return EDept.E_DEPT.KEY;
    }

    @Override
    public Field<String> field2() {
        return EDept.E_DEPT.NAME;
    }

    @Override
    public Field<String> field3() {
        return EDept.E_DEPT.CODE;
    }

    @Override
    public Field<String> field4() {
        return EDept.E_DEPT.MANAGER_ID;
    }

    @Override
    public Field<String> field5() {
        return EDept.E_DEPT.MANAGER_NAME;
    }

    @Override
    public Field<String> field6() {
        return EDept.E_DEPT.COMPANY_ID;
    }

    @Override
    public Field<String> field7() {
        return EDept.E_DEPT.DEPT_ID;
    }

    @Override
    public Field<String> field8() {
        return EDept.E_DEPT.COMMENT;
    }

    @Override
    public Field<String> field9() {
        return EDept.E_DEPT.METADATA;
    }

    @Override
    public Field<Boolean> field10() {
        return EDept.E_DEPT.ACTIVE;
    }

    @Override
    public Field<String> field11() {
        return EDept.E_DEPT.SIGMA;
    }

    @Override
    public Field<String> field12() {
        return EDept.E_DEPT.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return EDept.E_DEPT.CREATED_AT;
    }

    @Override
    public Field<String> field14() {
        return EDept.E_DEPT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return EDept.E_DEPT.UPDATED_AT;
    }

    @Override
    public Field<String> field16() {
        return EDept.E_DEPT.UPDATED_BY;
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
        return getManagerId();
    }

    @Override
    public String component5() {
        return getManagerName();
    }

    @Override
    public String component6() {
        return getCompanyId();
    }

    @Override
    public String component7() {
        return getDeptId();
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
        return getManagerId();
    }

    @Override
    public String value5() {
        return getManagerName();
    }

    @Override
    public String value6() {
        return getCompanyId();
    }

    @Override
    public String value7() {
        return getDeptId();
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
    public EDeptRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public EDeptRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public EDeptRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public EDeptRecord value4(String value) {
        setManagerId(value);
        return this;
    }

    @Override
    public EDeptRecord value5(String value) {
        setManagerName(value);
        return this;
    }

    @Override
    public EDeptRecord value6(String value) {
        setCompanyId(value);
        return this;
    }

    @Override
    public EDeptRecord value7(String value) {
        setDeptId(value);
        return this;
    }

    @Override
    public EDeptRecord value8(String value) {
        setComment(value);
        return this;
    }

    @Override
    public EDeptRecord value9(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public EDeptRecord value10(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public EDeptRecord value11(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public EDeptRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDeptRecord value13(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public EDeptRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public EDeptRecord value15(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public EDeptRecord value16(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public EDeptRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, String value11, String value12, LocalDateTime value13, String value14, LocalDateTime value15, String value16) {
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
    public void from(IEDept from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setManagerId(from.getManagerId());
        setManagerName(from.getManagerName());
        setCompanyId(from.getCompanyId());
        setDeptId(from.getDeptId());
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
    public <E extends IEDept> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EDeptRecord
     */
    public EDeptRecord() {
        super(EDept.E_DEPT);
    }

    /**
     * Create a detached, initialised EDeptRecord
     */
    public EDeptRecord(String key, String name, String code, String managerId, String managerName, String companyId, String deptId, String comment, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EDept.E_DEPT);

        setKey(key);
        setName(name);
        setCode(code);
        setManagerId(managerId);
        setManagerName(managerName);
        setCompanyId(companyId);
        setDeptId(deptId);
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
     * Create a detached, initialised EDeptRecord
     */
    public EDeptRecord(cn.vertxup.erp.domain.tables.pojos.EDept value) {
        super(EDept.E_DEPT);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setManagerId(value.getManagerId());
            setManagerName(value.getManagerName());
            setCompanyId(value.getCompanyId());
            setDeptId(value.getDeptId());
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

        public EDeptRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
