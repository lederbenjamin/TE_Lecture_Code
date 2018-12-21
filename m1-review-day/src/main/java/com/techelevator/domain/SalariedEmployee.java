package com.techelevator.domain;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee{
	
	private double annualSalary;	
	
	public SalariedEmployee(String id, String firstName, String lastName, double annualSalary) {
		super(id, firstName, lastName);
		this.annualSalary = annualSalary;

	}


	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public double calculatePay() {
		DecimalFormat df = new DecimalFormat(".##");
		return annualSalary/52;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat(".##");
		return "Salaried Employee: " + super.toString() + " weekly salary: " + df.format(calculatePay());
	}

}
