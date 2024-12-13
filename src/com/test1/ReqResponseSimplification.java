package com.test1;

public class ReqResponseSimplification {
	private Integer requestResponseTagId;
	private String reqXml;
	private String responseXml;
	private boolean xmlProvider;
	private String xmlFormatter;
	private String comparisonModule;
	private String header;
	private Integer xmlTagCount;
	private String commonTagName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ReqResponseSimplification() {

	}

	public ReqResponseSimplification(Integer requestResponseTagId, String reqXml, String responseXml,
			boolean xmlProvider, String xmlFormatter, String comparisonModule, String header, Integer xmlTagCount,
			String commonTagName, String creationDate, String modifiedDate, String entityState) {
		super();
		this.requestResponseTagId = requestResponseTagId;
		this.reqXml = reqXml;
		this.responseXml = responseXml;
		this.xmlProvider = xmlProvider;
		this.xmlFormatter = xmlFormatter;
		this.comparisonModule = comparisonModule;
		this.header = header;
		this.xmlTagCount = xmlTagCount;
		this.commonTagName = commonTagName;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRequestResponseTagId() {
		return requestResponseTagId;
	}

	public void setRequestResponseTagId(Integer requestResponseTagId) {
		this.requestResponseTagId = requestResponseTagId;
	}

	public String getReqXml() {
		return reqXml;
	}

	public void setReqXml(String reqXml) {
		this.reqXml = reqXml;
	}

	public String getResponseXml() {
		return responseXml;
	}

	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
	}

	public boolean isXmlProvider() {
		return xmlProvider;
	}

	public void setXmlProvider(boolean xmlProvider) {
		this.xmlProvider = xmlProvider;
	}

	public String getXmlFormatter() {
		return xmlFormatter;
	}

	public void setXmlFormatter(String xmlFormatter) {
		this.xmlFormatter = xmlFormatter;
	}

	public String getComparisonModule() {
		return comparisonModule;
	}

	public void setComparisonModule(String comparisonModule) {
		this.comparisonModule = comparisonModule;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Integer getXmlTagCount() {
		return xmlTagCount;
	}

	public void setXmlTagCount(Integer xmlTagCount) {
		this.xmlTagCount = xmlTagCount;
	}

	public String getCommonTagName() {
		return commonTagName;
	}

	public void setCommonTagName(String commonTagName) {
		this.commonTagName = commonTagName;
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
