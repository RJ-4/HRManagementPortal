package com.nagarro.java.training.manager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.services.AddEmployeeService;
import com.nagarro.java.training.manager.validations.Validations;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class AddEmployeeController {

	@Autowired
	Validations validations;
	
	@Autowired
	AddEmployeeService addEmployeeService;

	@InitBinder
	private void checkForWhitespaces(WebDataBinder dataBinder) {
		
		validations.checkForWhitespaces(dataBinder);
	}
	
	@RequestMapping(ADD_EMPLOYEE_CONTROLLER_PATH)
	public String addEmployee(@Valid @ModelAttribute("employee") Employee employee, 
							BindingResult bindingResult,
							Model model) {
		
		if(bindingResult.hasErrors()) {
			
			model.addAttribute("isNewEmployeeAdditionFailed", true);
			
			return ADD_EMPLOYEE_PAGE;
		
		} else {
		
			try {

				addEmployeeService.addEmployee(employee);
				
				return EMPLOYEE_LIST_PAGE;
				
			} catch (Exception e) {
				
			
				model.addAttribute("isEmployeeCodeAlreadyExists", true);
				
				return ADD_EMPLOYEE_PAGE;
			}
		}
	}
}
