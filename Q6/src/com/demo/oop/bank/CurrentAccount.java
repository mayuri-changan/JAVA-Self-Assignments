package com.demo.oop.bank;

	public class CurrentAccount extends BankAccount {

	    public CurrentAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        System.out.println("Current account withdrawal: " + amount);
	    }
	}



