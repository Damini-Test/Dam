package Encapsulation;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		BankAccount b1= new BankAccount("Harsha",10021095574l,1234,600.0);
		b1.checkBalance(2345);
		b1.checkBalance(1234);
		b1.deposit(-250.0);
		b1.deposit(350.0);
		b1.checkBalance(1234);
		b1.withdraw(2345, 900);
		b1.withdraw(1234, 900);
		b1.checkBalance(1234);
		
		 
	}

}
