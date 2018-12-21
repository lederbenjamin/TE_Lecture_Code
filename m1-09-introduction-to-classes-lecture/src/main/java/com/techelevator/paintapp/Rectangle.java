package com.techelevator.paintapp;

public class Rectangle {
	
	private int height = 0;
	private int width = 0;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int height, int width) {
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = Math.abs(height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = Math.abs(width);
	}
	
	public int getArea() {   // example of a derived property (we don't need it's own property)
		return this.height * this.width;
	}
	
	public boolean isLargerThan(Rectangle other) {
		return this.getArea() > other.getArea();
	}
	
	public boolean isLargerThan(int height, int width) {
		Rectangle r = new Rectangle(height, width);
		return this.isLargerThan(r);
	}
	
	public String toString() {
		return "Height x Width = Area: " 
				+ this.height + " x " + this.width + " = " 
				+ this.getArea();
	}
	
	public boolean equals(Object obj) {
		Rectangle rect = (Rectangle) obj;
		return (this.height == rect.height && this.width == rect.width);
	}
}
