package com.ddugky.mprmis.repository.user;


import com.ddugky.mprmis.bean.master.AccessModuleListForUserAndMenuBean;
import com.ddugky.mprmis.model.user.UserMaster;

public interface AssignRoleMasterDao  {
	public AccessModuleListForUserAndMenuBean getAccessModuleListForMenu(UserMaster user);
}
