package com.techelevator.domain;

import java.text.DecimalFormat;

public class HourlyEmployee extends Employee{
	
	private double hourlyRate;
	private double hours;

	public HourlyEmployee(String id, String firstName, String lastName, double hourlyRate, double hoursWorked) {
		super(id, firstName, lastName);
		this.hourlyRate = hourlyRate;
		this.hours = hoursWorked;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculatePay() {
		if (getHours()  <= 40) {
			return getHourlyRate() * getHours();
		}
		else {
			return 40 * getHourlyRate() + (getHours() - 40) * getHourlyRate() *1.5;
		}
		
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat(".##");
		return " Hourly Employee: " + super.toString() + " hourly wage: " + df.format(getHourlyRate())+ " hours worked: " + getHours();
	}
	
}
