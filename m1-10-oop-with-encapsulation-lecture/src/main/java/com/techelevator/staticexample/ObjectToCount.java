package com.techelevator.staticexample;


public class ObjectToCount {

	   static int count = 0;       // Let's change this to private later
	                                      // and see what happens.
	   
	  
	   public void increment()
	   {
	       count++;
	   }
	   
	   public static int getCount() {
		   return count;
	   }

}
