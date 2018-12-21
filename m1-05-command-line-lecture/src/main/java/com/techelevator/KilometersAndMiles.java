package com.techelevator;

import java.util.Scanner;

/*
Write a simple program that prompts the user for a distance, then asks the user
for a unit of measurement (k) for kilometers,  (m) for miles.  
After they submit the information, calculate the response: 
    If miles, convert to km. If km, convert to miles. If they enter something other than k or m, print 
    You goofed!

Then ask them if they want to do another (Y/N). If they answer Y, repeat, 
if N, exit.

(distance in kilometers) ≈ distance in miles / 0.62137
(distance in miles) ≈ 0.6214 * (distance in kilometers)
*/

public class KilometersAndMiles {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a distance");
		String distanceAsString = scanner.nextLine();
		System.out.println(distanceAsString);
		int distance = Integer.parseInt(distanceAsString);
		
		
		System.out.println("Please enter a unit iof measurement (k)ilometers (m)miles");
		String unitAsString = scanner.nextLine();
		
		
       
		
	}		
		

}
