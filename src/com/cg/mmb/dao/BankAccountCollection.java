package com.cg.mmb.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.mmb.pojo.BankAccount;


public class BankAccountCollection {

	private Map <Integer, BankAccount> bankDB = new HashMap<>();
	 BankAccount bank1 = new BankAccount(201,"Rahul","rahul@gmail.com","9973156223","11/11/1997",20000,5000);
	 BankAccount bank2 = new BankAccount(202,"Shyam","shyam01@gmail.com","9833156223","10/10/1996",17000,3000);

	public Collection<BankAccount> viewBankAccount() {
		bankDB.put(bank1.getAccountNumber(),bank1);
		bankDB.put(bank2.getAccountNumber(), bank2);
		return bankDB.values();
	}



	public double withdraw(double amount, int accountNumber) {
		Integer i = accountNumber;
		if(bankDB.get(i).getAccountBalance()>amount) {
		bankDB.get(i).setAccountBalance(bankDB.get(i).getAccountBalance()-amount);
		return bankDB.get(i).getAccountBalance();
		}
		else {
		return -1;
	}
}

	public double deposit(double depositAmount, int accountNumber) {
		Integer i = accountNumber;
		bankDB.get(i).setAccountBalance(bankDB.get(i).getAccountBalance()+depositAmount);
		return bankDB.get(i).getAccountBalance();
		
	}

}
