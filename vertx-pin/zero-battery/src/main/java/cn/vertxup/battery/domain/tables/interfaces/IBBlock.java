/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IBBlock extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    public IBBlock setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    public IBBlock setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    public IBBlock setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.VERSION</code>. 「version」- 子模块版本
     */
    public IBBlock setVersion(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.VERSION</code>. 「version」- 子模块版本
     */
    public String getVersion();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.AUTHORIZED</code>. 「authorized」- 是否授权
     */
    public IBBlock setAuthorized(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.AUTHORIZED</code>. 「authorized」- 是否授权
     */
    public Boolean getAuthorized();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    public IBBlock setUiIcon(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    public String getUiIcon();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    public IBBlock setUiStyle(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    public String getUiStyle();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    public IBBlock setUiSort(Long value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    public Long getUiSort();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    public IBBlock setUiConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    public String getUiConfig();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_CONTENT</code>. 「uiContent」- 配置数据
     */
    public IBBlock setUiContent(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_CONTENT</code>. 「uiContent」- 配置数据
     */
    public String getUiContent();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」-
     * 许可证发证机构
     */
    public IBBlock setSignIssuer(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」-
     * 许可证发证机构
     */
    public String getSignIssuer();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_NAME</code>. 「signName」- 许可证名称
     */
    public IBBlock setSignName(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_NAME</code>. 「signName」- 许可证名称
     */
    public String getSignName();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_AT</code>. 「signAt」- 发证时间
     */
    public IBBlock setSignAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_AT</code>. 「signAt」- 发证时间
     */
    public LocalDateTime getSignAt();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_SECRET</code>. 「signSecret」-
     * 证书专用密钥
     */
    public IBBlock setSignSecret(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_SECRET</code>. 「signSecret」-
     * 证书专用密钥
     */
    public String getSignSecret();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_LIC</code>. 「signLic」- 许可证内容
     */
    public IBBlock setSignLic(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_LIC</code>. 「signLic」- 许可证内容
     */
    public String getSignLic();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_END</code>. 「signEnd」- 证书过期时间
     */
    public IBBlock setSignEnd(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_END</code>. 「signEnd」- 证书过期时间
     */
    public LocalDateTime getSignEnd();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_START</code>. 「signStart」-
     * 证书过期时间
     */
    public IBBlock setSignStart(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_START</code>. 「signStart」-
     * 证书过期时间
     */
    public LocalDateTime getSignStart();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LIC_IDENTIFIER</code>.
     * 「licIdentifier」- 允许的模型标识
     */
    public IBBlock setLicIdentifier(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LIC_IDENTIFIER</code>.
     * 「licIdentifier」- 允许的模型标识
     */
    public String getLicIdentifier();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LIC_MENU</code>. 「licMenu」-
     * 该Block包含的菜单
     */
    public IBBlock setLicMenu(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LIC_MENU</code>. 「licMenu」-
     * 该Block包含的菜单
     */
    public String getLicMenu();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IBBlock setAppId(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    public IBBlock setBagId(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    public String getBagId();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    public IBBlock setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    public IBBlock setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    public IBBlock setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IBBlock setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IBBlock setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IBBlock setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IBBlock setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IBBlock setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IBBlock
     */
    public void from(IBBlock from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IBBlock
     */
    public <E extends IBBlock> E into(E into);

        @Override
        public default IBBlock fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setVersion,json::getString,"VERSION","java.lang.String");
                setOrThrow(this::setAuthorized,json::getBoolean,"AUTHORIZED","java.lang.Boolean");
                setOrThrow(this::setUiIcon,json::getString,"UI_ICON","java.lang.String");
                setOrThrow(this::setUiStyle,json::getString,"UI_STYLE","java.lang.String");
                setOrThrow(this::setUiSort,json::getLong,"UI_SORT","java.lang.Long");
                setOrThrow(this::setUiConfig,json::getString,"UI_CONFIG","java.lang.String");
                setOrThrow(this::setUiContent,json::getString,"UI_CONTENT","java.lang.String");
                setOrThrow(this::setSignIssuer,json::getString,"SIGN_ISSUER","java.lang.String");
                setOrThrow(this::setSignName,json::getString,"SIGN_NAME","java.lang.String");
                setOrThrow(this::setSignAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"SIGN_AT","java.time.LocalDateTime");
                setOrThrow(this::setSignSecret,json::getString,"SIGN_SECRET","java.lang.String");
                setOrThrow(this::setSignLic,json::getString,"SIGN_LIC","java.lang.String");
                setOrThrow(this::setSignEnd,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"SIGN_END","java.time.LocalDateTime");
                setOrThrow(this::setSignStart,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"SIGN_START","java.time.LocalDateTime");
                setOrThrow(this::setLicIdentifier,json::getString,"LIC_IDENTIFIER","java.lang.String");
                setOrThrow(this::setLicMenu,json::getString,"LIC_MENU","java.lang.String");
                setOrThrow(this::setAppId,json::getString,"APP_ID","java.lang.String");
                setOrThrow(this::setBagId,json::getString,"BAG_ID","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("CODE",getCode());
                json.put("NAME",getName());
                json.put("VERSION",getVersion());
                json.put("AUTHORIZED",getAuthorized());
                json.put("UI_ICON",getUiIcon());
                json.put("UI_STYLE",getUiStyle());
                json.put("UI_SORT",getUiSort());
                json.put("UI_CONFIG",getUiConfig());
                json.put("UI_CONTENT",getUiContent());
                json.put("SIGN_ISSUER",getSignIssuer());
                json.put("SIGN_NAME",getSignName());
                json.put("SIGN_AT",getSignAt()==null?null:getSignAt().toString());
                json.put("SIGN_SECRET",getSignSecret());
                json.put("SIGN_LIC",getSignLic());
                json.put("SIGN_END",getSignEnd()==null?null:getSignEnd().toString());
                json.put("SIGN_START",getSignStart()==null?null:getSignStart().toString());
                json.put("LIC_IDENTIFIER",getLicIdentifier());
                json.put("LIC_MENU",getLicMenu());
                json.put("APP_ID",getAppId());
                json.put("BAG_ID",getBagId());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
