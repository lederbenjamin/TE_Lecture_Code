package com.techelevator.domain;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String id;
	
	
	public Employee (String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public abstract double calculatePay();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return getId() + ": " + getFirstName() + " " + getLastName();
	}
	
	
	
	

}
