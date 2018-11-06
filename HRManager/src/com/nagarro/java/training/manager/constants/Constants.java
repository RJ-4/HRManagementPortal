package com.nagarro.java.training.manager.constants;

public class Constants {

	public static final String BASE_PACKAGE_FOR_SCAN = "com.nagarro.java.training.manager";
	
	public static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/views/";
	
	public static final String VIEW_RESOLVER_SUFFIX = ".jsp";
	
	public static final String RESOURCE_HANDLER = "/resources/**";
	
	public static final String RESOURCE_LOCATION = "/resources/";
	
	public static final String COMPONENT_SCAN = "{" + BASE_PACKAGE_FOR_SCAN + "}";
	
	public static final String HIBERNATE_CONFIG_PROPERTIES_LOCATION = "classpath:application.properties";
	
	public static final String LOGIN_QUERY = "FROM Manager WHERE username = :username AND password = :password";
	
	public static final String EMPLOYEES_API = "http://localhost:8081/EmployeeServer1/api/employees";
	
	public static final String EMPLOYEE_NAME_VALIDATION_MESSAGE = "Employee name cannot be empty!!!";
	
	public static final String EMPLOYEE_LOCATION_VALIDATION_MESSAGE = "Employee location cannot be empty!!!";
	
	public static final String EMPLOYEE_EMAIL_VALIDATION_MESSAGE = "Employee email cannot be empty!!!";
	
	public static final String EMPLOYEE_DOB_VALIDATION_MESSAGE = "Employee date of birth cannot be empty!!!";
	
	public static final String ADD_EMPLOYEE_PAGE = "add-employee";
	
	public static final String EMPLOYEE_LIST_PAGE = "employee-list";
	
	public static final String UPDATE_EXISTING_EMPLOYEE_CONTROLLER_PATH = "/updateExistingEmployee";
	
	public static final String ADD_EMPLOYEE_CONTROLLER_PATH = "/addEmployee";
	
	public static final String GET_EMPLOYEES_CONTROLLER_PATH = "/getEmployees";
	
	public static final String LOGIN_MANAGER_CONTROLLER_PATH = "/loginManager";
	
	public static final String LOGIN_PAGE = "log-in";
	
	public static final String SIGN_UP_PAGE = "sign-up";
	
	public static final String SHOW_ADD_EMPLOYEE_FORM_CONTROLLER_PATH = "/showAddEmployeeForm";
	
	public static final String SHOW_EMPLOYEE_LIST_PAGE_CONTROLLER_PATH = "/employeeListPage";
	
	public static final String SHOW_UPDATE_EMPLOYEE_PAGE_CONTROLLER_PATH = "/showUpdateEmployeePage";
	
	public static final String SIGN_UP_CONTROLLER_PATH = "/signUpManager";
	
	public static final String MANAGER_TABLE_NAME = "manager";
	
	public static final String MANAGER_TABLE_USERNAME_COLUMN = "username";
	
	public static final String MANAGER_TABLE_PASSWORD_COLUMN = "password";
	
	public static final String MANAGER_USERNAME_VALIDATION_MESSAGE = "Username cannot be empty!!!";
	
	public static final String MANAGER_PASSWORD_VALIDATION_MESSAGE = "Password cannot be empty!!!";
	
}
