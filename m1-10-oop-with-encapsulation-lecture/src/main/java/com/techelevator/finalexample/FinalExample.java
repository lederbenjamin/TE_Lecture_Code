package com.techelevator.finalexample;

import java.util.Scanner;

public class FinalExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isContinue = true;
		
		while (isContinue)  {
	
		
		System.out.println("Enter a number between 1 and 5 (or '0' to exit) ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("You entered: " + number);
		
		   switch(number)
		   {
		      // case statements
		      // values must be of same type of expression
		      case 0 :
		   	     System.out.println("Exiting... ");
			     isContinue = false;
			     break;
		      case Color.GREEN :
		         System.out.println("You chose green ");
		         break;
		      case Color.ORANGE :
			     System.out.println("You chose orange ");
			     break;
		      case Color.RED :
			     System.out.println("You chose red ");
			     break;
		      case Color.YELLOW :
			     System.out.println("You chose yellow ");
			     break;
		      case Color.BLUE :
			     System.out.println("You chose blue ");	
			     break;
		      default : 
			      System.out.println("We did not find a color choice. But we do like PI: " + Math.PI);	
			      
		   }
		}

	}

}
