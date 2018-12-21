package com.techelevator.animal.abstraction;

public abstract class Animal {

	private boolean isFurry = false;
	private int numberOfLegs;

	public Animal(boolean isFurry) {
		this.isFurry = isFurry;
	}
	
	public abstract void eat(String typeOfFood);
	
	
	

	public boolean isFurry() {
		return isFurry;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	

    

}
