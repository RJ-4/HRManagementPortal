package com.nagarro.java.training.manager.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.nagarro.java.training.manager.constants.Constants.*;

public class Employee {

	private int employeeCode;
	
	@NotNull(message = EMPLOYEE_NAME_VALIDATION_MESSAGE)
	@Size(min = 1, message = EMPLOYEE_NAME_VALIDATION_MESSAGE)
	private String employeeName;
	
	@NotNull(message = EMPLOYEE_LOCATION_VALIDATION_MESSAGE)
	@Size(min = 1, message = EMPLOYEE_LOCATION_VALIDATION_MESSAGE)
	private String employeeLocation;
	
	@NotNull(message = EMPLOYEE_EMAIL_VALIDATION_MESSAGE)
	@Size(min = 1, message = EMPLOYEE_EMAIL_VALIDATION_MESSAGE)
	private String employeeEmail;
	
	@NotNull(message = EMPLOYEE_DOB_VALIDATION_MESSAGE)
	@Size(min = 1, message = EMPLOYEE_DOB_VALIDATION_MESSAGE)
	private String dateOfBirth;

	private LocalDate employeeDateOfBirth;

	public LocalDate getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public void setEmployeeDateOfBirth(LocalDate employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public LocalDate employeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public void employeeDateOfBirth(LocalDate employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {

		this.dateOfBirth = dateOfBirth;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		this.employeeDateOfBirth = LocalDate.parse(dateOfBirth, formatter);
	}
	
}

