package com.dynamisch.demo.dao.impl;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.dynamisch.demo.dao.LoginDao;
import com.dynamisch.demo.model.Employee;


@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean validate(Employee emp) {
		// TODO Auto-generated method stub
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		@SuppressWarnings("deprecation")
		Criteria ct=session.createCriteria(Employee.class);
		ct.add(Restrictions.eq("email", emp.getEmail()));
		ct.add(Restrictions.eq("password", emp.getPassword()));
		@SuppressWarnings("unchecked")
		List<Employee> result=ct.list();
		if(result.size()>0) {
			return true;
		}
		return false;
	}

}
