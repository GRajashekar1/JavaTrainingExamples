package assignment;

import java.util.Scanner;

public class SimpleATM {

	public static void main(String[] args) {

		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {

			System.out.println(
					"Welcome to AUTOMATED TELLER MACHINE \n 1.Balance enquiry \n 2.Deposit amount \n 3.Withdraw amount \n 4.Exit");
			System.out.println("Choose an option : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Balance enquiry : " + atm.checkbalance());
				break;
			case 2:
				System.out.println("Enter the amount you want deposit: ");
				double depositamount = sc.nextDouble();
				atm.deposit(depositamount);
				break;
			case 3:
				System.out.println("Enter the amount you want to withdraw : ");
				double withdramount = sc.nextDouble();
				atm.withdraw(withdramount);
				break;
			case 4:
				System.out.println("Good bye.....!");
				break;
			default:
				System.out.println("Invalid option you have selected! Please try again.....");
			}
			System.out.println();

		} while (choice != 4);

	}

}
