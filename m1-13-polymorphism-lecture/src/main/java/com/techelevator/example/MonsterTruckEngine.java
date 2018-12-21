package com.techelevator.example;

public class MonsterTruckEngine implements Engine {
	
	private int horsepower = 0;
	
	
	public MonsterTruckEngine (int horsepower) {
		this.horsepower = horsepower; 
	}

	@Override
	public boolean start() {
		return false;
	}

	@Override
	public boolean stop() {
		return false;
	}

	@Override
	public int calculateHP() {
		this.horsepower *= 1000;
		return this.horsepower;
	}

	@Override
	public int returnNumberOfCylinders() {
		// TODO Auto-generated method stub
		return 0;
	}

}
