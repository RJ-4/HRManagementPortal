package com.nagarro.java.training.manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.nagarro.java.training.manager.constants.Constants.*;

@Controller
public class ShowEmployeeListPageController {

	@RequestMapping(SHOW_EMPLOYEE_LIST_PAGE_CONTROLLER_PATH)
	public String showEmployeeListPage() {
		
		return EMPLOYEE_LIST_PAGE;
	}
}
