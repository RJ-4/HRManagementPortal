package com.nagarro.java.training.manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.java.training.manager.models.Employee;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class ShowAddEmployeeFormController {

	@RequestMapping(SHOW_ADD_EMPLOYEE_FORM_CONTROLLER_PATH)
	public String showAddEmployeeForm(Model model) {
		
		model.addAttribute("employee", new Employee());
		
		return ADD_EMPLOYEE_PAGE;
	}
}
