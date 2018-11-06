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
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.java.training.manager.models.Employee;
import com.nagarro.java.training.manager.models.Manager;
import com.nagarro.java.training.manager.services.SignUpService;
import com.nagarro.java.training.manager.validations.Validations;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class SignupController {

	@Autowired
	Validations validations;

	@Autowired
	SignUpService signUpService;
	
	@InitBinder
	private void checkForWhitespaces(WebDataBinder dataBinder) {
		
		validations.checkForWhitespaces(dataBinder);
	}
	
	@PostMapping(SIGN_UP_CONTROLLER_PATH)
	public String signUp(@Valid @ModelAttribute("manager") Manager manager, 
								BindingResult bindingResult, 
								@RequestParam("confirmPassword") String confirmPassword,
								Model model) {
		
		boolean isSignUpUnsuccessful = false;
		
		if(bindingResult.hasErrors()) {
			
			return SIGN_UP_PAGE;
		
		} else if(!manager.getPassword().equals(confirmPassword)) {
			
			isSignUpUnsuccessful = true;
			
			model.addAttribute("passwordMismatch", isSignUpUnsuccessful);
			
			return SIGN_UP_PAGE;
		
		} else {
			
			try {
				
				signUpService.signUpManager(manager);
				
				model.addAttribute("employee", new Employee());
				
				return EMPLOYEE_LIST_PAGE;
			
			} catch(Exception e) {
				
				isSignUpUnsuccessful = true;
				
				model.addAttribute("isSignUpUnsuccessful", isSignUpUnsuccessful);
				
				return SIGN_UP_PAGE;
			}
		}
	}
}
