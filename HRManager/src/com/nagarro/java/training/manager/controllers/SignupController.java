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
	
	@PostMapping("/signUpManager")
	public String signUp(@Valid @ModelAttribute("manager") Manager manager, 
								BindingResult bindingResult, 
								@RequestParam("confirmPassword") String confirmPassword,
								Model model) {
		
		boolean isSignUpUnsuccessful = false;
		
		if(bindingResult.hasErrors()) {
			
			return "sign-up";
		
		} else if(!manager.getPassword().equals(confirmPassword)) {
			
			isSignUpUnsuccessful = true;
			
			model.addAttribute("passwordMismatch", isSignUpUnsuccessful);
			
			return "sign-up";
		
		} else {
			
			try {
				
				signUpService.signUpManager(manager);
				
				model.addAttribute("employee", new Employee());
				
				return "employee-list";
			
			} catch(Exception e) {
				
				isSignUpUnsuccessful = true;
				
				model.addAttribute("isSignUpUnsuccessful", isSignUpUnsuccessful);
				
				return "sign-up";
			}
		}
	}
}
