package com.techelevator.example;

public class TankEngine implements Engine {
	
	private int horsepower = 0;
	
	
	public TankEngine (int horsepower) {
		this.horsepower = horsepower * 100000;
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int calculateHP() {
		// TODO Auto-generated method stub
		return this.horsepower;
	}

	@Override
	public int returnNumberOfCylinders() {
		// TODO Auto-generated method stub
		return 0;
	}

}
