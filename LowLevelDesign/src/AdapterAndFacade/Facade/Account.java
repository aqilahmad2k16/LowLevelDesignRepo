package AdapterAndFacade.Facade;

public class Account {
	private String accountNumberString;
	private double balance;
	
	public Account(String accNumString, double balance) {
		this.accountNumberString = accNumString;
		this.balance = balance;
	}

	public String getAccountNumberString() {
		return accountNumberString;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Widthdraw: $" + amount);
		}else {
			System.out.println("Insufficient funds");
		}
	}
	
	

}
