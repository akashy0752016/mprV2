package com.ddugky.mprmis.service;

import java.util.List;

import com.ddugky.mprmis.bean.master.AccessModuleListForUserAndMenuBean;
import com.ddugky.mprmis.model.projectSetup.ProjectDetails;
import com.ddugky.mprmis.model.user.UserMaster;

public interface LoginService {
	
	public List<ProjectDetails> getAssignProjectList(UserMaster userMaster);
	public AccessModuleListForUserAndMenuBean getAccessModuleListForMenu(UserMaster userMaster);
	
}
