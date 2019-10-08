package com.ddugky.mprmis.repository.user.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ddugky.mprmis.bean.master.AccessModuleListForUserAndMenuBean;
import com.ddugky.mprmis.bean.master.FormModuleMasterBean;
import com.ddugky.mprmis.bean.master.FormModuleMenuBean;
import com.ddugky.mprmis.model.user.UserMaster;
import com.ddugky.mprmis.repository.user.AssignRoleMasterDao;
import com.ddugky.mprmis.repository.user.FormModuleMasterDao;

@Repository
@Transactional
public class AssignRoleMasterDaoImpl implements AssignRoleMasterDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	FormModuleMasterDao formModuleMasterDao;

	@Override
	public AccessModuleListForUserAndMenuBean getAccessModuleListForMenu(UserMaster user) {
		// TODO Auto-generated method stub
		AccessModuleListForUserAndMenuBean loginBean = null;
		String querySql = "select um.user_name,um.email_id,um.role_name,um.role_desc,fmm.form_name,fmm.form_name as module_name, "
				+ "fmm.module_name as master_module,fmm.order_no,fmm.help, fmm.url,arm.permission,arm.role_id,um.id, "
				+ "um.role_id as userRoleId,fmm.id as formId,um.state_id,COALESCE( fmm.master_order_no, 0 )||''||fmm.order_no "
				+ "from assign_role_master as arm left join ( select a.id,a.form_name,b.id as module_name,a.url,a.order_no,b.order_no as master_order_no,"
				+ "a.help, a.module_name as master_module from form_module_master as a left join form_module_master as b on a.module_name=b.id ) as fmm "
				+ "on arm.form_module_master_id=fmm.id "
				+ "left join ( select um.user_name,um.state_id,um.email_id,um.role_id, rm.role_name,rm.role_desc,um.id "
				+ "from user_master as um,role_master as rm where rm.id= :roleId and um.id= :userId ) as um "
				+ "on arm.role_id=um.role_id where um.role_id= :roleId and um.id= :userId  order by COALESCE( fmm.master_order_no, 0 )||''||fmm.order_no";
		
		try {
			Query query = entityManager.createNativeQuery(querySql);
			query.setParameter("roleId", user.getRoleId()!=null?user.getRoleId():"");
			query.setParameter("userId", user.getId()!=null?user.getId():"");
			List result = query.getResultList();
			loginBean=new AccessModuleListForUserAndMenuBean();
			Map<String, Map<String,FormModuleMenuBean>>  moduleList=new LinkedHashMap<String, Map<String,FormModuleMenuBean>>();
			for(Object[] temp :(List<Object[]>) query.getResultList()) {
				if(loginBean.getUserId()==null||loginBean.getUserId().equalsIgnoreCase("")||loginBean.getUserId().equalsIgnoreCase("null")||loginBean.getUserId().equalsIgnoreCase("0")){
					loginBean.setUserId(temp[12]+"");
				}
				if(loginBean.getUserName()==null||loginBean.getUserName().equalsIgnoreCase("")||loginBean.getUserName().equalsIgnoreCase("null")||loginBean.getUserName().equalsIgnoreCase("0")){
					loginBean.setUserName(temp[0]+"");
				}
				if(loginBean.getEmailId()==null||loginBean.getEmailId().equalsIgnoreCase("")||loginBean.getEmailId().equalsIgnoreCase("null")||loginBean.getEmailId().equalsIgnoreCase("0")){
					loginBean.setEmailId(temp[1]+"");
				}
				if(loginBean.getRoleId() ==null||loginBean.getRoleId().equalsIgnoreCase("")||loginBean.getRoleId().equalsIgnoreCase("null")||loginBean.getRoleId().equalsIgnoreCase("0")){
					loginBean.setRoleId(temp[11]+"");
				}
				if(loginBean.getRoleDesc()==null||loginBean.getRoleDesc().equalsIgnoreCase("")||loginBean.getRoleDesc().equalsIgnoreCase("null")||loginBean.getRoleDesc().equalsIgnoreCase("0")){
					loginBean.setRoleDesc(temp[3]+"");
				}
				if(loginBean.getUserRoleId()==null||loginBean.getUserRoleId().equalsIgnoreCase("")||loginBean.getUserRoleId().equalsIgnoreCase("null")||loginBean.getUserRoleId().equalsIgnoreCase("0")){
					loginBean.setUserRoleId(temp[13]+"");
				}
				if(loginBean.getStateId()==null||loginBean.getStateId().equalsIgnoreCase("")||loginBean.getStateId().equalsIgnoreCase("null")||loginBean.getStateId().equalsIgnoreCase("0")){
					loginBean.setStateId(temp[15]+"");
				}
				
				LinkedHashMap<String, FormModuleMenuBean> moduleMap=null;
				FormModuleMenuBean module=null;
				module=new FormModuleMenuBean();
				module.setFormName((temp[4]+"").toLowerCase());
				module.setHelp(temp[8]+"");
				module.setMasterModule(temp[6]+"");
				module.setModuleName(temp[5]+"");
				module.setOrderNo(temp[7]+"");
				module.setPermission(temp[10]+"");
				module.setUrl(temp[9]+"");
				
				if((temp[6]!=null && !(temp[6]+"").equalsIgnoreCase("0")) ){
					if(moduleList.containsKey(temp[6]+"")){
						moduleMap=(LinkedHashMap)moduleList.get(temp[6]+"");
						if(moduleMap.containsKey(temp[14]+"")){
							module=moduleMap.get(temp[14]+"");
							module.setPermission(getPermission(temp[10]+"",module.getPermission()));
						}
					}
					else{
						moduleMap=new LinkedHashMap<String,FormModuleMenuBean>();
					}
					moduleMap.put(temp[14]+"", module);
					moduleList.put(temp[6]+"", moduleMap);
				} else{
					if(moduleList.containsKey(temp[14]+"")){
						moduleMap=(LinkedHashMap)moduleList.get(temp[14]+"");
					}
					else{
						moduleMap=new LinkedHashMap<String,FormModuleMenuBean>();
					}
					moduleMap.put(temp[14]+"", module);
					moduleList.put(temp[14]+"", moduleMap);
				} 
			}
			moduleList=getFilteredModuleList(moduleList);
			loginBean.setModuleList(moduleList);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return loginBean;
	}
	
	public String getPermission(String newPermission, String OldPermission) {
		String permission="";
		for(int i=0;i<newPermission.length();i++){
			if(newPermission.charAt(i)==OldPermission.charAt(i)){
				permission=permission+newPermission.charAt(i);
			}
			else{
				permission=permission+"0";
			}
		}
		return permission;
	}
	
	private Map<String, Map<String, FormModuleMenuBean>> getFilteredModuleList(Map<String, Map<String, FormModuleMenuBean>> moduleList) {
		List<FormModuleMasterBean> masterModules= formModuleMasterDao.getAllMasterModuleList();
//		//System.out.println("List is ===> "+masterModules);
		for(FormModuleMasterBean fBean:masterModules){
			if(moduleList.containsKey(fBean.getId())){
				Map<String, FormModuleMenuBean> moduleMap=moduleList.get(fBean.getId());
//				//System.out.println("Module Map Is ==> "+moduleMap);
				FormModuleMenuBean formModule=moduleMap.get(fBean.getId());
				if(formModule.getPermission().startsWith("00")){
						moduleList.remove(fBean.getId());
				}
			}
		}
		return moduleList;
	}
}
