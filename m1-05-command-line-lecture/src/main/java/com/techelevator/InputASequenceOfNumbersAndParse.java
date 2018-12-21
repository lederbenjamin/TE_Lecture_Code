package com.techelevator;

import java.util.Scanner;

public class InputASequenceOfNumbersAndParse {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter in a series of numeric values (separated by commas): ");

		String input = in.nextLine();
		String[] numbers = input.split(",");          // note: these are String representation of numbers....
		for (int i=0; i<numbers.length; i++) {
			System.out.println("i = " + numbers[i]);
		}
	}
	
}
