package com.test1;

public class SimplificationControl {
	private Integer controlIndicator;
	private String name;
	private boolean processSimplification;
	private String actionSimplification;
	private long actionId;
	private String actionMethod;
	private String ruleSimplification;
	private String ruleReturns;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SimplificationControl() {

	}

	public SimplificationControl(Integer controlIndicator, String name, boolean processSimplification,
			String actionSimplification, long actionId, String actionMethod, String ruleSimplification,
			String ruleReturns, String creationDate, String modifiedDate, String entityState) {
		super();
		this.controlIndicator = controlIndicator;
		this.name = name;
		this.processSimplification = processSimplification;
		this.actionSimplification = actionSimplification;
		this.actionId = actionId;
		this.actionMethod = actionMethod;
		this.ruleSimplification = ruleSimplification;
		this.ruleReturns = ruleReturns;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getControlIndicator() {
		return controlIndicator;
	}

	public void setControlIndicator(Integer controlIndicator) {
		this.controlIndicator = controlIndicator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isProcessSimplification() {
		return processSimplification;
	}

	public void setProcessSimplification(boolean processSimplification) {
		this.processSimplification = processSimplification;
	}

	public String getActionSimplification() {
		return actionSimplification;
	}

	public void setActionSimplification(String actionSimplification) {
		this.actionSimplification = actionSimplification;
	}

	public long getActionId() {
		return actionId;
	}

	public void setActionId(long actionId) {
		this.actionId = actionId;
	}

	public String getActionMethod() {
		return actionMethod;
	}

	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod;
	}

	public String getRuleSimplification() {
		return ruleSimplification;
	}

	public void setRuleSimplification(String ruleSimplification) {
		this.ruleSimplification = ruleSimplification;
	}

	public String getRuleReturns() {
		return ruleReturns;
	}

	public void setRuleReturns(String ruleReturns) {
		this.ruleReturns = ruleReturns;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
