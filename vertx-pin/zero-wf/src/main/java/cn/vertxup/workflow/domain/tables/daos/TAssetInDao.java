/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.daos;


import cn.vertxup.workflow.domain.tables.TAssetIn;
import cn.vertxup.workflow.domain.tables.records.TAssetInRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAssetInDao extends AbstractVertxDAO<TAssetInRecord, cn.vertxup.workflow.domain.tables.pojos.TAssetIn, String, Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetIn>>, Future<cn.vertxup.workflow.domain.tables.pojos.TAssetIn>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TAssetInRecord,cn.vertxup.workflow.domain.tables.pojos.TAssetIn,String> {

        /**
     * @param configuration The ConfigRunner used for rendering and query
     * execution.
     *      * @param vertx the vertx instance
     */
        public TAssetInDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(TAssetIn.T_ASSET_IN, cn.vertxup.workflow.domain.tables.pojos.TAssetIn.class, new JDBCClassicQueryExecutor<TAssetInRecord,cn.vertxup.workflow.domain.tables.pojos.TAssetIn,String>(configuration,cn.vertxup.workflow.domain.tables.pojos.TAssetIn.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.workflow.domain.tables.pojos.TAssetIn object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>COMMENT_IN IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetIn>> findManyByCommentIn(Collection<String> values) {
                return findManyByCondition(TAssetIn.T_ASSET_IN.COMMENT_IN.in(values));
        }

        /**
     * Find records that have <code>COMMENT_IN IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.workflow.domain.tables.pojos.TAssetIn>> findManyByCommentIn(Collection<String> values, int limit) {
                return findManyByCondition(TAssetIn.T_ASSET_IN.COMMENT_IN.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<TAssetInRecord,cn.vertxup.workflow.domain.tables.pojos.TAssetIn,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<TAssetInRecord,cn.vertxup.workflow.domain.tables.pojos.TAssetIn,String>) super.queryExecutor();
        }
}
