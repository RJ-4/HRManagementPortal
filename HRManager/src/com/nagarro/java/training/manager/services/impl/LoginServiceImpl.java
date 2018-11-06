package com.nagarro.java.training.manager.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.java.training.manager.dao.LoginDao;
import com.nagarro.java.training.manager.models.Manager;
import com.nagarro.java.training.manager.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public void loginManager(Manager manager) throws Exception {
		
		loginDao.checkManager(manager);
	}

}
