package com.nagarro.java.training.manager.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.java.training.manager.dao.UpdateEmployeeDao;
import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.UpdateEmployeeService;

@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {

	@Autowired
	UpdateEmployeeDao updateEmployeeDao;
	
	@Override
	public void updateEmployee(Employee employee) {

		updateEmployeeDao.updateEmployee(employee);
	}

}
