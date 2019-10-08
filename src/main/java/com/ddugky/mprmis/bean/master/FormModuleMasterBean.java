package com.ddugky.mprmis.bean.master;

import java.util.Date;
import java.util.List;

public class FormModuleMasterBean {
	
	public FormModuleMasterBean(){
		super();
	}
	
	public FormModuleMasterBean(String id, String formName, String moduleName, String url, String formOrderNo, String help) {
		super();
		this.id = id;
		this.formName = formName;
		this.moduleName = moduleName;
		this.url = url;
		if(formOrderNo!=null && !formOrderNo.equalsIgnoreCase("null")){
			this.formOrderNo = Integer.parseInt(formOrderNo);
		}
		if(help!=null && !help.equalsIgnoreCase("null")){
			this.help = help;
		}
		else{
			this.help="000";
		}
		if(moduleName==null||moduleName.equalsIgnoreCase("")||moduleName.equalsIgnoreCase("null")){
			this.checkForMasterModule=true;
		}
		else{
			this.checkForMasterModule=false;
		}
	}
	
	private String id;
	private String formName;
	private String moduleName;
	private String url;
	private int formOrderNo;
	private String help;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private List<FormModuleMasterBean> moduleList;
	private String permissionChar;
	private String editId;
	private boolean checkForMasterModule;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getFormOrderNo() {
		return formOrderNo;
	}

	public void setFormOrderNo(int formOrderNo) {
		this.formOrderNo = formOrderNo;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<FormModuleMasterBean> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<FormModuleMasterBean> moduleList) {
		this.moduleList = moduleList;
	}

	public String getPermissionChar() {
		return permissionChar;
	}

	public void setPermissionChar(String permissionChar) {
		this.permissionChar = permissionChar;
	}

	public String getEditId() {
		return editId;
	}

	public void setEditId(String editId) {
		this.editId = editId;
	}

	public boolean isCheckForMasterModule() {
		return checkForMasterModule;
	}

	public void setCheckForMasterModule(boolean checkForMasterModule) {
		this.checkForMasterModule = checkForMasterModule;
	}
}
