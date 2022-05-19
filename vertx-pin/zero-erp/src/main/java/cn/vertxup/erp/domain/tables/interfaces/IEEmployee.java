/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IEEmployee extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    public IEEmployee setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    public IEEmployee setCompanyId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」-
     * 所属公司
     */
    public String getCompanyId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public IEEmployee setDeptId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    public String getDeptId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    public IEEmployee setTeamId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    public String getTeamId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」-
     * 关联档案
     */
    public IEEmployee setIdentityId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」-
     * 关联档案
     */
    public String getIdentityId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    public IEEmployee setViceName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    public String getViceName();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」-
     * 员工邮箱
     */
    public IEEmployee setViceEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」-
     * 员工邮箱
     */
    public String getViceEmail();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」-
     * 员工手机
     */
    public IEEmployee setViceMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」-
     * 员工手机
     */
    public String getViceMobile();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」-
     * 工号
     */
    public IEEmployee setWorkNumber(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」-
     * 工号
     */
    public String getWorkNumber();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    public IEEmployee setWorkTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    public String getWorkTitle();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>.
     * 「workLocation」- 办公地点
     */
    public IEEmployee setWorkLocation(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>.
     * 「workLocation」- 办公地点
     */
    public String getWorkLocation();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」-
     * 办公电话
     */
    public IEEmployee setWorkPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」-
     * 办公电话
     */
    public String getWorkPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>.
     * 「workExtension」- 分机号
     */
    public IEEmployee setWorkExtension(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>.
     * 「workExtension」- 分机号
     */
    public String getWorkExtension();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_HIRE_AT</code>. 「workHireAt」-
     * 入职时间
     */
    public IEEmployee setWorkHireAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_HIRE_AT</code>. 「workHireAt」-
     * 入职时间
     */
    public LocalDateTime getWorkHireAt();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_ID</code>. 「bankId」- 开户行
     */
    public IEEmployee setBankId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_ID</code>. 「bankId」- 开户行
     */
    public String getBankId();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_CARD</code>. 「bankCard」-
     * 开户行账号
     */
    public IEEmployee setBankCard(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.BANK_CARD</code>. 「bankCard」-
     * 开户行账号
     */
    public String getBankCard();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    public IEEmployee setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.STATUS</code>. 「status」- 员工状态
     */
    public IEEmployee setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.STATUS</code>. 「status」- 员工状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    public IEEmployee setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    public IEEmployee setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」-
     * 统一标识（公司所属应用）
     */
    public IEEmployee setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」-
     * 统一标识（公司所属应用）
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IEEmployee setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IEEmployee setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IEEmployee setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IEEmployee setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IEEmployee setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IEEmployee
     */
    public void from(IEEmployee from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IEEmployee
     */
    public <E extends IEEmployee> E into(E into);

        @Override
        public default IEEmployee fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCompanyId,json::getString,"COMPANY_ID","java.lang.String");
                setOrThrow(this::setDeptId,json::getString,"DEPT_ID","java.lang.String");
                setOrThrow(this::setTeamId,json::getString,"TEAM_ID","java.lang.String");
                setOrThrow(this::setIdentityId,json::getString,"IDENTITY_ID","java.lang.String");
                setOrThrow(this::setViceName,json::getString,"VICE_NAME","java.lang.String");
                setOrThrow(this::setViceEmail,json::getString,"VICE_EMAIL","java.lang.String");
                setOrThrow(this::setViceMobile,json::getString,"VICE_MOBILE","java.lang.String");
                setOrThrow(this::setWorkNumber,json::getString,"WORK_NUMBER","java.lang.String");
                setOrThrow(this::setWorkTitle,json::getString,"WORK_TITLE","java.lang.String");
                setOrThrow(this::setWorkLocation,json::getString,"WORK_LOCATION","java.lang.String");
                setOrThrow(this::setWorkPhone,json::getString,"WORK_PHONE","java.lang.String");
                setOrThrow(this::setWorkExtension,json::getString,"WORK_EXTENSION","java.lang.String");
                setOrThrow(this::setWorkHireAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"WORK_HIRE_AT","java.time.LocalDateTime");
                setOrThrow(this::setBankId,json::getString,"BANK_ID","java.lang.String");
                setOrThrow(this::setBankCard,json::getString,"BANK_CARD","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
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
                json.put("COMPANY_ID",getCompanyId());
                json.put("DEPT_ID",getDeptId());
                json.put("TEAM_ID",getTeamId());
                json.put("IDENTITY_ID",getIdentityId());
                json.put("VICE_NAME",getViceName());
                json.put("VICE_EMAIL",getViceEmail());
                json.put("VICE_MOBILE",getViceMobile());
                json.put("WORK_NUMBER",getWorkNumber());
                json.put("WORK_TITLE",getWorkTitle());
                json.put("WORK_LOCATION",getWorkLocation());
                json.put("WORK_PHONE",getWorkPhone());
                json.put("WORK_EXTENSION",getWorkExtension());
                json.put("WORK_HIRE_AT",getWorkHireAt()==null?null:getWorkHireAt().toString());
                json.put("BANK_ID",getBankId());
                json.put("BANK_CARD",getBankCard());
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("METADATA",getMetadata());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
