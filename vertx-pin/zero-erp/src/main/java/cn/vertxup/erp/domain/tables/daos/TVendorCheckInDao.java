/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.TVendorCheckIn;
import cn.vertxup.erp.domain.tables.records.TVendorCheckInRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVendorCheckInDao extends AbstractVertxDAO<TVendorCheckInRecord, cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn, String, Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>>, Future<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TVendorCheckInRecord,cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public TVendorCheckInDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(TVendorCheckIn.T_VENDOR_CHECK_IN, cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn.class, new JDBCClassicQueryExecutor<TVendorCheckInRecord,cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn,String>(configuration,cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByCommentExtension(Collection<String> values) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.COMMENT_EXTENSION.in(values));
        }

        /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByCommentExtension(Collection<String> values, int limit) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.COMMENT_EXTENSION.in(values),limit);
        }

        /**
     * Find records that have <code>CLASSIFICATION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByClassification(Collection<String> values) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.CLASSIFICATION.in(values));
        }

        /**
     * Find records that have <code>CLASSIFICATION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByClassification(Collection<String> values, int limit) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.CLASSIFICATION.in(values),limit);
        }

        /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByStartAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.START_AT.in(values));
        }

        /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.START_AT.in(values),limit);
        }

        /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByEndAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.END_AT.in(values));
        }

        /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.END_AT.in(values),limit);
        }

        /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByDays(Collection<Integer> values) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.DAYS.in(values));
        }

        /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByDays(Collection<Integer> values, int limit) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.DAYS.in(values),limit);
        }

        /**
     * Find records that have <code>ONBOARD_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByOnboardAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.ONBOARD_AT.in(values));
        }

        /**
     * Find records that have <code>ONBOARD_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn>> findManyByOnboardAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TVendorCheckIn.T_VENDOR_CHECK_IN.ONBOARD_AT.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<TVendorCheckInRecord,cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<TVendorCheckInRecord,cn.vertxup.erp.domain.tables.pojos.TVendorCheckIn,String>) super.queryExecutor();
        }
}
