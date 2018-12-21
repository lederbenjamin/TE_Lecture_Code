package com.techelevator;

public class Exercises {

	/*
	 Given a string, return a string length 1 from its front, unless front is false, in which case 
	 return a string length 1 from its back. The string will be non-empty.
	 theEnd("Hello", true) → "H"
	 theEnd("Hello", false) → "o"
	 theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front) {
		String end = "";
		
		if (front) {
			end = str.substring(0, 1);
		} 
		end = str.substring(str.length() - 1);
		
		return end;
	}
	
	
	/*
	 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with 
	 "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
	 to compare 2 strings.
	 hasBad("badxx") → true
	 hasBad("xbadxx") → true
	 hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str) {


		
		if (str.substring(1, 4).equals("bad")) {
			return true;
		}
		return false;
	}
	
	/*
	 15. Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
	 sum28([2, 3, 2, 2, 4, 2]) → true
	 sum28([2, 3, 2, 2, 4, 2, 2]) → false
	 sum28([1, 2, 3, 4]) → false
	 */
	public boolean sum28(int[] nums) {
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				sum += nums[i];
			}
			
			if (sum == 8) {
				return true;
			}
		}
		
		return false;
	
	}
	
	
	/*
	 19. You are driving a little too fast, and a police officer stops you. Write code to compute the result, 
	 encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the 
	 result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the 
	 result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 caughtSpeeding(60, false) → 0
	 caughtSpeeding(65, false) → 1
	 caughtSpeeding(65, true) → 0
	 */
	public int caughtSpeeding(int speed, boolean isBirthday) {
		
		
		if (speed > 80) {
			return 2;
		}
		if (speed > 60) {
			return 1;
		}
		return 0;
	}


	public int sumNumbers1To20() {
		int sum = 0;
		
		for (int i = 0; i <= 20; i++) {
			sum += i;
		}
		return sum;
	}
	
}
