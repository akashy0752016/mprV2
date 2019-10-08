package com.ddugky.mprmis.bean.master;

import java.io.Serializable;
import java.util.Map;

public class AccessModuleListForUserAndMenuBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String emailId;
	private String roleName;
	private String roleDesc;
	private Map<String,Map<String,FormModuleMenuBean>> moduleList;
	private String roleId;
	private String userId;
	private String userRoleId;
	private String stateId;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public Map<String, Map<String, FormModuleMenuBean>> getModuleList() {
		return moduleList;
	}
	public void setModuleList(Map<String, Map<String, FormModuleMenuBean>> moduleList) {
		this.moduleList = moduleList;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
}
