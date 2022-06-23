/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SPacket;
import cn.vertxup.rbac.domain.tables.records.SPacketRecord;

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
public class SPacketDao extends AbstractVertxDAO<SPacketRecord, cn.vertxup.rbac.domain.tables.pojos.SPacket, String, Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>>, Future<cn.vertxup.rbac.domain.tables.pojos.SPacket>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SPacketRecord,cn.vertxup.rbac.domain.tables.pojos.SPacket,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SPacketDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(SPacket.S_PACKET, cn.vertxup.rbac.domain.tables.pojos.SPacket.class, new JDBCClassicQueryExecutor<SPacketRecord,cn.vertxup.rbac.domain.tables.pojos.SPacket,String>(configuration,cn.vertxup.rbac.domain.tables.pojos.SPacket.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.rbac.domain.tables.pojos.SPacket object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>PATH_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByPathId(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.PATH_ID.in(values));
        }

        /**
     * Find records that have <code>PATH_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByPathId(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.PATH_ID.in(values),limit);
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByResourceId(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.RESOURCE_ID.in(values));
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByResourceId(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.RESOURCE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ROW_TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowType(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.ROW_TYPE.in(values));
        }

        /**
     * Find records that have <code>ROW_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowType(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.ROW_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>ROW_FIELD IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowField(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.ROW_FIELD.in(values));
        }

        /**
     * Find records that have <code>ROW_FIELD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowField(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.ROW_FIELD.in(values),limit);
        }

        /**
     * Find records that have <code>ROW_TPL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowTpl(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.ROW_TPL.in(values));
        }

        /**
     * Find records that have <code>ROW_TPL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowTpl(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.ROW_TPL.in(values),limit);
        }

        /**
     * Find records that have <code>ROW_TPL_MAPPING IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowTplMapping(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.ROW_TPL_MAPPING.in(values));
        }

        /**
     * Find records that have <code>ROW_TPL_MAPPING IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByRowTplMapping(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.ROW_TPL_MAPPING.in(values),limit);
        }

        /**
     * Find records that have <code>COL_TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByColType(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.COL_TYPE.in(values));
        }

        /**
     * Find records that have <code>COL_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByColType(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.COL_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>COL_CONFIG IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByColConfig(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.COL_CONFIG.in(values));
        }

        /**
     * Find records that have <code>COL_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByColConfig(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.COL_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>COND_TPL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCondTpl(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.COND_TPL.in(values));
        }

        /**
     * Find records that have <code>COND_TPL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCondTpl(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.COND_TPL.in(values),limit);
        }

        /**
     * Find records that have <code>COND_TPL_MAPPING IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCondTplMapping(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.COND_TPL_MAPPING.in(values));
        }

        /**
     * Find records that have <code>COND_TPL_MAPPING IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCondTplMapping(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.COND_TPL_MAPPING.in(values),limit);
        }

        /**
     * Find records that have <code>COND_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCondConfig(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.COND_CONFIG.in(values));
        }

        /**
     * Find records that have <code>COND_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCondConfig(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.COND_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(SPacket.S_PACKET.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SPacket.S_PACKET.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SPacket.S_PACKET.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(SPacket.S_PACKET.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPacket>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SPacket.S_PACKET.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<SPacketRecord,cn.vertxup.rbac.domain.tables.pojos.SPacket,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<SPacketRecord,cn.vertxup.rbac.domain.tables.pojos.SPacket,String>) super.queryExecutor();
        }
}
