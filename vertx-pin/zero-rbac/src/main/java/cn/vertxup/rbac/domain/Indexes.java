/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain;


import cn.vertxup.rbac.domain.tables.OUser;
import cn.vertxup.rbac.domain.tables.RUserGroup;
import cn.vertxup.rbac.domain.tables.RUserRole;
import cn.vertxup.rbac.domain.tables.SAction;
import cn.vertxup.rbac.domain.tables.SPacket;
import cn.vertxup.rbac.domain.tables.SPath;
import cn.vertxup.rbac.domain.tables.SUser;
import cn.vertxup.rbac.domain.tables.SVisitant;

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

    public static final Index R_USER_GROUP_IDX_R_USER_GROUP_USER_ID = Internal.createIndex(DSL.name("IDX_R_USER_GROUP_USER_ID"), RUserGroup.R_USER_GROUP, new OrderField[] { RUserGroup.R_USER_GROUP.USER_ID }, false);
    public static final Index R_USER_ROLE_IDX_R_USER_ROLE_USER_ID = Internal.createIndex(DSL.name("IDX_R_USER_ROLE_USER_ID"), RUserRole.R_USER_ROLE, new OrderField[] { RUserRole.R_USER_ROLE.USER_ID }, false);
    public static final Index S_ACTION_IDX_S_ACTION_PERMISSION_ID = Internal.createIndex(DSL.name("IDX_S_ACTION_PERMISSION_ID"), SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.PERMISSION_ID }, false);
    public static final Index S_PACKET_IDX_S_PACKET_PATH_CODE_SIGMA = Internal.createIndex(DSL.name("IDX_S_PACKET_PATH_CODE_SIGMA"), SPacket.S_PACKET, new OrderField[] { SPacket.S_PACKET.CODE, SPacket.S_PACKET.SIGMA }, false);
    public static final Index S_PATH_IDX_S_PATH_RUN_TYPE_SIGMA = Internal.createIndex(DSL.name("IDX_S_PATH_RUN_TYPE_SIGMA"), SPath.S_PATH, new OrderField[] { SPath.S_PATH.RUN_TYPE, SPath.S_PATH.SIGMA }, false);
    public static final Index S_USER_IDX_S_USER_USERNAME = Internal.createIndex(DSL.name("IDX_S_USER_USERNAME"), SUser.S_USER, new OrderField[] { SUser.S_USER.USERNAME }, false);
    public static final Index O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_APP = Internal.createIndex(DSL.name("IDXM_O_USER_OAUTH_AUTHORIZE_APP"), OUser.O_USER, new OrderField[] { OUser.O_USER.SCOPE, OUser.O_USER.CLIENT_ID, OUser.O_USER.CLIENT_SECRET }, false);
    public static final Index O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_FULL = Internal.createIndex(DSL.name("IDXM_O_USER_OAUTH_AUTHORIZE_FULL"), OUser.O_USER, new OrderField[] { OUser.O_USER.SCOPE, OUser.O_USER.CLIENT_ID, OUser.O_USER.CLIENT_SECRET, OUser.O_USER.LANGUAGE }, false);
    public static final Index S_ACTION_IDXM_S_ACTION_SIGMA_URI_METHOD = Internal.createIndex(DSL.name("IDXM_S_ACTION_SIGMA_URI_METHOD"), SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.SIGMA, SAction.S_ACTION.URI, SAction.S_ACTION.METHOD }, false);
    public static final Index S_ACTION_IDXM_S_ACTION_URI_METHOD = Internal.createIndex(DSL.name("IDXM_S_ACTION_URI_METHOD"), SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.URI, SAction.S_ACTION.METHOD }, false);
    public static final Index S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG = Internal.createIndex(DSL.name("IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG"), SVisitant.S_VISITANT, new OrderField[] { SVisitant.S_VISITANT.VIEW_ID, SVisitant.S_VISITANT.TYPE, SVisitant.S_VISITANT.SEEK_KEY }, false);
    public static final Index S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER = Internal.createIndex(DSL.name("IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER"), SVisitant.S_VISITANT, new OrderField[] { SVisitant.S_VISITANT.VIEW_ID, SVisitant.S_VISITANT.TYPE, SVisitant.S_VISITANT.IDENTIFIER }, false);
}
