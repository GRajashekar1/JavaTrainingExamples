package assignment;

import java.util.Scanner;

public class ATMArrayClass {
	private double balance;
	private double[] transactions;
	private int transactionCount;
	Scanner sc=new Scanner(System.in);
	public void ATMArrayClass() {
		balance = 0;
		transactions = new double[100];
		transactionCount = 0;
	}
		
	public double checkBalance() {
		return balance;
	}

	public void deposit(double amount) {
		
		if (amount > 0) {
			balance =balance+ amount;
			transactions[transactionCount++] = amount;
			System.out.println("Deposit successful!");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		
		if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
		} else {
			balance =balance- amount;
			transactions[transactionCount++] = -amount;
			System.out.println("Withdrawal successful!");
		}
	}
	
	public void ATMPin(int atm) {
		
		int pin=1234;
		System.out.println("Enter your 4 digit pin : ");
		int entry=atm;
		if(pin!=entry) {
			System.out.println("Sorry you have entered wrong pin.. Please try again!!");
		}
		else {
			System.out.println("You have entered the correct pin.. Please proceed the transaction!!");
		}
		
	}
	
	
	public void showTransactionHistory() {
		System.out.println("Transaction History:");
		for (int i = 0; i < transactionCount; i++) {
			if (transactions[i] > 0) {
				System.out.println("Deposit: $" + transactions[i]);
			} else {
				System.out.println("Withdraw: $" + (-transactions[i]));
			}
		}
	}
}
