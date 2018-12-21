package com.techelevator.animal.abstraction;

public class Bird extends Animal{

	public Bird(boolean isFurry) {
		super(isFurry);
	}

	@Override
	public void eat(String typeOfFood) {
	     System.out.println("Pecking at " + typeOfFood);
		
	}

}
