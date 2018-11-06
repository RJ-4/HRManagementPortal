package com.nagarro.java.training.manager.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.models.Manager;
import com.nagarro.java.training.manager.services.LoginService;
import com.nagarro.java.training.manager.validations.Validations;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class LoginController {

	@Autowired
	Validations validations;
	
	@Autowired
	LoginService loginService;
	
	@InitBinder
	private void checkForWhitespaces(WebDataBinder dataBinder) {
		
		validations.checkForWhitespaces(dataBinder);
	}
	
	
	@PostMapping(LOGIN_MANAGER_CONTROLLER_PATH)
	public String loginManager(@Valid @ModelAttribute("manager") Manager manager, 
								BindingResult bindingResult, Model model){
		
		boolean isLoginUnsuccessful = false;
		
		if(bindingResult.hasErrors()) {
			
			return LOGIN_PAGE;
		
		} else {
			
			try {
				
				loginService.loginManager(manager);
				
				model.addAttribute("employee", new Employee());
			
				return EMPLOYEE_LIST_PAGE;
				
			} catch(Exception e) {
				
				isLoginUnsuccessful = true;
				
				model.addAttribute("isLoginUnsuccessful", isLoginUnsuccessful);
				
				return LOGIN_PAGE;
			}
			
		}
	}
}
