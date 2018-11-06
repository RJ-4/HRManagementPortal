package com.nagarro.java.training.manager.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.nagarro.java.training.manager.constants.Constants.*;

@Entity
@Table(name = MANAGER_TABLE_NAME)
public class Manager {

	@Id
	@Column(name = MANAGER_TABLE_USERNAME_COLUMN)
	@NotNull(message = MANAGER_USERNAME_VALIDATION_MESSAGE)
	@Size(min = 1, message = MANAGER_USERNAME_VALIDATION_MESSAGE)
	private String username;
	
	@Column(name = MANAGER_TABLE_PASSWORD_COLUMN)
	@NotNull(message = MANAGER_PASSWORD_VALIDATION_MESSAGE)
	@Size(min = 1, message = MANAGER_PASSWORD_VALIDATION_MESSAGE)
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
