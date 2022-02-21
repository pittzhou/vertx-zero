/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables;


import cn.vertxup.workflow.domain.Db;
import cn.vertxup.workflow.domain.Keys;
import cn.vertxup.workflow.domain.tables.records.TAssetOutRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TAssetOut extends TableImpl<TAssetOutRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.T_ASSET_OUT</code>
     */
    public static final TAssetOut T_ASSET_OUT = new TAssetOut();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.T_ASSET_OUT.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    public final TableField<TAssetOutRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 单据主键（主单主键Join模式）");
    /**
     * The column <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_OUT</code>. 「commentOut」-
     * 出库备注
     */
    public final TableField<TAssetOutRecord, String> COMMENT_OUT = createField(DSL.name("COMMENT_OUT"), SQLDataType.CLOB, this, "「commentOut」- 出库备注");
    /**
     * The column <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_USAGE</code>.
     * 「commentUsage」- 出库使用说明
     */
    public final TableField<TAssetOutRecord, String> COMMENT_USAGE = createField(DSL.name("COMMENT_USAGE"), SQLDataType.CLOB, this, "「commentUsage」- 出库使用说明");

    private TAssetOut(Name alias, Table<TAssetOutRecord> aliased) {
        this(alias, aliased, null);
    }

    private TAssetOut(Name alias, Table<TAssetOutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.T_ASSET_OUT</code> table reference
     */
    public TAssetOut(String alias) {
        this(DSL.name(alias), T_ASSET_OUT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.T_ASSET_OUT</code> table reference
     */
    public TAssetOut(Name alias) {
        this(alias, T_ASSET_OUT);
    }

    /**
     * Create a <code>DB_ETERNAL.T_ASSET_OUT</code> table reference
     */
    public TAssetOut() {
        this(DSL.name("T_ASSET_OUT"), null);
    }

    public <O extends Record> TAssetOut(Table<O> child, ForeignKey<O, TAssetOutRecord> key) {
        super(child, key, T_ASSET_OUT);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAssetOutRecord> getRecordType() {
        return TAssetOutRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<TAssetOutRecord> getPrimaryKey() {
        return Keys.KEY_T_ASSET_OUT_PRIMARY;
    }

    @Override
    public TAssetOut as(String alias) {
        return new TAssetOut(DSL.name(alias), this);
    }

    @Override
    public TAssetOut as(Name alias) {
        return new TAssetOut(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TAssetOut rename(String name) {
        return new TAssetOut(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TAssetOut rename(Name name) {
        return new TAssetOut(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
