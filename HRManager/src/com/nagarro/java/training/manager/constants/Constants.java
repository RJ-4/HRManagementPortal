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
}
