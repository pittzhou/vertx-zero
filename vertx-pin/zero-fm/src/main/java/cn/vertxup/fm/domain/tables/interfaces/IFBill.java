/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFBill extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.KEY</code>. 「key」- 账单主键
     */
    public IFBill setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.KEY</code>. 「key」- 账单主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.NAME</code>. 「name」- 账单标题
     */
    public IFBill setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.NAME</code>. 「name」- 账单标题
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.CODE</code>. 「code」- 账单系统编号
     */
    public IFBill setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.CODE</code>. 「code」- 账单系统编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.SERIAL</code>. 「serial」- 账单流水线号
     */
    public IFBill setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.SERIAL</code>. 「serial」- 账单流水线号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.TYPE</code>. 「type」- 账单类型
     */
    public IFBill setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.TYPE</code>. 「type」- 账单类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.CATEGORY</code>. 「category」- 账单类别
     */
    public IFBill setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.CATEGORY</code>. 「category」- 账单类别
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.AMOUNT</code>. 「amount」- 账单金额
     */
    public IFBill setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.AMOUNT</code>. 「amount」- 账单金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.INCOME</code>. 「income」- true =
     * 消费类，false = 付款类
     */
    public IFBill setIncome(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.INCOME</code>. 「income」- true =
     * 消费类，false = 付款类
     */
    public Boolean getIncome();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.COMMENT</code>. 「comment」 - 账单备注
     */
    public IFBill setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.COMMENT</code>. 「comment」 - 账单备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public IFBill setOrderId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public String getOrderId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.BOOK_ID</code>. 「bookId」- 关联账本ID
     */
    public IFBill setBookId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.BOOK_ID</code>. 「bookId」- 关联账本ID
     */
    public String getBookId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFBill setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFBill setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.ACTIVE</code>. 「active」- 是否启用
     */
    public IFBill setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFBill setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFBill setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFBill setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFBill setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFBill setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFBill
     */
    public void from(IFBill from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFBill
     */
    public <E extends IFBill> E into(E into);

        @Override
        public default IFBill fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setCategory,json::getString,"CATEGORY","java.lang.String");
                // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
                setOrThrow(this::setIncome,json::getBoolean,"INCOME","java.lang.Boolean");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setOrderId,json::getString,"ORDER_ID","java.lang.String");
                setOrThrow(this::setBookId,json::getString,"BOOK_ID","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("SERIAL",getSerial());
                json.put("TYPE",getType());
                json.put("CATEGORY",getCategory());
                // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
                json.put("INCOME",getIncome());
                json.put("COMMENT",getComment());
                json.put("ORDER_ID",getOrderId());
                json.put("BOOK_ID",getBookId());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
