/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.UiForm;
import cn.vertxup.ui.domain.tables.interfaces.IUiForm;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;
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
public class UiFormRecord extends UpdatableRecordImpl<UiFormRecord> implements VertxPojo, Record16<String, String, String, BigDecimal, Integer, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IUiForm {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.KEY</code>. 「key」- 主键
     */
    @Override
    public UiFormRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.NAME</code>. 「name」- 表单名称
     */
    @Override
    public UiFormRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.NAME</code>. 「name」- 表单名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.CODE</code>. 「code」- 表单系统编码
     */
    @Override
    public UiFormRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.CODE</code>. 「code」- 表单系统编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.WINDOW</code>. 「window」- window,
     * Form对应的窗口配置
     */
    @Override
    public UiFormRecord setWindow(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.WINDOW</code>. 「window」- window,
     * Form对应的窗口配置
     */
    @Override
    public BigDecimal getWindow() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.COLUMNS</code>. 「columns」- columns,
     * Form对应的配置
     */
    @Override
    public UiFormRecord setColumns(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.COLUMNS</code>. 「columns」- columns,
     * Form对应的配置
     */
    @Override
    public Integer getColumns() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.HIDDEN</code>. 「hidden」- 隐藏字段专用配置
     */
    @Override
    public UiFormRecord setHidden(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.HIDDEN</code>. 「hidden」- 隐藏字段专用配置
     */
    @Override
    public String getHidden() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.ROW</code>. 「rowConfig/rowClass」-
     * 行专用配置
     */
    @Override
    public UiFormRecord setRow(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.ROW</code>. 「rowConfig/rowClass」-
     * 行专用配置
     */
    @Override
    public String getRow() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.IDENTIFIER</code>. 「identifier」-
     * 表单所属的模型ID
     */
    @Override
    public UiFormRecord setIdentifier(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.IDENTIFIER</code>. 「identifier」-
     * 表单所属的模型ID
     */
    @Override
    public String getIdentifier() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiFormRecord setActive(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public UiFormRecord setSigma(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public UiFormRecord setMetadata(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiFormRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public UiFormRecord setCreatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiFormRecord setCreatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public UiFormRecord setUpdatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_FORM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiFormRecord setUpdatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_FORM.UPDATED_BY</code>. 「updatedBy」- 更新人
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
    public Row16<String, String, String, BigDecimal, Integer, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, String, String, BigDecimal, Integer, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UiForm.UI_FORM.KEY;
    }

    @Override
    public Field<String> field2() {
        return UiForm.UI_FORM.NAME;
    }

    @Override
    public Field<String> field3() {
        return UiForm.UI_FORM.CODE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return UiForm.UI_FORM.WINDOW;
    }

    @Override
    public Field<Integer> field5() {
        return UiForm.UI_FORM.COLUMNS;
    }

    @Override
    public Field<String> field6() {
        return UiForm.UI_FORM.HIDDEN;
    }

    @Override
    public Field<String> field7() {
        return UiForm.UI_FORM.ROW;
    }

    @Override
    public Field<String> field8() {
        return UiForm.UI_FORM.IDENTIFIER;
    }

    @Override
    public Field<Boolean> field9() {
        return UiForm.UI_FORM.ACTIVE;
    }

    @Override
    public Field<String> field10() {
        return UiForm.UI_FORM.SIGMA;
    }

    @Override
    public Field<String> field11() {
        return UiForm.UI_FORM.METADATA;
    }

    @Override
    public Field<String> field12() {
        return UiForm.UI_FORM.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return UiForm.UI_FORM.CREATED_AT;
    }

    @Override
    public Field<String> field14() {
        return UiForm.UI_FORM.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return UiForm.UI_FORM.UPDATED_AT;
    }

    @Override
    public Field<String> field16() {
        return UiForm.UI_FORM.UPDATED_BY;
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
    public BigDecimal component4() {
        return getWindow();
    }

    @Override
    public Integer component5() {
        return getColumns();
    }

    @Override
    public String component6() {
        return getHidden();
    }

    @Override
    public String component7() {
        return getRow();
    }

    @Override
    public String component8() {
        return getIdentifier();
    }

    @Override
    public Boolean component9() {
        return getActive();
    }

    @Override
    public String component10() {
        return getSigma();
    }

    @Override
    public String component11() {
        return getMetadata();
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
    public BigDecimal value4() {
        return getWindow();
    }

    @Override
    public Integer value5() {
        return getColumns();
    }

    @Override
    public String value6() {
        return getHidden();
    }

    @Override
    public String value7() {
        return getRow();
    }

    @Override
    public String value8() {
        return getIdentifier();
    }

    @Override
    public Boolean value9() {
        return getActive();
    }

    @Override
    public String value10() {
        return getSigma();
    }

    @Override
    public String value11() {
        return getMetadata();
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
    public UiFormRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public UiFormRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UiFormRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public UiFormRecord value4(BigDecimal value) {
        setWindow(value);
        return this;
    }

    @Override
    public UiFormRecord value5(Integer value) {
        setColumns(value);
        return this;
    }

    @Override
    public UiFormRecord value6(String value) {
        setHidden(value);
        return this;
    }

    @Override
    public UiFormRecord value7(String value) {
        setRow(value);
        return this;
    }

    @Override
    public UiFormRecord value8(String value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public UiFormRecord value9(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public UiFormRecord value10(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public UiFormRecord value11(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public UiFormRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public UiFormRecord value13(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UiFormRecord value14(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public UiFormRecord value15(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public UiFormRecord value16(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public UiFormRecord values(String value1, String value2, String value3, BigDecimal value4, Integer value5, String value6, String value7, String value8, Boolean value9, String value10, String value11, String value12, LocalDateTime value13, String value14, LocalDateTime value15, String value16) {
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
    public void from(IUiForm from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setWindow(from.getWindow());
        setColumns(from.getColumns());
        setHidden(from.getHidden());
        setRow(from.getRow());
        setIdentifier(from.getIdentifier());
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
    public <E extends IUiForm> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UiFormRecord
     */
    public UiFormRecord() {
        super(UiForm.UI_FORM);
    }

    /**
     * Create a detached, initialised UiFormRecord
     */
    public UiFormRecord(String key, String name, String code, BigDecimal window, Integer columns, String hidden, String row, String identifier, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiForm.UI_FORM);

        setKey(key);
        setName(name);
        setCode(code);
        setWindow(window);
        setColumns(columns);
        setHidden(hidden);
        setRow(row);
        setIdentifier(identifier);
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
     * Create a detached, initialised UiFormRecord
     */
    public UiFormRecord(cn.vertxup.ui.domain.tables.pojos.UiForm value) {
        super(UiForm.UI_FORM);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setWindow(value.getWindow());
            setColumns(value.getColumns());
            setHidden(value.getHidden());
            setRow(value.getRow());
            setIdentifier(value.getIdentifier());
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

        public UiFormRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
