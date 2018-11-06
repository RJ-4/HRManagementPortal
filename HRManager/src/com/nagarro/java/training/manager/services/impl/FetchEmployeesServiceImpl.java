package com.nagarro.java.training.manager.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.java.training.manager.dao.FetchEmployeesDao;
import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.FetchEmployeesService;

@Service
public class FetchEmployeesServiceImpl implements FetchEmployeesService {

	@Autowired
	FetchEmployeesDao fetchEmployeesDao;
	
	@Override
	public List<Employee> fetchAllEmployees() {
		
		return fetchEmployeesDao.fetchEmployees();
	}

}
