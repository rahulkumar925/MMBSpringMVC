package com.cg.mmb.pojo;

public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private String email;
	private String phoneNo;
	private String dob;
	private double accountBalance;
	private double odl;
	

	public BankAccount(int accountNumber, String accountHolder, String email, String phoneNo, String dob,
			double accountBalance,double odl) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.email = email;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.accountBalance = accountBalance;
		this.odl=odl;
	}



	public BankAccount() {
		// TODO Auto-generated constructor stub
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

	public double getOdl() {
		return odl;
	}



	public void setOdl(double odl) {
		this.odl = odl;
	}



	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", dob=" + dob + ", accountBalance=" + accountBalance + ", odl=" + odl + "]";
	}
	
	
}