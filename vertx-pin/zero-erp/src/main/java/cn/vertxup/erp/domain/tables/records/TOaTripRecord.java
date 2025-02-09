/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.TOaTrip;
import cn.vertxup.erp.domain.tables.interfaces.ITOaTrip;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TOaTripRecord extends UpdatableRecordImpl<TOaTripRecord> implements VertxPojo, Record11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, String, String, String>, ITOaTrip {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.KEY</code>. 「key」- Ticket Primary
     * Key
     */
    @Override
    public TOaTripRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.KEY</code>. 「key」- Ticket Primary
     * Key
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TOaTripRecord setCommentExtension(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    @Override
    public TOaTripRecord setRequestBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    @Override
    public String getRequestBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.START_AT</code>. 「startAt」- From
     */
    @Override
    public TOaTripRecord setStartAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.START_AT</code>. 「startAt」- From
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.END_AT</code>. 「endAt」- To
     */
    @Override
    public TOaTripRecord setEndAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.DAYS</code>. 「days」- Duration
     */
    @Override
    public TOaTripRecord setDays(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.DAYS</code>. 「days」- Duration
     */
    @Override
    public Integer getDays() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.TRIP_PROVINCE</code>.
     * 「tripProvince」- Trip Province
     */
    @Override
    public TOaTripRecord setTripProvince(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.TRIP_PROVINCE</code>.
     * 「tripProvince」- Trip Province
     */
    @Override
    public String getTripProvince() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.TRIP_CITY</code>. 「tripCity」- Trip
     * City
     */
    @Override
    public TOaTripRecord setTripCity(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.TRIP_CITY</code>. 「tripCity」- Trip
     * City
     */
    @Override
    public String getTripCity() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.TRIP_ADDRESS</code>. 「tripAddress」-
     * Trip Address
     */
    @Override
    public TOaTripRecord setTripAddress(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.TRIP_ADDRESS</code>. 「tripAddress」-
     * Trip Address
     */
    @Override
    public String getTripAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.REASON</code>. 「reason」- The reason
     * to be done
     */
    @Override
    public TOaTripRecord setReason(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.REASON</code>. 「reason」- The reason
     * to be done
     */
    @Override
    public String getReason() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_TRIP.WORK_CONTENT</code>. 「workContent」-
     * Working Assignment Content
     */
    @Override
    public TOaTripRecord setWorkContent(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_TRIP.WORK_CONTENT</code>. 「workContent」-
     * Working Assignment Content
     */
    @Override
    public String getWorkContent() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, LocalDateTime, LocalDateTime, Integer, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TOaTrip.T_OA_TRIP.KEY;
    }

    @Override
    public Field<String> field2() {
        return TOaTrip.T_OA_TRIP.COMMENT_EXTENSION;
    }

    @Override
    public Field<String> field3() {
        return TOaTrip.T_OA_TRIP.REQUEST_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return TOaTrip.T_OA_TRIP.START_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return TOaTrip.T_OA_TRIP.END_AT;
    }

    @Override
    public Field<Integer> field6() {
        return TOaTrip.T_OA_TRIP.DAYS;
    }

    @Override
    public Field<String> field7() {
        return TOaTrip.T_OA_TRIP.TRIP_PROVINCE;
    }

    @Override
    public Field<String> field8() {
        return TOaTrip.T_OA_TRIP.TRIP_CITY;
    }

    @Override
    public Field<String> field9() {
        return TOaTrip.T_OA_TRIP.TRIP_ADDRESS;
    }

    @Override
    public Field<String> field10() {
        return TOaTrip.T_OA_TRIP.REASON;
    }

    @Override
    public Field<String> field11() {
        return TOaTrip.T_OA_TRIP.WORK_CONTENT;
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
    public LocalDateTime component4() {
        return getStartAt();
    }

    @Override
    public LocalDateTime component5() {
        return getEndAt();
    }

    @Override
    public Integer component6() {
        return getDays();
    }

    @Override
    public String component7() {
        return getTripProvince();
    }

    @Override
    public String component8() {
        return getTripCity();
    }

    @Override
    public String component9() {
        return getTripAddress();
    }

    @Override
    public String component10() {
        return getReason();
    }

    @Override
    public String component11() {
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
    public LocalDateTime value4() {
        return getStartAt();
    }

    @Override
    public LocalDateTime value5() {
        return getEndAt();
    }

    @Override
    public Integer value6() {
        return getDays();
    }

    @Override
    public String value7() {
        return getTripProvince();
    }

    @Override
    public String value8() {
        return getTripCity();
    }

    @Override
    public String value9() {
        return getTripAddress();
    }

    @Override
    public String value10() {
        return getReason();
    }

    @Override
    public String value11() {
        return getWorkContent();
    }

    @Override
    public TOaTripRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public TOaTripRecord value2(String value) {
        setCommentExtension(value);
        return this;
    }

    @Override
    public TOaTripRecord value3(String value) {
        setRequestBy(value);
        return this;
    }

    @Override
    public TOaTripRecord value4(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public TOaTripRecord value5(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public TOaTripRecord value6(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public TOaTripRecord value7(String value) {
        setTripProvince(value);
        return this;
    }

    @Override
    public TOaTripRecord value8(String value) {
        setTripCity(value);
        return this;
    }

    @Override
    public TOaTripRecord value9(String value) {
        setTripAddress(value);
        return this;
    }

    @Override
    public TOaTripRecord value10(String value) {
        setReason(value);
        return this;
    }

    @Override
    public TOaTripRecord value11(String value) {
        setWorkContent(value);
        return this;
    }

    @Override
    public TOaTripRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, Integer value6, String value7, String value8, String value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITOaTrip from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setRequestBy(from.getRequestBy());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setTripProvince(from.getTripProvince());
        setTripCity(from.getTripCity());
        setTripAddress(from.getTripAddress());
        setReason(from.getReason());
        setWorkContent(from.getWorkContent());
    }

    @Override
    public <E extends ITOaTrip> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TOaTripRecord
     */
    public TOaTripRecord() {
        super(TOaTrip.T_OA_TRIP);
    }

    /**
     * Create a detached, initialised TOaTripRecord
     */
    public TOaTripRecord(String key, String commentExtension, String requestBy, LocalDateTime startAt, LocalDateTime endAt, Integer days, String tripProvince, String tripCity, String tripAddress, String reason, String workContent) {
        super(TOaTrip.T_OA_TRIP);

        setKey(key);
        setCommentExtension(commentExtension);
        setRequestBy(requestBy);
        setStartAt(startAt);
        setEndAt(endAt);
        setDays(days);
        setTripProvince(tripProvince);
        setTripCity(tripCity);
        setTripAddress(tripAddress);
        setReason(reason);
        setWorkContent(workContent);
    }

    /**
     * Create a detached, initialised TOaTripRecord
     */
    public TOaTripRecord(cn.vertxup.erp.domain.tables.pojos.TOaTrip value) {
        super(TOaTrip.T_OA_TRIP);

        if (value != null) {
            setKey(value.getKey());
            setCommentExtension(value.getCommentExtension());
            setRequestBy(value.getRequestBy());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setDays(value.getDays());
            setTripProvince(value.getTripProvince());
            setTripCity(value.getTripCity());
            setTripAddress(value.getTripAddress());
            setReason(value.getReason());
            setWorkContent(value.getWorkContent());
        }
    }

        public TOaTripRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
