package com.nagarro.java.training.manager.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.java.training.manager.dao.SignUpDao;
import com.nagarro.java.training.manager.models.Manager;
import com.nagarro.java.training.manager.services.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	SignUpDao signUpDao;
	
	@Override
	public void signUpManager(Manager manager) throws Exception {
		
		signUpDao.addManager(manager);
	}

}
