package com.techelevator;

import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		boolean areWeThere = true;
		
	    while (areWeThere) {
	        System.out.println("Kids: Are We There Yet? (Y)es or (N)o ");
	        String answer = scanner.nextLine();
	        if(answer.equalsIgnoreCase("Y")){
	          areWeThere = false;
	        	  //break;
	        }
	    }
	    System.out.println("It is about time!");

	}

}
