package com.nagarro.java.training.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.UpdateEmployeeService;
import com.nagarro.java.training.manager.validations.Validations;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class UpdateEmployeeController {

	@Autowired
	Validations validations;
	
	@Autowired
	UpdateEmployeeService updateEmployeeService;

	@InitBinder
	private void checkForWhitespaces(WebDataBinder dataBinder) {
		
		validations.checkForWhitespaces(dataBinder);
	}
	
	@RequestMapping(UPDATE_EXISTING_EMPLOYEE_CONTROLLER_PATH)
	public String updateEmployee(@ModelAttribute("employee") Employee employee, 
								 BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()) {
			
			model.addAttribute("isToBeUpdated", true);
			
			return ADD_EMPLOYEE_PAGE;
		
		} else {
			
			updateEmployeeService.updateEmployee(employee);
			
			return EMPLOYEE_LIST_PAGE;
		}
	}
}
