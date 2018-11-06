package com.nagarro.java.training.manager.dao.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Repository;

import com.nagarro.java.training.manager.dao.GetEmployeeToBeUpdatedDao;
import com.nagarro.java.training.manager.models.Employee;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Repository
public class GetEmployeeToBeUpdatedDaoImpl implements GetEmployeeToBeUpdatedDao {

	@Override
	public Employee getExistingEmployee(int employeeCode) {

		Client client = ClientBuilder.newClient();
		
		Employee employeeToBeUpdated = client.target(EMPLOYEES_API + "/" + employeeCode)
											 .request(MediaType.APPLICATION_JSON)
											 .get(Employee.class);
		
		return employeeToBeUpdated;
		
	}

}
