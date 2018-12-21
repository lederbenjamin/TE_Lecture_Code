package com.techelevator.animal.interfaces;


public class AnimalApp {

	public static void main(String[] args) {
		
		Animal animal = new Animal();

		Animal bird = new Bird();
		bird.eat("bird seed");
		
		Animal dog = new Dog();
		dog.eat(" stuff that fell on the floor");
		
		Bird bird2 = new Bird();
		bird2.eat("crackers");

	}

}
