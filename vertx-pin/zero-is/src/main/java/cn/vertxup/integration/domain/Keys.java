/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain;


import cn.vertxup.integration.domain.tables.IDirectory;
import cn.vertxup.integration.domain.tables.IIntegration;
import cn.vertxup.integration.domain.tables.IMessage;
import cn.vertxup.integration.domain.tables.IPortfolio;
import cn.vertxup.integration.domain.tables.records.IDirectoryRecord;
import cn.vertxup.integration.domain.tables.records.IIntegrationRecord;
import cn.vertxup.integration.domain.tables.records.IMessageRecord;
import cn.vertxup.integration.domain.tables.records.IPortfolioRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * DB_ETERNAL.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<IDirectoryRecord> KEY_I_DIRECTORY_CODE = Internal.createUniqueKey(IDirectory.I_DIRECTORY, DSL.name("KEY_I_DIRECTORY_CODE"), new TableField[] { IDirectory.I_DIRECTORY.CODE, IDirectory.I_DIRECTORY.SIGMA }, true);
    public static final UniqueKey<IDirectoryRecord> KEY_I_DIRECTORY_NAME = Internal.createUniqueKey(IDirectory.I_DIRECTORY, DSL.name("KEY_I_DIRECTORY_NAME"), new TableField[] { IDirectory.I_DIRECTORY.NAME, IDirectory.I_DIRECTORY.PARENT_ID, IDirectory.I_DIRECTORY.SIGMA }, true);
    public static final UniqueKey<IDirectoryRecord> KEY_I_DIRECTORY_PRIMARY = Internal.createUniqueKey(IDirectory.I_DIRECTORY, DSL.name("KEY_I_DIRECTORY_PRIMARY"), new TableField[] { IDirectory.I_DIRECTORY.KEY }, true);
    public static final UniqueKey<IDirectoryRecord> KEY_I_DIRECTORY_STORE_PATH = Internal.createUniqueKey(IDirectory.I_DIRECTORY, DSL.name("KEY_I_DIRECTORY_STORE_PATH"), new TableField[] { IDirectory.I_DIRECTORY.STORE_PATH, IDirectory.I_DIRECTORY.SIGMA }, true);
    public static final UniqueKey<IIntegrationRecord> KEY_I_INTEGRATION_ENDPOINT = Internal.createUniqueKey(IIntegration.I_INTEGRATION, DSL.name("KEY_I_INTEGRATION_ENDPOINT"), new TableField[] { IIntegration.I_INTEGRATION.ENDPOINT, IIntegration.I_INTEGRATION.PATH, IIntegration.I_INTEGRATION.APP_ID }, true);
    public static final UniqueKey<IIntegrationRecord> KEY_I_INTEGRATION_PRIMARY = Internal.createUniqueKey(IIntegration.I_INTEGRATION, DSL.name("KEY_I_INTEGRATION_PRIMARY"), new TableField[] { IIntegration.I_INTEGRATION.KEY }, true);
    public static final UniqueKey<IMessageRecord> KEY_I_MESSAGE_APP_ID = Internal.createUniqueKey(IMessage.I_MESSAGE, DSL.name("KEY_I_MESSAGE_APP_ID"), new TableField[] { IMessage.I_MESSAGE.APP_ID, IMessage.I_MESSAGE.CODE }, true);
    public static final UniqueKey<IMessageRecord> KEY_I_MESSAGE_APP_ID_2 = Internal.createUniqueKey(IMessage.I_MESSAGE, DSL.name("KEY_I_MESSAGE_APP_ID_2"), new TableField[] { IMessage.I_MESSAGE.APP_ID, IMessage.I_MESSAGE.NAME }, true);
    public static final UniqueKey<IMessageRecord> KEY_I_MESSAGE_PRIMARY = Internal.createUniqueKey(IMessage.I_MESSAGE, DSL.name("KEY_I_MESSAGE_PRIMARY"), new TableField[] { IMessage.I_MESSAGE.KEY }, true);
    public static final UniqueKey<IPortfolioRecord> KEY_I_PORTFOLIO_CODE = Internal.createUniqueKey(IPortfolio.I_PORTFOLIO, DSL.name("KEY_I_PORTFOLIO_CODE"), new TableField[] { IPortfolio.I_PORTFOLIO.CODE, IPortfolio.I_PORTFOLIO.SIGMA }, true);
    public static final UniqueKey<IPortfolioRecord> KEY_I_PORTFOLIO_PRIMARY = Internal.createUniqueKey(IPortfolio.I_PORTFOLIO, DSL.name("KEY_I_PORTFOLIO_PRIMARY"), new TableField[] { IPortfolio.I_PORTFOLIO.KEY }, true);
}
