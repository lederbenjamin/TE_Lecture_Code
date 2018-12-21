package com.techelevator.food;

public class MainApp {

	public static void main(String[] args) {
		StevesFood meal1 = new Lasagna();
		System.out.println(meal1.getOwnersName());
		StevesFood meal2 = new Spaghetti(); 
		System.out.println(meal2.getOwnersName());

	}

}
