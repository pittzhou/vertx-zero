/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables;


import cn.vertxup.workflow.domain.Db;
import cn.vertxup.workflow.domain.Keys;
import cn.vertxup.workflow.domain.tables.records.TAssetInRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TAssetIn extends TableImpl<TAssetInRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.T_ASSET_IN</code>
     */
    public static final TAssetIn T_ASSET_IN = new TAssetIn();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.T_ASSET_IN.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    public final TableField<TAssetInRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 单据主键（主单主键Join模式）");
    /**
     * The column <code>DB_ETERNAL.T_ASSET_IN.COMMENT_IN</code>. 「commentIn」-
     * 入库备注
     */
    public final TableField<TAssetInRecord, String> COMMENT_IN = createField(DSL.name("COMMENT_IN"), SQLDataType.CLOB, this, "「commentIn」- 入库备注");

    private TAssetIn(Name alias, Table<TAssetInRecord> aliased) {
        this(alias, aliased, null);
    }

    private TAssetIn(Name alias, Table<TAssetInRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.T_ASSET_IN</code> table reference
     */
    public TAssetIn(String alias) {
        this(DSL.name(alias), T_ASSET_IN);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.T_ASSET_IN</code> table reference
     */
    public TAssetIn(Name alias) {
        this(alias, T_ASSET_IN);
    }

    /**
     * Create a <code>DB_ETERNAL.T_ASSET_IN</code> table reference
     */
    public TAssetIn() {
        this(DSL.name("T_ASSET_IN"), null);
    }

    public <O extends Record> TAssetIn(Table<O> child, ForeignKey<O, TAssetInRecord> key) {
        super(child, key, T_ASSET_IN);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAssetInRecord> getRecordType() {
        return TAssetInRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<TAssetInRecord> getPrimaryKey() {
        return Keys.KEY_T_ASSET_IN_PRIMARY;
    }

    @Override
    public TAssetIn as(String alias) {
        return new TAssetIn(DSL.name(alias), this);
    }

    @Override
    public TAssetIn as(Name alias) {
        return new TAssetIn(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TAssetIn rename(String name) {
        return new TAssetIn(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TAssetIn rename(Name name) {
        return new TAssetIn(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
