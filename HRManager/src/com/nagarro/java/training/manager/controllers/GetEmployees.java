package com.nagarro.java.training.manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.FetchEmployeesService;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class GetEmployees {
	
	@Autowired
	FetchEmployeesService fetchEmployeesService;
	
	@RequestMapping(GET_EMPLOYEES_CONTROLLER_PATH)
	public String getEmployees(Model model) {
		
		List<Employee> employeeList = fetchEmployeesService.fetchAllEmployees();
		
		model.addAttribute("employeeList", employeeList);
		
		model.addAttribute("isGetEmployeesButtonClicked", true);
		
		return EMPLOYEE_LIST_PAGE;
	}
}
