package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.domain.Employee;
import com.techelevator.domain.HourlyEmployee;
import com.techelevator.domain.SalariedEmployee;

public class Payroll {

	public void runPayroll() {

		List<Employee> myEmployeeList = getEmployeeData();
		
		DecimalFormat df = new DecimalFormat(".##");
		for (Employee e : myEmployeeList) {
		    System.out.println(e.toString() + " " + df.format(e.calculatePay()));
		}

		// iterate though list to calculate and create the report

	}

	private File readEmployeeFile(String fileName) {
		return new File(fileName);
	}

	private List<Employee> getEmployeeData () {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		//read employee file and create a list of employee objects
		File employeeFile = readEmployeeFile("employee.txt");
		
		try {
			Scanner myScanner = new Scanner(employeeFile);
			
			while (myScanner.hasNextLine()) {

			
				String line = myScanner.nextLine();
				String[] fields = line.split(",");
				Employee emp = null;
				if (fields[3].equalsIgnoreCase("Salary")) {
					//String id, String firstName, String lastName, double annualSalary
					emp = new SalariedEmployee(fields[0], fields[1], fields[2], Double.parseDouble(fields[4]));
				}
				else {
					emp = new HourlyEmployee(fields[0], fields[1], fields[2], Double.parseDouble(fields[4]), Double.parseDouble(fields[5]));
				}
				employeeList.add(emp);

			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

		return employeeList;
		
	}

}
