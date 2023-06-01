package assignment;

import java.util.Scanner;

public class SimpleATM_WithArrays {
	 public static void main(String[] args) {
	        ATMArrayClass atm = new ATMArrayClass();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Welcome to the ATM Simulator \n 1.Check Balance \n 2.Deposit \n 3.Withdraw \n 4.View Transaction History \n 5.ATM pin \n 6.Exit");
	            System.out.print("Choose an option: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Current balance: $" + atm.checkBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                 //   atm.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawalAmount = scanner.nextDouble();
	                   // atm.withdraw(withdrawalAmount);
	                    break;
	                case 4:
	                    atm.showTransactionHistory();
	                    break;
	                case 5:
	                    System.out.println("Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }

	            System.out.println();

	        } while (choice != 5);

	        scanner.close();
	    }
}
