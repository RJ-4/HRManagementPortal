package com.nagarro.java.training.manager.dao.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Repository;

import com.nagarro.java.training.manager.dao.AddEmployeeDao;
import com.nagarro.java.training.manager.models.Employee;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Repository
public class AddEmployeeDaoImpl implements AddEmployeeDao {

	@Override
	public void addEmployee(Employee employee) throws Exception {

		Client client = ClientBuilder.newClient();
		
		client.target(EMPLOYEES_API)
			  .request(MediaType.APPLICATION_JSON)
			  .post(Entity.json(employee));
	
	}

}
