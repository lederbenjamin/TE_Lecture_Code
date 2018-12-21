package com.techelevator.demo;

public class Car {
	
	private String model;
	private String make;
	private String color;
	
	public Car() {
	}
	
	public Car(String make, String model, String color) {
		this.model = model;
		this.make = make;
		this.color = color;
		System.out.println("I am here");
	}
	
	public String toString() {
		return make + " " + model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
