/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.TOaVacation;
import cn.vertxup.erp.domain.tables.interfaces.ITOaVacation;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TOaVacationRecord extends UpdatableRecordImpl<TOaVacationRecord> implements VertxPojo, Record9<String, String, String, String, LocalDateTime, LocalDateTime, Integer, String, String>, ITOaVacation {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public TOaVacationRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TOaVacationRecord setCommentExtension(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    @Override
    public TOaVacationRecord setRequestBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    @Override
    public String getRequestBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public TOaVacationRecord setClassification(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public String getClassification() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.START_AT</code>. 「startAt」-
     * From
     */
    @Override
    public TOaVacationRecord setStartAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.START_AT</code>. 「startAt」-
     * From
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.END_AT</code>. 「endAt」- To
     */
    @Override
    public TOaVacationRecord setEndAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.DAYS</code>. 「days」- Duration
     */
    @Override
    public TOaVacationRecord setDays(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.DAYS</code>. 「days」- Duration
     */
    @Override
    public Integer getDays() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.REASON</code>. 「reason」- The
     * reason to be done
     */
    @Override
    public TOaVacationRecord setReason(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.REASON</code>. 「reason」- The
     * reason to be done
     */
    @Override
    public String getReason() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VACATION.WORK_CONTENT</code>.
     * 「workContent」- Working Assignment Content
     */
    @Override
    public TOaVacationRecord setWorkContent(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VACATION.WORK_CONTENT</code>.
     * 「workContent」- Working Assignment Content
     */
    @Override
    public String getWorkContent() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, LocalDateTime, LocalDateTime, Integer, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, LocalDateTime, LocalDateTime, Integer, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TOaVacation.T_OA_VACATION.KEY;
    }

    @Override
    public Field<String> field2() {
        return TOaVacation.T_OA_VACATION.COMMENT_EXTENSION;
    }

    @Override
    public Field<String> field3() {
        return TOaVacation.T_OA_VACATION.REQUEST_BY;
    }

    @Override
    public Field<String> field4() {
        return TOaVacation.T_OA_VACATION.CLASSIFICATION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TOaVacation.T_OA_VACATION.START_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return TOaVacation.T_OA_VACATION.END_AT;
    }

    @Override
    public Field<Integer> field7() {
        return TOaVacation.T_OA_VACATION.DAYS;
    }

    @Override
    public Field<String> field8() {
        return TOaVacation.T_OA_VACATION.REASON;
    }

    @Override
    public Field<String> field9() {
        return TOaVacation.T_OA_VACATION.WORK_CONTENT;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getCommentExtension();
    }

    @Override
    public String component3() {
        return getRequestBy();
    }

    @Override
    public String component4() {
        return getClassification();
    }

    @Override
    public LocalDateTime component5() {
        return getStartAt();
    }

    @Override
    public LocalDateTime component6() {
        return getEndAt();
    }

    @Override
    public Integer component7() {
        return getDays();
    }

    @Override
    public String component8() {
        return getReason();
    }

    @Override
    public String component9() {
        return getWorkContent();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getCommentExtension();
    }

    @Override
    public String value3() {
        return getRequestBy();
    }

    @Override
    public String value4() {
        return getClassification();
    }

    @Override
    public LocalDateTime value5() {
        return getStartAt();
    }

    @Override
    public LocalDateTime value6() {
        return getEndAt();
    }

    @Override
    public Integer value7() {
        return getDays();
    }

    @Override
    public String value8() {
        return getReason();
    }

    @Override
    public String value9() {
        return getWorkContent();
    }

    @Override
    public TOaVacationRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TOaVacationRecord value2(String value) {
        setCommentExtension(value);
        return this;
    }

    @Override
    public TOaVacationRecord value3(String value) {
        setRequestBy(value);
        return this;
    }

    @Override
    public TOaVacationRecord value4(String value) {
        setClassification(value);
        return this;
    }

    @Override
    public TOaVacationRecord value5(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public TOaVacationRecord value6(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public TOaVacationRecord value7(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public TOaVacationRecord value8(String value) {
        setReason(value);
        return this;
    }

    @Override
    public TOaVacationRecord value9(String value) {
        setWorkContent(value);
        return this;
    }

    @Override
    public TOaVacationRecord values(String value1, String value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6, Integer value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITOaVacation from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setRequestBy(from.getRequestBy());
        setClassification(from.getClassification());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setReason(from.getReason());
        setWorkContent(from.getWorkContent());
    }

    @Override
    public <E extends ITOaVacation> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TOaVacationRecord
     */
    public TOaVacationRecord() {
        super(TOaVacation.T_OA_VACATION);
    }

    /**
     * Create a detached, initialised TOaVacationRecord
     */
    public TOaVacationRecord(String key, String commentExtension, String requestBy, String classification, LocalDateTime startAt, LocalDateTime endAt, Integer days, String reason, String workContent) {
        super(TOaVacation.T_OA_VACATION);

        setKey(key);
        setCommentExtension(commentExtension);
        setRequestBy(requestBy);
        setClassification(classification);
        setStartAt(startAt);
        setEndAt(endAt);
        setDays(days);
        setReason(reason);
        setWorkContent(workContent);
    }

    /**
     * Create a detached, initialised TOaVacationRecord
     */
    public TOaVacationRecord(cn.vertxup.erp.domain.tables.pojos.TOaVacation value) {
        super(TOaVacation.T_OA_VACATION);

        if (value != null) {
            setKey(value.getKey());
            setCommentExtension(value.getCommentExtension());
            setRequestBy(value.getRequestBy());
            setClassification(value.getClassification());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setDays(value.getDays());
            setReason(value.getReason());
            setWorkContent(value.getWorkContent());
        }
    }

        public TOaVacationRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
