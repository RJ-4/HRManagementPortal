package com.nagarro.java.training.manager.services.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.java.training.manager.dao.GetEmployeeToBeUpdatedDao;
import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.GetEmployeeToBeUpdatedService;

@Service
public class GetEmployeeToBeUpdatedServiceImpl implements GetEmployeeToBeUpdatedService {

	@Autowired
	GetEmployeeToBeUpdatedDao getEmployeeToBeUpdatedDao;
	
	@Override
	public Employee getExistingEmployee(int employeeCode) {

		return getEmployeeToBeUpdatedDao.getExistingEmployee(employeeCode);
		
	}

}
