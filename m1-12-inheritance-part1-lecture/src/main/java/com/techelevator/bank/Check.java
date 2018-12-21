package com.techelevator.bank;

public class Check {
	
	private int routingNumber;
	private double amount;
	
	public Check (int routingNumber, double amount) {
		this.amount = amount;
		this.routingNumber = routingNumber;
	}
	
	public int getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}
