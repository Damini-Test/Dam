package Encapsulation;

public class BankAccount {

	String holderName;
	long bankAcNumber;
	private int pin;
	private double balance;

	public void accountdetails() {
		System.out.println("Account holder name:" + holderName);
		System.out.println("AC Number:" + bankAcNumber);

	}

	BankAccount(String holderName, long bankAcNumber, int pin, double balance)

	{
		this.holderName = holderName;
		this.bankAcNumber = bankAcNumber;
		this.pin = pin;
		this.balance = balance;

	}

//getter
	public void checkBalance(int pin) {
		if (pin == this.pin) {
			System.out.println("Balance:" + balance);
		} else {
			System.out.println("Invalid pin, Check the pin once again...!! Cant display balance");
		}
	}

	// Setter

	public void deposit(double depositAmt) {
		if (depositAmt > 0) {
			this.balance += depositAmt;
			System.out.println("depositted Sucessfully");
		} else {
			System.out.println("Check the Amount that you have entered....!!!,Please enter valid AMt");
		}
	}

	public void withdraw(int pin, double withdrawAmt) {
		if (pin == this.pin) {
			if (this.balance > 0 && withdrawAmt > 0 && withdrawAmt <= this.balance) {
				this.balance -= withdrawAmt;
				System.out.println("Withdraw Successfully");
			} else {
				System.out.println("insufficient balance ,Check the balance and Amt enter");
			}
		} else {
			System.out.println("Invalid pin");

		}
	}

}
