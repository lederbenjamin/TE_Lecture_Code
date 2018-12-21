package com.techelevator.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

public class Order {
	private String id;
	private String description;
	private String  orderDate;
	private BigDecimal orderTotal;

	public Order(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderDate() {
		return LocalDate.now().toString();
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getOrderTotal() {
		Random rand = new Random();
		double roundOff = Math.round(rand.nextDouble() * 100.0);
		return new BigDecimal(roundOff).setScale(2);
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	
	
	
}
