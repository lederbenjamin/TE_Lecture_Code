package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a limit >>");
		int limit = in.nextInt();
		in.nextLine();
		 
		int previous = 0;
		System.out.print("0");
		for(int next = 1; next < limit; ) { 
			System.out.print(", "+next);
			int temp = previous + next;
			previous = next;
			next = temp;
		}
	}
	
}
