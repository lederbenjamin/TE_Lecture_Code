package com.techelevator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderExample {

	public static void main(String[] args) {
		String fileName = "dummy.txt";
		List<String> fileResults;
		try {
			fileResults = readFile(fileName);
			for (String s: fileResults) {
				System.out.println(s);
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


	}
	
	private static List<String> readFile(String filename)
			throws Exception
			{
			    String line = null;
			    List<String> records = new ArrayList<String>();

			    // wrap a BufferedReader around FileReader
			    BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

			    // use the readLine method of the BufferedReader to read one line at a time.
			    // the readLine method returns null when there is nothing else to read.
			    while ((line = bufferedReader.readLine()) != null)
			    {
			        records.add(line);
			    }
			  
			    
			    // close the BufferedReader when we're done
			    bufferedReader.close();
			    return records;
			}	

}
