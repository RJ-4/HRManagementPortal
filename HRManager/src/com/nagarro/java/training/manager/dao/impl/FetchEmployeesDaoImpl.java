package com.nagarro.java.training.manager.dao.impl;

import static com.nagarro.java.training.manager.constants.Constants.EMPLOYEES_API;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Repository;

import com.nagarro.java.training.manager.dao.FetchEmployeesDao;
import com.nagarro.java.training.manager.models.Employee;

@Repository
public class FetchEmployeesDaoImpl implements FetchEmployeesDao {

	@Override
	public List<Employee> fetchEmployees() {

		Client client = ClientBuilder.newClient();

		List<Employee> employeeList = client.target(EMPLOYEES_API)
								  			.request(MediaType.APPLICATION_JSON)
								  			.get(new GenericType<List<Employee>>(){});
		return employeeList;
	}

}
