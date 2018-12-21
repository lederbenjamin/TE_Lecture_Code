package com.techelevator.scanner;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BasicFileRead {

	public static void main(String[] args) {
	
		File text = new File("Dummy.txt");
		
		try {
			Scanner scanner = new Scanner(text);
			String firstLine = scanner.nextLine();
			String[] mySplitLine1 = firstLine.split(" ");
			
			for (int i = 0; i< mySplitLine1.length; i++) {
				System.out.println(mySplitLine1[i]);
			}
			
			
			System.out.println(firstLine);
			
			String secondLine = scanner.nextLine();
			System.out.println(secondLine);

		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
