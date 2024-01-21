package MultiThreading;

public class Account {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	
	public int withdraw(int debitedAmount) {
		balance = balance - debitedAmount;
		return balance;
	}
	
	
}
