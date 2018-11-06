package com.nagarro.java.training.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.GetEmployeeToBeUpdatedService;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class ShowUpdateEmployeePageController {

	@Autowired
	GetEmployeeToBeUpdatedService getEmployeeToBeUpdatedService;
	
	@RequestMapping(SHOW_UPDATE_EMPLOYEE_PAGE_CONTROLLER_PATH)
	public String showUpdateEmployeePageController(@RequestParam("employeeCode") int employeeCode,
													Model model) {

		Employee employeeToBeUpdated = getEmployeeToBeUpdatedService.getExistingEmployee(employeeCode);
		
		model.addAttribute("employee", employeeToBeUpdated);
		
		model.addAttribute("isToBeUpdated", true);
		
		return ADD_EMPLOYEE_PAGE;
	}
}
