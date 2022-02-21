/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.pojos;


import cn.vertxup.workflow.domain.tables.interfaces.ITAssetOut;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAssetOut implements VertxPojo, ITAssetOut {

    private static final long serialVersionUID = 1L;

    private String key;
    private String commentOut;
    private String commentUsage;

    public TAssetOut() {}

    public TAssetOut(ITAssetOut value) {
        this.key = value.getKey();
        this.commentOut = value.getCommentOut();
        this.commentUsage = value.getCommentUsage();
    }

    public TAssetOut(
        String key,
        String commentOut,
        String commentUsage
    ) {
        this.key = key;
        this.commentOut = commentOut;
        this.commentUsage = commentUsage;
    }

        public TAssetOut(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_OUT.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_OUT.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    @Override
    public TAssetOut setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_OUT</code>. 「commentOut」-
     * 出库备注
     */
    @Override
    public String getCommentOut() {
        return this.commentOut;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_OUT</code>. 「commentOut」-
     * 出库备注
     */
    @Override
    public TAssetOut setCommentOut(String commentOut) {
        this.commentOut = commentOut;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_USAGE</code>.
     * 「commentUsage」- 出库使用说明
     */
    @Override
    public String getCommentUsage() {
        return this.commentUsage;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_OUT.COMMENT_USAGE</code>.
     * 「commentUsage」- 出库使用说明
     */
    @Override
    public TAssetOut setCommentUsage(String commentUsage) {
        this.commentUsage = commentUsage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAssetOut (");

        sb.append(key);
        sb.append(", ").append(commentOut);
        sb.append(", ").append(commentUsage);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITAssetOut from) {
        setKey(from.getKey());
        setCommentOut(from.getCommentOut());
        setCommentUsage(from.getCommentUsage());
    }

    @Override
    public <E extends ITAssetOut> E into(E into) {
        into.from(this);
        return into;
    }
}
