/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.records;


import cn.vertxup.graphic.domain.tables.GCluster;
import cn.vertxup.graphic.domain.tables.interfaces.IGCluster;

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
public class GClusterRecord extends UpdatableRecordImpl<GClusterRecord> implements VertxPojo, Record16<String, String, Integer, Integer, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IGCluster {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.KEY</code>. 「key」- 组ID
     */
    @Override
    public GClusterRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.KEY</code>. 「key」- 组ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.NAME</code>. 「name」- 组呈现名称
     */
    @Override
    public GClusterRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.NAME</code>. 「name」- 组呈现名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.X</code>. 「x」- 当前组在图上的x坐标
     */
    @Override
    public GClusterRecord setX(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.X</code>. 「x」- 当前组在图上的x坐标
     */
    @Override
    public Integer getX() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.Y</code>. 「y」- 当前组在图上的y坐标
     */
    @Override
    public GClusterRecord setY(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.Y</code>. 「y」- 当前组在图上的y坐标
     */
    @Override
    public Integer getY() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.GRAPHIC_ID</code>. 「graphicId」-
     * 它所关联的图实例ID
     */
    @Override
    public GClusterRecord setGraphicId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.GRAPHIC_ID</code>. 「graphicId」-
     * 它所关联的图实例ID
     */
    @Override
    public String getGraphicId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public GClusterRecord setUi(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public String getUi() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.RECORD_KEY</code>. 「recordKey」-
     * 记录主键
     */
    @Override
    public GClusterRecord setRecordKey(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.RECORD_KEY</code>. 「recordKey」-
     * 记录主键
     */
    @Override
    public String getRecordKey() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.RECORD_DATA</code>. 「recordData」-
     * 组中存储的数据信息
     */
    @Override
    public GClusterRecord setRecordData(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.RECORD_DATA</code>. 「recordData」-
     * 组中存储的数据信息
     */
    @Override
    public String getRecordData() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public GClusterRecord setSigma(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public GClusterRecord setLanguage(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public GClusterRecord setActive(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public GClusterRecord setMetadata(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public GClusterRecord setCreatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public GClusterRecord setCreatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public GClusterRecord setUpdatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public GClusterRecord setUpdatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_CLUSTER.UPDATED_BY</code>. 「updatedBy」- 更新人
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
    public Row16<String, String, Integer, Integer, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, String, Integer, Integer, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GCluster.G_CLUSTER.KEY;
    }

    @Override
    public Field<String> field2() {
        return GCluster.G_CLUSTER.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return GCluster.G_CLUSTER.X;
    }

    @Override
    public Field<Integer> field4() {
        return GCluster.G_CLUSTER.Y;
    }

    @Override
    public Field<String> field5() {
        return GCluster.G_CLUSTER.GRAPHIC_ID;
    }

    @Override
    public Field<String> field6() {
        return GCluster.G_CLUSTER.UI;
    }

    @Override
    public Field<String> field7() {
        return GCluster.G_CLUSTER.RECORD_KEY;
    }

    @Override
    public Field<String> field8() {
        return GCluster.G_CLUSTER.RECORD_DATA;
    }

    @Override
    public Field<String> field9() {
        return GCluster.G_CLUSTER.SIGMA;
    }

    @Override
    public Field<String> field10() {
        return GCluster.G_CLUSTER.LANGUAGE;
    }

    @Override
    public Field<Boolean> field11() {
        return GCluster.G_CLUSTER.ACTIVE;
    }

    @Override
    public Field<String> field12() {
        return GCluster.G_CLUSTER.METADATA;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return GCluster.G_CLUSTER.CREATED_AT;
    }

    @Override
    public Field<String> field14() {
        return GCluster.G_CLUSTER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return GCluster.G_CLUSTER.UPDATED_AT;
    }

    @Override
    public Field<String> field16() {
        return GCluster.G_CLUSTER.UPDATED_BY;
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
    public Integer component3() {
        return getX();
    }

    @Override
    public Integer component4() {
        return getY();
    }

    @Override
    public String component5() {
        return getGraphicId();
    }

    @Override
    public String component6() {
        return getUi();
    }

    @Override
    public String component7() {
        return getRecordKey();
    }

    @Override
    public String component8() {
        return getRecordData();
    }

    @Override
    public String component9() {
        return getSigma();
    }

    @Override
    public String component10() {
        return getLanguage();
    }

    @Override
    public Boolean component11() {
        return getActive();
    }

    @Override
    public String component12() {
        return getMetadata();
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
    public Integer value3() {
        return getX();
    }

    @Override
    public Integer value4() {
        return getY();
    }

    @Override
    public String value5() {
        return getGraphicId();
    }

    @Override
    public String value6() {
        return getUi();
    }

    @Override
    public String value7() {
        return getRecordKey();
    }

    @Override
    public String value8() {
        return getRecordData();
    }

    @Override
    public String value9() {
        return getSigma();
    }

    @Override
    public String value10() {
        return getLanguage();
    }

    @Override
    public Boolean value11() {
        return getActive();
    }

    @Override
    public String value12() {
        return getMetadata();
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
    public GClusterRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public GClusterRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GClusterRecord value3(Integer value) {
        setX(value);
        return this;
    }

    @Override
    public GClusterRecord value4(Integer value) {
        setY(value);
        return this;
    }

    @Override
    public GClusterRecord value5(String value) {
        setGraphicId(value);
        return this;
    }

    @Override
    public GClusterRecord value6(String value) {
        setUi(value);
        return this;
    }

    @Override
    public GClusterRecord value7(String value) {
        setRecordKey(value);
        return this;
    }

    @Override
    public GClusterRecord value8(String value) {
        setRecordData(value);
        return this;
    }

    @Override
    public GClusterRecord value9(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public GClusterRecord value10(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public GClusterRecord value11(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public GClusterRecord value12(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public GClusterRecord value13(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public GClusterRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GClusterRecord value15(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public GClusterRecord value16(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public GClusterRecord values(String value1, String value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10, Boolean value11, String value12, LocalDateTime value13, String value14, LocalDateTime value15, String value16) {
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
    public void from(IGCluster from) {
        setKey(from.getKey());
        setName(from.getName());
        setX(from.getX());
        setY(from.getY());
        setGraphicId(from.getGraphicId());
        setUi(from.getUi());
        setRecordKey(from.getRecordKey());
        setRecordData(from.getRecordData());
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
    public <E extends IGCluster> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GClusterRecord
     */
    public GClusterRecord() {
        super(GCluster.G_CLUSTER);
    }

    /**
     * Create a detached, initialised GClusterRecord
     */
    public GClusterRecord(String key, String name, Integer x, Integer y, String graphicId, String ui, String recordKey, String recordData, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(GCluster.G_CLUSTER);

        setKey(key);
        setName(name);
        setX(x);
        setY(y);
        setGraphicId(graphicId);
        setUi(ui);
        setRecordKey(recordKey);
        setRecordData(recordData);
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
     * Create a detached, initialised GClusterRecord
     */
    public GClusterRecord(cn.vertxup.graphic.domain.tables.pojos.GCluster value) {
        super(GCluster.G_CLUSTER);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setX(value.getX());
            setY(value.getY());
            setGraphicId(value.getGraphicId());
            setUi(value.getUi());
            setRecordKey(value.getRecordKey());
            setRecordData(value.getRecordData());
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

        public GClusterRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
