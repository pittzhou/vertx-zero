/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SPath;
import cn.vertxup.rbac.domain.tables.records.SPathRecord;

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
public class SPathDao extends AbstractVertxDAO<SPathRecord, cn.vertxup.rbac.domain.tables.pojos.SPath, String, Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>>, Future<cn.vertxup.rbac.domain.tables.pojos.SPath>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SPathRecord,cn.vertxup.rbac.domain.tables.pojos.SPath,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SPathDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(SPath.S_PATH, cn.vertxup.rbac.domain.tables.pojos.SPath.class, new JDBCClassicQueryExecutor<SPathRecord,cn.vertxup.rbac.domain.tables.pojos.SPath,String>(configuration,cn.vertxup.rbac.domain.tables.pojos.SPath.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.rbac.domain.tables.pojos.SPath object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByName(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByCode(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>GROUP_MAPPING IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupMapping(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.GROUP_MAPPING.in(values));
        }

        /**
     * Find records that have <code>GROUP_MAPPING IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupMapping(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.GROUP_MAPPING.in(values),limit);
        }

        /**
     * Find records that have <code>GROUP_TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupType(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.GROUP_TYPE.in(values));
        }

        /**
     * Find records that have <code>GROUP_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupType(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.GROUP_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>GROUP_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupComponent(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.GROUP_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>GROUP_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupComponent(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.GROUP_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>GROUP_CONDITION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupCondition(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.GROUP_CONDITION.in(values));
        }

        /**
     * Find records that have <code>GROUP_CONDITION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupCondition(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.GROUP_CONDITION.in(values),limit);
        }

        /**
     * Find records that have <code>GROUP_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupConfig(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.GROUP_CONFIG.in(values));
        }

        /**
     * Find records that have <code>GROUP_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByGroupConfig(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.GROUP_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>UI_TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiType(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.UI_TYPE.in(values));
        }

        /**
     * Find records that have <code>UI_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiType(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.UI_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiConfig(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.UI_CONFIG.in(values));
        }

        /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiConfig(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.UI_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>UI_CONDITION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiCondition(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.UI_CONDITION.in(values));
        }

        /**
     * Find records that have <code>UI_CONDITION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiCondition(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.UI_CONDITION.in(values),limit);
        }

        /**
     * Find records that have <code>UI_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiComponent(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.UI_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>UI_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUiComponent(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.UI_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(SPath.S_PATH.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(SPath.S_PATH.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SPath.S_PATH.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SPath.S_PATH.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SPath.S_PATH.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SPath.S_PATH.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(SPath.S_PATH.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SPath.S_PATH.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<SPathRecord,cn.vertxup.rbac.domain.tables.pojos.SPath,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<SPathRecord,cn.vertxup.rbac.domain.tables.pojos.SPath,String>) super.queryExecutor();
        }
}
