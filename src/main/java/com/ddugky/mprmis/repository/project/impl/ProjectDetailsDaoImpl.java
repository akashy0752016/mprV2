package com.ddugky.mprmis.repository.project.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ddugky.mprmis.bean.ProjectMapping;
import com.ddugky.mprmis.model.master.RoleMaster;
import com.ddugky.mprmis.model.projectSetup.ProjectDetails;
import com.ddugky.mprmis.model.user.UserMaster;
import com.ddugky.mprmis.repository.master.RoleMasterRepository;
import com.ddugky.mprmis.repository.project.ProjectDetailsDao;
import com.ddugky.mprmis.repository.user.UserRepository;

@Repository
@Transactional
public class ProjectDetailsDaoImpl implements ProjectDetailsDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private RoleMasterRepository roleMasterRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<ProjectDetails> getAssignProjectList(UserMaster userMaster) {
		// TODO Auto-generated method stub
		List<ProjectDetails> list=null;
		RoleMaster role = (roleMasterRepository.findById(userMaster.getRoleId())).get();
		
		if(role.getId().equalsIgnoreCase("5") || role.getId().equalsIgnoreCase("10003")|| role.getId().equalsIgnoreCase("10016")){//For MORD and state super Admin
			list=getAllProjects();
		} else if(role.getId().equalsIgnoreCase("45") || role.getId().equalsIgnoreCase("10004") ){ 		//FOR SRLM ADMIN and DA
			list=getAllProjectsCreatedBy(userMaster);
		}
		else if(role.getId().equalsIgnoreCase("4") || role.getId().equalsIgnoreCase("10005")){		// FOR PIA and DA
			list=getAllProjectsForPIA(userMaster);
		}
		else if(role.getId().equalsIgnoreCase("5001")||role.getId().equalsIgnoreCase("1") || role.getId().equalsIgnoreCase("10011")){		// FOR CTSA and DA
			list=getAllProjectsForCTSA(userMaster);
		}
		else{// if(role.getId().equalsIgnoreCase("49")|| role.getId().equalsIgnoreCase("10002") || role.getId().equalsIgnoreCase("10001") || role.getId().equalsIgnoreCase("10003")){//FOR SRLM USER ,PIA USER , MORD USER AND CTSA USER
			list=getAllProjectsCreatedByAssignTo(userMaster);
		}
		
		return list;
	}

	@Override
	public List<ProjectDetails> getAllProjects() {
		// TODO Auto-generated method stub
		List<ProjectDetails> list=new ArrayList<ProjectDetails>();
		Session session = entityManager.unwrap(Session.class);
		try {
			Criteria criteria = session.createCriteria(ProjectDetails.class,"project")
	                   .createAlias("project.state", "state") 
	                   .addOrder(Order.asc("state.stateName"));
			if(criteria.list()!=null){
	            for(Object o : criteria.list()) {
	            	ProjectDetails ob=(ProjectDetails)o;
	            	
	            	if(ob.getPiaPrn()==null || ob.getState()==null){
	            		ob.setProjectID(ob.getProjectID()+" () - ");
	            	}
	            	else{
	            		//ob.setProjectID(ob.getProjectID()+" ("+ob.getState().getStateName()+") - "+ob.getPiaPrn().getUserName());
	            		ob.setProjectID(ob.getPiaPrn().getUserName()+" -("+ob.getState().getStateName()+") - "+ob.getProjectID());

	            	}
				    list.add(ob);
				}
            }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ProjectDetails> getAllProjectsCreatedBy(UserMaster userMaster) {
		// TODO Auto-generated method stub
		List<ProjectDetails> list=new ArrayList<ProjectDetails>();
		Session session = entityManager.unwrap(Session.class);
		try {
            Criteria criteria = session.createCriteria(ProjectDetails.class,"project")
	                   .createAlias("project.state", "state") 
	                   .addOrder(Order.asc("state.stateName"));
	                   
	                   if(userMaster.getRoleId().equalsIgnoreCase("10004")){
//	                	   UserMaster um = (UserMaster)AbsFinder.getById(UserMaster.class, userMaster.getId());
	                	   UserMaster um1 = userRepository.findById(userMaster.getId()).get();
	                	   criteria.add(Restrictions.eq("state.stateId", um1.getState().getStateId()));
	                   }else
	                	   criteria.add(Restrictions.eq("state", userMaster.getState()));
	                   
            if(criteria.list()!=null){
	            for(Object o : criteria.list()) {
	            	ProjectDetails ob=(ProjectDetails)o;
	            	if(ob.getState() != null && ob.getPiaPrn() != null )
	            	//	ob.setProjectID(ob.getProjectID()+" ("+ob.getState().getStateName()+") - "+ob.getPiaPrn().getUserName());
		            	ob.setProjectID(ob.getPiaPrn().getUserName()+" -("+ob.getState().getStateName()+") - "+ob.getProjectID());

				    list.add(ob);
				}
            }
        }
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ProjectDetails> getAllProjectsForPIA(UserMaster userMaster) {
		// TODO Auto-generated method stub
		List<ProjectDetails> list=new ArrayList<ProjectDetails>();
		Session session = entityManager.unwrap(Session.class);
		try {
            Criteria criteria = session.createCriteria(ProjectDetails.class,"project")
	                   .createAlias("project.state", "state")
	                   .addOrder(Order.asc("state.stateName"));
	                   if(userMaster.getRoleId().equalsIgnoreCase("10005")){
//	                	   UserMaster um = (UserMaster)AbsFinder.getById(UserMaster.class, userMaster.getId());
	                	   criteria.add(Restrictions.eq("piaPrn.id", userMaster.getCreatedBy()));   
	                   }else
	                	   criteria.add(Restrictions.eq("piaPrn", userMaster));
	                   
            if(criteria.list()!=null){
	            for(Object o : criteria.list()) {
	            	ProjectDetails ob=(ProjectDetails)o;
	            	//ob.setProjectID(ob.getProjectID()+" ("+ob.getState().getStateName()+") - "+ob.getPiaPrn().getUserName());
	            	ob.setProjectID(ob.getPiaPrn().getUserName()+" -("+ob.getState().getStateName()+") - "+ob.getProjectID());

				    list.add(ob);
				}
            }
        }
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ProjectDetails> getAllProjectsForCTSA(UserMaster userMaster) {
		// TODO Auto-generated method stub
		List<ProjectDetails> list=new ArrayList<ProjectDetails>();
		Session session = entityManager.unwrap(Session.class);
		try {
            Criteria criteria = session.createCriteria(ProjectDetails.class,"project")
	                   .createAlias("project.state", "state") 
	                   .addOrder(Order.asc("state.stateName"));
	                   
	                   if(userMaster.getRoleId().equalsIgnoreCase("10011")){
//	                	   UserMaster um = (UserMaster)AbsFinder.getById(UserMaster.class, userMaster.getId());
	                	   UserMaster um1 = (UserMaster)userRepository.findById(userMaster.getCreatedBy()).get();
	                	   criteria.add(Restrictions.eq("ctsaMaster.id", um1.getCtsa().getId()));
	                   }else
	                	   criteria.add(Restrictions.eq("ctsaMaster", userMaster.getCtsa()));
	                   
            if(criteria.list()!=null){
	            for(Object o : criteria.list()) {
	            	ProjectDetails ob=(ProjectDetails)o;
	            	//ob.setProjectID(ob.getProjectID()+" ("+ob.getState().getStateName()+") - "+ob.getPiaPrn().getUserName());
	                         	ob.setProjectID(ob.getPiaPrn().getUserName()+" -("+ob.getState().getStateName()+") - "+ob.getProjectID());

				    list.add(ob);
				}
            }
        }
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ProjectDetails> getAllProjectsCreatedByAssignTo(UserMaster userMaster) {
		// TODO Auto-generated method stub
		List<ProjectDetails> list=new ArrayList<ProjectDetails>();
		Session session = entityManager.unwrap(Session.class);
		try {
            Criteria criteria = session.createCriteria(ProjectMapping.class).add(Restrictions.eq("userId", userMaster.getId()));
            String[] idList=new String[criteria.list().size()];
            int i=0;
            for(Object o : criteria.list()) {
            	ProjectMapping ob=(ProjectMapping)o;
            	idList[i]=ob.getProjectId();
            	i++;
			}
            Criteria criteria1 = session.createCriteria(ProjectDetails.class);
            if(idList.length >=1){
	            criteria1.add(Restrictions.in("id", idList));
	            if(criteria1.list()!=null){
		            for(Object o : criteria1.list()) {
		            	ProjectDetails ob=(ProjectDetails)o;
		            	ob.setProjectID(ob.getPiaPrn().getUserName()+" -("+ob.getState().getStateName()+") - "+ob.getProjectID());
		            	list.add(ob);
					}
	            }
            }
            
        }
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
