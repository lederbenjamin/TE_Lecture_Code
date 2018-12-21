package com.techelevator.overloadingexample;

public class Student {
	
	private int studentId;
	private String firstName;
	private String lastName;
	private String middleInitial;
	
	public Student() {
	}
	
	public Student (int studentId, String firstName, String lastName, String middleInitial) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
	}


	
	// this is overriding - same method signature as Object.toString
	public String toString() {
		return studentId + " " + firstName + " " + middleInitial + " " + lastName;
	}
	
	// this is overloading - same name, different parameters)
	public String toString(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public String toString(int id, String firstName, String lastName, String middleInitial ) {
		return firstName + " " + middleInitial + " " + lastName + ""  + studentId;
	}
	
	
	/*
	 *  Getters and Setters Below
	 */
	
	public int getStudentId() {
		return studentId;
	}	

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

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

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	
	
	


}
