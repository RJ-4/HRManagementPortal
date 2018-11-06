package com.nagarro.java.training.manager.dao.impl;

import static com.nagarro.java.training.manager.constants.Constants.LOGIN_QUERY;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.java.training.manager.dao.LoginDao;
import com.nagarro.java.training.manager.models.Manager;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SessionFactory factory;

	@Override
	@Transactional
	public void checkManager(Manager manager) throws Exception {

		Session session = factory.getCurrentSession();
		
		String loginQuery = LOGIN_QUERY;
		
		Query query = session.createQuery(loginQuery);
		
		query.setParameter("username", manager.getUsername());
		
		query.setParameter("password", manager.getPassword());
		
		Manager loggedInManager = (Manager)query.getSingleResult();
		
	}

}
