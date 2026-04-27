package com.demo.oop.bank;


public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            System.out.println("Savings withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}
