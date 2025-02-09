package io.vertx.tp.atom.modeling.element;

import io.vertx.up.eon.em.atom.KeyMode;
import io.vertx.up.uca.cache.Cc;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 一个模型中的唯一标识，根据主键属性计算出来的内容
 */
public class DataKey implements Serializable {
    /* 主键专用管理 */
    private static final Cc<String, DataKey> CC_KEY = Cc.open();
    private final transient String unique;
    private transient KeyMode mode = KeyMode.DIRECT;    // 模式

    /* 主键字段：table name -> 属性矩阵，可支持多张表 */
    private ConcurrentMap<String, DataMatrix> matrix = new ConcurrentHashMap<>();

    private DataKey(final String unique) {
        this.unique = unique;
    }

    public static DataKey create(final String unique) {
        return CC_KEY.pick(() -> new DataKey(unique), unique);
        // return Fn.po?l(KEYS, unique, () -> new DataKey(unique));
    }

    public String getUnique() {
        return this.unique;
    }

    public ConcurrentMap<String, DataMatrix> getMatrix() {
        return this.matrix;
    }

    public void setMatrix(final ConcurrentMap<String, DataMatrix> matrix) {
        this.matrix = matrix;
    }

    public KeyMode getMode() {
        return this.mode;
    }

    public void setMode(final KeyMode mode) {
        this.mode = mode;
    }

    DataKey cloneKey() {
        final DataKey key = new DataKey(this.unique);
        key.setMode(this.mode);
        return key;
    }
}
