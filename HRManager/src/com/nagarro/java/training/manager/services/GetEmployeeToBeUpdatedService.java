package com.nagarro.java.training.manager.services;

import com.nagarro.java.training.manager.models.Employee;

public interface GetEmployeeToBeUpdatedService {

	public Employee getExistingEmployee(int employeeCode);
}
