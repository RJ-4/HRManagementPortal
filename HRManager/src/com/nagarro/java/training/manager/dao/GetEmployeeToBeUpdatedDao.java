package com.nagarro.java.training.manager.dao;

import com.nagarro.java.training.manager.models.Employee;

public interface GetEmployeeToBeUpdatedDao {

	public Employee getExistingEmployee(int employeeCode);
	
}
