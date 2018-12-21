package com.techelevator.animal.abstraction;

public class Dog extends Animal {

	public Dog(boolean isFurry) {
		super(isFurry);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(String typeOfFood) {
		// TODO Auto-generated method stub
		System.out.println("Dog swallows: " + typeOfFood + " whole....");
	}

}
