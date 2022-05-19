/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Db;
import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.tables.records.TOaAssignmentRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TOaAssignment extends TableImpl<TOaAssignmentRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.T_OA_ASSIGNMENT</code>
     */
    public static final TOaAssignment T_OA_ASSIGNMENT = new TOaAssignment();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    public final TableField<TOaAssignmentRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- Ticket Primary Key");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    public final TableField<TOaAssignmentRecord, String> COMMENT_EXTENSION = createField(DSL.name("COMMENT_EXTENSION"), SQLDataType.CLOB, this, "「commentExtension」- Extension Comment");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.REQUEST_BY</code>.
     * 「requestBy」- Request User
     */
    public final TableField<TOaAssignmentRecord, String> REQUEST_BY = createField(DSL.name("REQUEST_BY"), SQLDataType.VARCHAR(36), this, "「requestBy」- Request User");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.START_AT</code>. 「startAt」-
     * From
     */
    public final TableField<TOaAssignmentRecord, LocalDateTime> START_AT = createField(DSL.name("START_AT"), SQLDataType.LOCALDATETIME(0), this, "「startAt」- From");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.END_AT</code>. 「endAt」- To
     */
    public final TableField<TOaAssignmentRecord, LocalDateTime> END_AT = createField(DSL.name("END_AT"), SQLDataType.LOCALDATETIME(0), this, "「endAt」- To");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.DAYS</code>. 「days」- Duration
     */
    public final TableField<TOaAssignmentRecord, Integer> DAYS = createField(DSL.name("DAYS"), SQLDataType.INTEGER, this, "「days」- Duration");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.REASON</code>. 「reason」- The
     * reason to be done
     */
    public final TableField<TOaAssignmentRecord, String> REASON = createField(DSL.name("REASON"), SQLDataType.CLOB, this, "「reason」- The reason to be done");
    /**
     * The column <code>DB_ETERNAL.T_OA_ASSIGNMENT.WORK_CONTENT</code>.
     * 「workContent」- Working Assignment Content
     */
    public final TableField<TOaAssignmentRecord, String> WORK_CONTENT = createField(DSL.name("WORK_CONTENT"), SQLDataType.CLOB, this, "「workContent」- Working Assignment Content");

    private TOaAssignment(Name alias, Table<TOaAssignmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOaAssignment(Name alias, Table<TOaAssignmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.T_OA_ASSIGNMENT</code> table reference
     */
    public TOaAssignment(String alias) {
        this(DSL.name(alias), T_OA_ASSIGNMENT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.T_OA_ASSIGNMENT</code> table reference
     */
    public TOaAssignment(Name alias) {
        this(alias, T_OA_ASSIGNMENT);
    }

    /**
     * Create a <code>DB_ETERNAL.T_OA_ASSIGNMENT</code> table reference
     */
    public TOaAssignment() {
        this(DSL.name("T_OA_ASSIGNMENT"), null);
    }

    public <O extends Record> TOaAssignment(Table<O> child, ForeignKey<O, TOaAssignmentRecord> key) {
        super(child, key, T_OA_ASSIGNMENT);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOaAssignmentRecord> getRecordType() {
        return TOaAssignmentRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<TOaAssignmentRecord> getPrimaryKey() {
        return Keys.KEY_T_OA_ASSIGNMENT_PRIMARY;
    }

    @Override
    public TOaAssignment as(String alias) {
        return new TOaAssignment(DSL.name(alias), this);
    }

    @Override
    public TOaAssignment as(Name alias) {
        return new TOaAssignment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOaAssignment rename(String name) {
        return new TOaAssignment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOaAssignment rename(Name name) {
        return new TOaAssignment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
