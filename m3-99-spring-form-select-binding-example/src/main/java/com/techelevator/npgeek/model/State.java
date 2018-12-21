package com.techelevator.npgeek.model;

import org.hibernate.validator.constraints.NotBlank;

/*
 * Java Bean to bind to the Spring Form
 */
public class State {

	@NotBlank(message="State is required")
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
