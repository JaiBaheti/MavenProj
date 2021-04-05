package com.ibm.bank;

public class Account {
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double deposit(double bal) {
		if(bal<0)
			throw new NumberFormatException("Negative amount");
		balance+=bal;
		return balance;		
	}
	
	public double withdraw(double bal) throws InsufficientException,NumberFormatException {
			if(bal<0)
				throw new NumberFormatException("Negative amount");
			if(bal>balance) 
				throw new InsufficientException("Insufficient balance.");			
			else
				balance-=bal;
			
			return balance;
		}	
}
