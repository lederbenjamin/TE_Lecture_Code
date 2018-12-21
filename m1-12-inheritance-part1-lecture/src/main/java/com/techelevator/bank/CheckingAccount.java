package com.techelevator.bank;

import java.util.ArrayList;
import java.util.List;

public class CheckingAccount extends Account{
	
	private List<Check> checkList = new ArrayList<Check>();
	
	public CheckingAccount(String accountNumber) {
		super(accountNumber, 0);
	}
	
	public void writeCheck(int amount) {
		
		int currentBalance = getBalance();
		if (amount < currentBalance) {
			setBalance(currentBalance - amount);
		}
		
	}

}
