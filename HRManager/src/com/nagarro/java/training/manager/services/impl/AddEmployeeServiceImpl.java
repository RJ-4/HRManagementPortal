package com.nagarro.java.training.manager.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.java.training.manager.dao.AddEmployeeDao;
import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.AddEmployeeService;

@Service
public class AddEmployeeServiceImpl implements AddEmployeeService {

	@Autowired
	AddEmployeeDao addEmployeeDao;
	
	@Override
	public void addEmployee(Employee employee) throws Exception {

		addEmployeeDao.addEmployee(employee);
	}

}
