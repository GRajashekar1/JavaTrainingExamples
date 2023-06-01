package assignment;

public class ATM {
	
	private double balance;

	ATM() {
		balance = 0;
	}
	
	public double checkbalance() {
		return balance;
	}

	public void deposit(double amt) {
		System.out.println("You dopsited the amount is : " + amt);
		if (amt > 0) {
			balance = balance + amt;
			System.out.println("Deposit successfull!!");
		}
		else {
			System.out.println("Invalid amount deposited");
		}
	}

	public void withdraw(double amt) {
		System.out.println("You withdrawl the amount is : " + amt);
		if(amt<=balance) {
			balance = balance - amt;
			System.out.println("Successfully withdraw the amount!!");
		}
		else if(amt<=0) {
			System.out.println("Invalid withdraw amount!!");
		}
		else {
			System.out.println("Sorry you have insuffucient amount!!");
		}
		
	}

}
