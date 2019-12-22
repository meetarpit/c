package com.dynamisch.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dynamisch.demo.dao.LoginDao;
import com.dynamisch.demo.model.Employee;
import com.dynamisch.demo.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;
	
	@Override
	public boolean validate(Employee emp) {
		// TODO Auto-generated method stub
		return loginDao.validate(emp);
	}

}
