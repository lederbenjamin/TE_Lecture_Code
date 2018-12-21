package com.techelevator.bank;

import java.util.ArrayList;
import java.util.List;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account account = new Account("123", 100);
         
         CheckingAccount checking = new CheckingAccount("234");
         
         SavingsAccount savings = new SavingsAccount("456", 150);
         
         List<Account> accountList = new ArrayList<Account>();
         accountList.add(account);
         accountList.add(checking);
         accountList.add(savings);
         
         for (Account acct : accountList) {
        	 
        	    System.out.println(acct.getBalance());
         }
         
         
	}

}
