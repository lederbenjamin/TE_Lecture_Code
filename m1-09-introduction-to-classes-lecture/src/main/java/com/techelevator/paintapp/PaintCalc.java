package com.techelevator.paintapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintCalc {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Rectangle> walls = new ArrayList<Rectangle>();
		
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();
			
			System.out.println();
			
			if(userChoice.equals("1")) {
				
				System.out.print("Enter wall height >>> ");
				int height = Integer.parseInt(scan.nextLine());
				System.out.print("Enter wall width >>> ");
				int width = Integer.parseInt(scan.nextLine());
				
				Rectangle wall = new Rectangle(height, width);
				walls.add(wall);

				System.out.println("Added "+height+"x"+width+" wall - "+ wall.getArea() +" square feet");
				
			} else if(userChoice.equals("2")) {
				
				int totalArea = 0; 
				int wallCount = 0;
				
				for (Rectangle wall : walls) {
					System.out.println("Wall " + ++wallCount + ": " + wall.toString());
					totalArea += wall.getArea();
				}
				
				// PROTOTYPE ONLY!!!
				System.out.println("===============================");
				System.out.println("Total Area: "+totalArea+" square feet");
				
				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float)totalArea / 400;
				System.out.println("Paint Required: "+gallonsRequired+" gallons");
				
				System.exit(0); // Causes the program to end
			}
		}
	}

}
