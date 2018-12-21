package com.techelevator.animal.abstraction;

public class AnimalApp {

	public static void main(String args[]) {
		

		
		   Animal bird = new Bird(false); 
		   bird.setNumberOfLegs(2);
		   System.out.println(bird.isFurry());
		   bird.eat("bird seed");
		   
		   Animal dog = new Dog(true);
		   dog.setNumberOfLegs(4);
		   dog.eat("steak");
	}
	
}
