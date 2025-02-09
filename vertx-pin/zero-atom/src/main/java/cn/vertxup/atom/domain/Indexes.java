/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain;


import cn.vertxup.atom.domain.tables.MAttribute;
import cn.vertxup.atom.domain.tables.MField;
import cn.vertxup.atom.domain.tables.MIndex;
import cn.vertxup.atom.domain.tables.MJoin;
import cn.vertxup.atom.domain.tables.MKey;
import cn.vertxup.atom.domain.tables.MRelation;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in DB_ETERNAL.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index M_ATTRIBUTE_IDX_M_ATTRIBUTE_MODEL_ID = Internal.createIndex(DSL.name("IDX_M_ATTRIBUTE_MODEL_ID"), MAttribute.M_ATTRIBUTE, new OrderField[] { MAttribute.M_ATTRIBUTE.MODEL_ID }, false);
    public static final Index M_FIELD_IDX_M_FIELD_ENTITY_ID = Internal.createIndex(DSL.name("IDX_M_FIELD_ENTITY_ID"), MField.M_FIELD, new OrderField[] { MField.M_FIELD.ENTITY_ID }, false);
    public static final Index M_INDEX_IDX_M_INDEX_ENTITY_ID = Internal.createIndex(DSL.name("IDX_M_INDEX_ENTITY_ID"), MIndex.M_INDEX, new OrderField[] { MIndex.M_INDEX.ENTITY_ID }, false);
    public static final Index M_KEY_IDX_M_KEY_ENTITY_ID = Internal.createIndex(DSL.name("IDX_M_KEY_ENTITY_ID"), MKey.M_KEY, new OrderField[] { MKey.M_KEY.ENTITY_ID }, false);
    public static final Index M_JOIN_IDXM_M_JOIN_NAMESPACE_MODEL = Internal.createIndex(DSL.name("IDXM_M_JOIN_NAMESPACE_MODEL"), MJoin.M_JOIN, new OrderField[] { MJoin.M_JOIN.NAMESPACE, MJoin.M_JOIN.MODEL }, false);
    public static final Index M_RELATION_UPSTREAM = Internal.createIndex(DSL.name("UPSTREAM"), MRelation.M_RELATION, new OrderField[] { MRelation.M_RELATION.UPSTREAM, MRelation.M_RELATION.DOWNSTREAM, MRelation.M_RELATION.SIGMA }, false);
}
