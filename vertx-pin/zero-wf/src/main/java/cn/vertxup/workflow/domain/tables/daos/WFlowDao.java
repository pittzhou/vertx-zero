/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.daos;


import cn.vertxup.workflow.domain.tables.WFlow;
import cn.vertxup.workflow.domain.tables.records.WFlowRecord;

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
public class WFlowDao extends AbstractVertxDAO<WFlowRecord, cn.vertxup.workflow.domain.tables.pojos.WFlow, String, Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>>, Future<cn.vertxup.workflow.domain.tables.pojos.WFlow>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<WFlowRecord,cn.vertxup.workflow.domain.tables.pojos.WFlow,String> {

        /**
     * @param configuration The ConfigRunner used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public WFlowDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(WFlow.W_FLOW, cn.vertxup.workflow.domain.tables.pojos.WFlow.class, new JDBCClassicQueryExecutor<WFlowRecord,cn.vertxup.workflow.domain.tables.pojos.WFlow,String>(configuration,cn.vertxup.workflow.domain.tables.pojos.WFlow.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.workflow.domain.tables.pojos.WFlow object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByName(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByCode(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByType(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>DEFINITION_KEY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByDefinitionKey(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.DEFINITION_KEY.in(values));
        }

        /**
     * Find records that have <code>DEFINITION_KEY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByDefinitionKey(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.DEFINITION_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>AUTHORIZED_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByAuthorizedComponent(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.AUTHORIZED_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>AUTHORIZED_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByAuthorizedComponent(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.AUTHORIZED_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>AUTHORIZED_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByAuthorizedConfig(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.AUTHORIZED_CONFIG.in(values));
        }

        /**
     * Find records that have <code>AUTHORIZED_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByAuthorizedConfig(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.AUTHORIZED_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>GENERATE_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByGenerateComponent(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.GENERATE_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>GENERATE_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByGenerateComponent(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.GENERATE_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>GENERATE_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByGenerateConfig(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.GENERATE_CONFIG.in(values));
        }

        /**
     * Find records that have <code>GENERATE_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByGenerateConfig(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.GENERATE_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>RUN_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByRunComponent(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.RUN_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>RUN_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByRunComponent(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.RUN_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>RUN_CONFIG IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByRunConfig(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.RUN_CONFIG.in(values));
        }

        /**
     * Find records that have <code>RUN_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByRunConfig(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.RUN_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>START_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByStartComponent(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.START_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>START_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByStartComponent(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.START_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>START_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByStartConfig(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.START_CONFIG.in(values));
        }

        /**
     * Find records that have <code>START_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByStartConfig(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.START_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>END_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByEndComponent(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.END_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>END_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByEndComponent(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.END_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>END_CONFIG IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByEndConfig(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.END_CONFIG.in(values));
        }

        /**
     * Find records that have <code>END_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByEndConfig(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.END_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>UI_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiComponent(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.UI_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>UI_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiComponent(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.UI_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiConfig(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.UI_CONFIG.in(values));
        }

        /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiConfig(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.UI_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>UI_ASSIST IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiAssist(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.UI_ASSIST.in(values));
        }

        /**
     * Find records that have <code>UI_ASSIST IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiAssist(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.UI_ASSIST.in(values),limit);
        }

        /**
     * Find records that have <code>UI_LINKAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiLinkage(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.UI_LINKAGE.in(values));
        }

        /**
     * Find records that have <code>UI_LINKAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUiLinkage(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.UI_LINKAGE.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByComment(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(WFlow.W_FLOW.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WFlow.W_FLOW.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(WFlow.W_FLOW.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(WFlow.W_FLOW.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.WFlow>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(WFlow.W_FLOW.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<WFlowRecord,cn.vertxup.workflow.domain.tables.pojos.WFlow,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<WFlowRecord,cn.vertxup.workflow.domain.tables.pojos.WFlow,String>) super.queryExecutor();
        }
}
