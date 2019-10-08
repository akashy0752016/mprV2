package com.ddugky.mprmis.repository.user.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ddugky.mprmis.bean.master.FormModuleMasterBean;
import com.ddugky.mprmis.model.master.FormModuleMaster;
import com.ddugky.mprmis.repository.user.FormModuleMasterDao;

@Repository
@Transactional
public class FormModuleMasterDaoImpl implements FormModuleMasterDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<FormModuleMasterBean> getAllMasterModuleList() {
		// TODO Auto-generated method stub
		List<FormModuleMasterBean> list=new ArrayList<FormModuleMasterBean>();
		//CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		Session session = entityManager.unwrap(Session.class);
		try {
			
			Criteria criteria = session.createCriteria(FormModuleMaster.class)
				.add(Restrictions.disjunction().add(Restrictions.isNull("moduleName")).add(Restrictions.eq("moduleName", "")).add(Restrictions.eq("moduleName", "0")));
			/*CriteriaQuery<FormModuleMaster> cq = cb.createQuery(FormModuleMaster.class);
			Root<FormModuleMaster> root = cq.from(FormModuleMaster.class);
			List<Predicate> predicates = new ArrayList<>();
			String[] moduleName = {null, "", "0"};
			cq.select(root).where(root.get("moduleName").in(moduleName));
			TypedQuery<FormModuleMaster> query = entityManager.createQuery(cq);
			System.out.println(query.getResultList().size());
			for(Object o : query.getResultList()) {
	        	FormModuleMaster ob=(FormModuleMaster)o;
	        	FormModuleMasterBean ob1=new FormModuleMasterBean();
	        	BeanUtils.copyProperties(ob1,ob);
			    list.add(ob1);
			}*/
			BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
			for(Object o : criteria.list()) {
            	FormModuleMaster ob=(FormModuleMaster)o;
            	FormModuleMasterBean ob1=new FormModuleMasterBean();
            	BeanUtils.copyProperties(ob1,ob);
			    list.add(ob1);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;
	}

}
