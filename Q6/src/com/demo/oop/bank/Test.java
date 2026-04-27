package com.demo.oop.bank;

public class Test 
{
	    public static void main(String[] args) {
	        BankAccount acc1 = new SavingAccount("Mayuri123Changan", 4000);
	        BankAccount acc2 = new CurrentAccount("Swapnil567Rahinj", 50000);

	        acc1.deposit(2500);
	        acc1.withdraw(3000);
	        acc1.showBalance();
	        System.out.println();
	        acc2.withdraw(4000);
	        acc2.showBalance();
	    }
	}



