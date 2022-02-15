/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.pojos;


import cn.vertxup.workflow.domain.tables.interfaces.IWTicket;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WTicket implements VertxPojo, IWTicket {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        serial;
    private String        name;
    private String        code;
    private String        type;
    private String        phase;
    private String        modelId;
    private String        modelKey;
    private String        modelCategory;
    private String        modelComponent;
    private String        flowDefinitionKey;
    private String        flowDefinitionId;
    private String        flowInstanceId;
    private Boolean       flowEnd;
    private String        title;
    private String        description;
    private String        catalog;
    private String        category;
    private String        categorySub;
    private String        owner;
    private String        supervisor;
    private String        openBy;
    private LocalDateTime openAt;
    private String        cancelBy;
    private LocalDateTime cancelAt;
    private String        closeBy;
    private LocalDateTime closeAt;
    private String        closeSolution;
    private String        closeCode;
    private String        closeKb;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public WTicket() {}

    public WTicket(IWTicket value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.phase = value.getPhase();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.modelCategory = value.getModelCategory();
        this.modelComponent = value.getModelComponent();
        this.flowDefinitionKey = value.getFlowDefinitionKey();
        this.flowDefinitionId = value.getFlowDefinitionId();
        this.flowInstanceId = value.getFlowInstanceId();
        this.flowEnd = value.getFlowEnd();
        this.title = value.getTitle();
        this.description = value.getDescription();
        this.catalog = value.getCatalog();
        this.category = value.getCategory();
        this.categorySub = value.getCategorySub();
        this.owner = value.getOwner();
        this.supervisor = value.getSupervisor();
        this.openBy = value.getOpenBy();
        this.openAt = value.getOpenAt();
        this.cancelBy = value.getCancelBy();
        this.cancelAt = value.getCancelAt();
        this.closeBy = value.getCloseBy();
        this.closeAt = value.getCloseAt();
        this.closeSolution = value.getCloseSolution();
        this.closeCode = value.getCloseCode();
        this.closeKb = value.getCloseKb();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public WTicket(
        String        key,
        String        serial,
        String        name,
        String        code,
        String        type,
        String        phase,
        String        modelId,
        String        modelKey,
        String        modelCategory,
        String        modelComponent,
        String        flowDefinitionKey,
        String        flowDefinitionId,
        String        flowInstanceId,
        Boolean       flowEnd,
        String        title,
        String        description,
        String        catalog,
        String        category,
        String        categorySub,
        String        owner,
        String        supervisor,
        String        openBy,
        LocalDateTime openAt,
        String        cancelBy,
        LocalDateTime cancelAt,
        String        closeBy,
        LocalDateTime closeAt,
        String        closeSolution,
        String        closeCode,
        String        closeKb,
        Boolean       active,
        String        sigma,
        String        metadata,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.serial = serial;
        this.name = name;
        this.code = code;
        this.type = type;
        this.phase = phase;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.modelCategory = modelCategory;
        this.modelComponent = modelComponent;
        this.flowDefinitionKey = flowDefinitionKey;
        this.flowDefinitionId = flowDefinitionId;
        this.flowInstanceId = flowInstanceId;
        this.flowEnd = flowEnd;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.category = category;
        this.categorySub = categorySub;
        this.owner = owner;
        this.supervisor = supervisor;
        this.openBy = openBy;
        this.openAt = openAt;
        this.cancelBy = cancelBy;
        this.cancelAt = cancelAt;
        this.closeBy = closeBy;
        this.closeAt = closeAt;
        this.closeSolution = closeSolution;
        this.closeCode = closeCode;
        this.closeKb = closeKb;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public WTicket(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.KEY</code>. 「key」- 单据主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.KEY</code>. 「key」- 单据主键
     */
    @Override
    public WTicket setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.SERIAL</code>. 「serial」- 单据编号，使用
     * X_NUMBER 生成
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.SERIAL</code>. 「serial」- 单据编号，使用
     * X_NUMBER 生成
     */
    @Override
    public WTicket setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.NAME</code>. 「name」- 单据标题
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.NAME</code>. 「name」- 单据标题
     */
    @Override
    public WTicket setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CODE</code>. 「code」- 单据系统编号（内码）
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CODE</code>. 「code」- 单据系统编号（内码）
     */
    @Override
    public WTicket setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.TYPE</code>. 「type」- 主单类型类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.TYPE</code>. 「type」- 主单类型类型
     */
    @Override
    public WTicket setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.PHASE</code>. 「phase」-
     * 主单据所属阶段（状态描述，由于挂TODO，所以不使用status）
     */
    @Override
    public String getPhase() {
        return this.phase;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.PHASE</code>. 「phase」-
     * 主单据所属阶段（状态描述，由于挂TODO，所以不使用status）
     */
    @Override
    public WTicket setPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public WTicket setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public WTicket setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public WTicket setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.MODEL_COMPONENT</code>.
     * 「modelComponent」- 关联的待办组件记录
     */
    @Override
    public String getModelComponent() {
        return this.modelComponent;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.MODEL_COMPONENT</code>.
     * 「modelComponent」- 关联的待办组件记录
     */
    @Override
    public WTicket setModelComponent(String modelComponent) {
        this.modelComponent = modelComponent;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_KEY</code>.
     * 「flowDefinitionKey」- 流程定义的KEY, getProcessDefinitionKey
     */
    @Override
    public String getFlowDefinitionKey() {
        return this.flowDefinitionKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_KEY</code>.
     * 「flowDefinitionKey」- 流程定义的KEY, getProcessDefinitionKey
     */
    @Override
    public WTicket setFlowDefinitionKey(String flowDefinitionKey) {
        this.flowDefinitionKey = flowDefinitionKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_ID</code>.
     * 「flowDefinitionId」- 流程定义的ID，getProcessDefinitionKey
     */
    @Override
    public String getFlowDefinitionId() {
        return this.flowDefinitionId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_DEFINITION_ID</code>.
     * 「flowDefinitionId」- 流程定义的ID，getProcessDefinitionKey
     */
    @Override
    public WTicket setFlowDefinitionId(String flowDefinitionId) {
        this.flowDefinitionId = flowDefinitionId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_INSTANCE_ID</code>.
     * 「flowInstanceId」- 流程定义的ID，getProcessId
     */
    @Override
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_INSTANCE_ID</code>.
     * 「flowInstanceId」- 流程定义的ID，getProcessId
     */
    @Override
    public WTicket setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.FLOW_END</code>. 「flowEnd」- 主单是否执行完成
     */
    @Override
    public Boolean getFlowEnd() {
        return this.flowEnd;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.FLOW_END</code>. 「flowEnd」- 主单是否执行完成
     */
    @Override
    public WTicket setFlowEnd(Boolean flowEnd) {
        this.flowEnd = flowEnd;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.TITLE</code>. 「title」- 主单业务标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.TITLE</code>. 「title」- 主单业务标题
     */
    @Override
    public WTicket setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.DESCRIPTION</code>. 「description」-
     * 主单描述内容
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.DESCRIPTION</code>. 「description」-
     * 主单描述内容
     */
    @Override
    public WTicket setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CATALOG</code>. 「catalog」- 关联服务目录
     */
    @Override
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CATALOG</code>. 「catalog」- 关联服务目录
     */
    @Override
    public WTicket setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CATEGORY</code>. 「category」- 业务类别
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CATEGORY</code>. 「category」- 业务类别
     */
    @Override
    public WTicket setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CATEGORY_SUB</code>. 「categorySub」-
     * 子类别
     */
    @Override
    public String getCategorySub() {
        return this.categorySub;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CATEGORY_SUB</code>. 「categorySub」-
     * 子类别
     */
    @Override
    public WTicket setCategorySub(String categorySub) {
        this.categorySub = categorySub;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.OWNER</code>. 「owner」- 制单人/拥有者
     */
    @Override
    public String getOwner() {
        return this.owner;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.OWNER</code>. 「owner」- 制单人/拥有者
     */
    @Override
    public WTicket setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.SUPERVISOR</code>. 「supervisor」- 监督人
     */
    @Override
    public String getSupervisor() {
        return this.supervisor;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.SUPERVISOR</code>. 「supervisor」- 监督人
     */
    @Override
    public WTicket setSupervisor(String supervisor) {
        this.supervisor = supervisor;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.OPEN_BY</code>. 「openBy」- 开单人
     */
    @Override
    public String getOpenBy() {
        return this.openBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.OPEN_BY</code>. 「openBy」- 开单人
     */
    @Override
    public WTicket setOpenBy(String openBy) {
        this.openBy = openBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.OPEN_AT</code>. 「openAt」- 开单时间
     */
    @Override
    public LocalDateTime getOpenAt() {
        return this.openAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.OPEN_AT</code>. 「openAt」- 开单时间
     */
    @Override
    public WTicket setOpenAt(LocalDateTime openAt) {
        this.openAt = openAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CANCEL_BY</code>. 「cancelBy」- 中断人
     */
    @Override
    public String getCancelBy() {
        return this.cancelBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CANCEL_BY</code>. 「cancelBy」- 中断人
     */
    @Override
    public WTicket setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CANCEL_AT</code>. 「cancelAt」- 中断时间
     */
    @Override
    public LocalDateTime getCancelAt() {
        return this.cancelAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CANCEL_AT</code>. 「cancelAt」- 中断时间
     */
    @Override
    public WTicket setCancelAt(LocalDateTime cancelAt) {
        this.cancelAt = cancelAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_BY</code>. 「closeBy」- 关闭人
     */
    @Override
    public String getCloseBy() {
        return this.closeBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_BY</code>. 「closeBy」- 关闭人
     */
    @Override
    public WTicket setCloseBy(String closeBy) {
        this.closeBy = closeBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_AT</code>. 「closeAt」- 关闭时间
     */
    @Override
    public LocalDateTime getCloseAt() {
        return this.closeAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_AT</code>. 「closeAt」- 关闭时间
     */
    @Override
    public WTicket setCloseAt(LocalDateTime closeAt) {
        this.closeAt = closeAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_SOLUTION</code>.
     * 「closeSolution」- 关闭解决方案
     */
    @Override
    public String getCloseSolution() {
        return this.closeSolution;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_SOLUTION</code>.
     * 「closeSolution」- 关闭解决方案
     */
    @Override
    public WTicket setCloseSolution(String closeSolution) {
        this.closeSolution = closeSolution;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_CODE</code>. 「closeCode」- 关闭代码
     */
    @Override
    public String getCloseCode() {
        return this.closeCode;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_CODE</code>. 「closeCode」- 关闭代码
     */
    @Override
    public WTicket setCloseCode(String closeCode) {
        this.closeCode = closeCode;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CLOSE_KB</code>. 「closeKb」-
     * 关闭时KB链接地址
     */
    @Override
    public String getCloseKb() {
        return this.closeKb;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CLOSE_KB</code>. 「closeKb」-
     * 关闭时KB链接地址
     */
    @Override
    public WTicket setCloseKb(String closeKb) {
        this.closeKb = closeKb;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public WTicket setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public WTicket setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public WTicket setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public WTicket setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public WTicket setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public WTicket setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public WTicket setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TICKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public WTicket setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WTicket (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(phase);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(modelCategory);
        sb.append(", ").append(modelComponent);
        sb.append(", ").append(flowDefinitionKey);
        sb.append(", ").append(flowDefinitionId);
        sb.append(", ").append(flowInstanceId);
        sb.append(", ").append(flowEnd);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(catalog);
        sb.append(", ").append(category);
        sb.append(", ").append(categorySub);
        sb.append(", ").append(owner);
        sb.append(", ").append(supervisor);
        sb.append(", ").append(openBy);
        sb.append(", ").append(openAt);
        sb.append(", ").append(cancelBy);
        sb.append(", ").append(cancelAt);
        sb.append(", ").append(closeBy);
        sb.append(", ").append(closeAt);
        sb.append(", ").append(closeSolution);
        sb.append(", ").append(closeCode);
        sb.append(", ").append(closeKb);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IWTicket from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setPhase(from.getPhase());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
        setModelComponent(from.getModelComponent());
        setFlowDefinitionKey(from.getFlowDefinitionKey());
        setFlowDefinitionId(from.getFlowDefinitionId());
        setFlowInstanceId(from.getFlowInstanceId());
        setFlowEnd(from.getFlowEnd());
        setTitle(from.getTitle());
        setDescription(from.getDescription());
        setCatalog(from.getCatalog());
        setCategory(from.getCategory());
        setCategorySub(from.getCategorySub());
        setOwner(from.getOwner());
        setSupervisor(from.getSupervisor());
        setOpenBy(from.getOpenBy());
        setOpenAt(from.getOpenAt());
        setCancelBy(from.getCancelBy());
        setCancelAt(from.getCancelAt());
        setCloseBy(from.getCloseBy());
        setCloseAt(from.getCloseAt());
        setCloseSolution(from.getCloseSolution());
        setCloseCode(from.getCloseCode());
        setCloseKb(from.getCloseKb());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IWTicket> E into(E into) {
        into.from(this);
        return into;
    }
}
