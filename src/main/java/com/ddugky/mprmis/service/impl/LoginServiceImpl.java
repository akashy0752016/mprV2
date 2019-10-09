package com.ddugky.mprmis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddugky.mprmis.bean.master.AccessModuleListForUserAndMenuBean;
import com.ddugky.mprmis.model.projectSetup.ProjectDetails;
import com.ddugky.mprmis.model.user.UserMaster;
import com.ddugky.mprmis.repository.project.ProjectDetailsDao;
import com.ddugky.mprmis.repository.user.AssignRoleMasterDao;
import com.ddugky.mprmis.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private ProjectDetailsDao projectDetailsDao;
	
	@Autowired
	private AssignRoleMasterDao assignRoleMasterDao;
	
	@Override
	public List<ProjectDetails> getAssignProjectList(UserMaster userMaster) {
		// TODO Auto-generated method stub
		return projectDetailsDao.getAssignProjectList(userMaster);
	}

	@Override
	public AccessModuleListForUserAndMenuBean getAccessModuleListForMenu(UserMaster userMaster) {
		// TODO Auto-generated method stub
		return assignRoleMasterDao.getAccessModuleListForMenu(userMaster);
	}
}
