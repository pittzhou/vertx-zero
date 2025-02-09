/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPAmountSpec extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.KEY</code>. 「key」- 物料价目表主键
     */
    public IPAmountSpec setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.KEY</code>. 「key」- 物料价目表主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SERIAL</code>. 「serial」-
     * 物料价目表号（系统可用，直接计算）
     */
    public IPAmountSpec setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SERIAL</code>. 「serial」-
     * 物料价目表号（系统可用，直接计算）
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    public IPAmountSpec setCommodityId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_ID</code>.
     * 「commodityId」- 商品ID
     */
    public String getCommodityId();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    public IPAmountSpec setCommodityCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_CODE</code>.
     * 「commodityCode」- 商品编码
     */
    public String getCommodityCode();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    public IPAmountSpec setCommodityName(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.COMMODITY_NAME</code>.
     * 「commodityName」- 商品名称
     */
    public String getCommodityName();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.WH_ID</code>. 「whId」- 所属仓库
     */
    public IPAmountSpec setWhId(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.WH_ID</code>. 「whId」- 所属仓库
     */
    public String getWhId();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MIN</code>. 「amountMin」-
     * 定价最低
     */
    public IPAmountSpec setAmountMin(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MIN</code>. 「amountMin」-
     * 定价最低
     */
    public BigDecimal getAmountMin();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MAX</code>. 「amountMax」-
     * 定价最高
     */
    public IPAmountSpec setAmountMax(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.AMOUNT_MAX</code>. 「amountMax」-
     * 定价最高
     */
    public BigDecimal getAmountMax();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.ACTIVE</code>. 「active」- 是否启用
     */
    public IPAmountSpec setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SIGMA</code>. 「sigma」- 统一标识
     */
    public IPAmountSpec setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.METADATA</code>. 「metadata」-
     * 附加配置
     */
    public IPAmountSpec setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.METADATA</code>. 「metadata」-
     * 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IPAmountSpec setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IPAmountSpec setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IPAmountSpec setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IPAmountSpec setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IPAmountSpec setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.P_AMOUNT_SPEC.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPAmountSpec
     */
    public void from(IPAmountSpec from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPAmountSpec
     */
    public <E extends IPAmountSpec> E into(E into);

        @Override
        public default IPAmountSpec fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                setOrThrow(this::setCommodityId,json::getString,"COMMODITY_ID","java.lang.String");
                setOrThrow(this::setCommodityCode,json::getString,"COMMODITY_CODE","java.lang.String");
                setOrThrow(this::setCommodityName,json::getString,"COMMODITY_NAME","java.lang.String");
                setOrThrow(this::setWhId,json::getString,"WH_ID","java.lang.String");
                setOrThrow(this::setAmountMin,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_MIN","java.math.BigDecimal");
                setOrThrow(this::setAmountMax,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_MAX","java.math.BigDecimal");
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
                json.put("SERIAL",getSerial());
                json.put("COMMODITY_ID",getCommodityId());
                json.put("COMMODITY_CODE",getCommodityCode());
                json.put("COMMODITY_NAME",getCommodityName());
                json.put("WH_ID",getWhId());
                json.put("AMOUNT_MIN",getAmountMin()==null?null:getAmountMin().toString());
                json.put("AMOUNT_MAX",getAmountMax()==null?null:getAmountMax().toString());
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
