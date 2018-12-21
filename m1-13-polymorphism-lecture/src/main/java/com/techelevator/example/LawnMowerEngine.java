package com.techelevator.example;

public class LawnMowerEngine implements Engine {
	
	private String airFilterSize = null;
	private int horsepower = 0;
	
	
	public LawnMowerEngine (int horsepower) {
		this.horsepower = horsepower;
	}

	public String getAirFilterSize() {
		return airFilterSize;
	}

	public void setAirFilterSize(String airFilterSize) {
		this.airFilterSize = airFilterSize;
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int calculateHP() {
		// TODO Auto-generated method stub
		return this.horsepower;
	}

	@Override
	public int returnNumberOfCylinders() {
		// TODO Auto-generated method stub
		return 1;
	}

}
