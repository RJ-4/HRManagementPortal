package com.nagarro.java.training.manager.validations;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;

@Component
public class Validations {

	public void checkForWhitespaces(WebDataBinder dataBinder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, editor);
	}
	
	public void checkDateOfBirth(String dateOfBirth) {
		
		String date[] = dateOfBirth.split("-");
		
		Integer.parseInt(date[2]);
		
		Integer.parseInt(date[1]);
		
		Integer.parseInt(date[0]);
	}

}
