package com.nagarro.java.training.manager.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.java.training.manager.dao.SignUpDao;
import com.nagarro.java.training.manager.models.Manager;

@Repository
public class SignUpDaoImpl implements SignUpDao {

	@Autowired
	SessionFactory factory;
	
	@Override
	@Transactional
	public void addManager(Manager manager) throws Exception{

		Session session = factory.getCurrentSession();
		
		session.save(manager);
	}

}
