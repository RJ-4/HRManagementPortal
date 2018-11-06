package com.nagarro.java.training.manager.dao.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Repository;

import com.nagarro.java.training.manager.dao.UpdateEmployeeDao;
import com.nagarro.java.training.manager.models.Employee;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Repository
public class UpdateEmployeeDaoImpl implements UpdateEmployeeDao {

	@Override
	public void updateEmployee(Employee employee) {

		Client client = ClientBuilder.newClient();
		
		client.target(EMPLOYEES_API + "/" + employee.getEmployeeCode())
			  .request(MediaType.APPLICATION_JSON)
			  .put(Entity.json(employee));
		
	}

}
