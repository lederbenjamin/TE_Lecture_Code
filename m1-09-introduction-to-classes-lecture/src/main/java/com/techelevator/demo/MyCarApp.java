package com.techelevator.demo;

import java.util.ArrayList;
import java.util.List;

public class MyCarApp {

	public static void main(String[] args) {
		
		List<Car> myListOfCars = new ArrayList<Car>();
		//Option 1 - Using a default constructor
		Car car1 = new Car();
		car1.setModel("F-150");
		car1.setMake("Ford");
		myListOfCars.add(car1);
		
		System.out.println(car1.getModel());

	    // Option 2 - Use a custom constructor
		Car car2 = new Car("Toyota", "Rav4", "Red");
		myListOfCars.add(car2);
		
		for (Car car : myListOfCars) {
			System.out.println(car.toString() + "  ");
		}

	}

}
