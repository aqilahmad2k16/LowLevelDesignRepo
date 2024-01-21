package MultiThreading;


public class AccountHolder implements Runnable{
	private Account account;

	public AccountHolder(Account acc) {
		this.account = acc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=4; i++) {
			makeWithdrawal(2000);//let's each time, he/she want's to make withdrawal of 2000
			if(account.getBalance() < 0) {
				System.out.println("account is overdrawn");
			}
		}
		
	}
	
//	private void makeWithdrawal(int withdrawAmount) {
//			if(account.getBalance() >= withdrawAmount) {
//				System.out.println(Thread.currentThread().getName() + " is going to withdraw $ " + withdrawAmount);
//				try {
//					Thread.sleep(3000);
//				}catch (InterruptedException e) {
//					System.err.println("Exception has encountered");
//					// TODO: handle exception
//				}
//				
//				account.withdraw(withdrawAmount);
//				System.out.println(Thread.currentThread().getName() + " has completed withdraw of $ " + withdrawAmount + " with remainning balance " + account.getBalance());
//			}else {
//				System.out.println("Not enough of amount " + Thread.currentThread().getName() + " to withdraw an amount of $" + withdrawAmount + " Net Amount is $ " + account.getBalance() );
//			}
			
//			//result obtained, without any synchronizaiton
//			Abdullah has completed withdraw of $ 2000 with remainning balance 6000
//			Salama has completed withdraw of $ 2000 with remainning balance 6000
//			Abdullah is going to withdraw $ 2000
//			Salama is going to withdraw $ 2000
//			Abdullah has completed withdraw of $ 2000 with remainning balance 4000
//			Abdullah is going to withdraw $ 2000
//			Salama has completed withdraw of $ 2000 with remainning balance 2000
//			Salama is going to withdraw $ 2000
//			Salama has completed withdraw of $ 2000 with remainning balance 0
//			account is overdrawn
//			Abdullah has completed withdraw of $ 2000 with remainning balance -2000
//			account is overdrawn
//			Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ -2000
//			account is overdrawn
//			Not enough of amount Abdullah to withdraw an amount of $2000 Net Amount is $ -2000
//			account is overdrawn
	
	//here you can see, multiple thread are making withdraw even when balance becomes 0, also here balance is negative (this 
	// is causing data inconsistency) we will have to use synchnoize technique to fixed cause of concurrency issue.
		
//	}

//	private void makeWithdrawal(int withdrawAmount) {//this mutex way of locking
//		synchronized (account) {//object level locking (block locking)
//			if(account.getBalance() >= withdrawAmount) {
//				System.out.println(Thread.currentThread().getName() + " is going to withdraw $ " + withdrawAmount);
//				try {
//					Thread.sleep(3000);
//				}catch (InterruptedException e) {
//					System.err.println("Exception has encountered");
//					// TODO: handle exception
//				}
//				
//				account.withdraw(withdrawAmount);
//				System.out.println(Thread.currentThread().getName() + " has completed withdraw of $ " + withdrawAmount + " with remainning balance " + account.getBalance());
//			}else {
//				System.out.println("Not enough of amount " + Thread.currentThread().getName() + " to withdraw an amount of $" + withdrawAmount + " Net Amount is $ " + account.getBalance() );
//			}			
//		}
		//result obtained
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 8000
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 6000
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 4000
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 2000
//		Salama is going to withdraw $ 2000
//		Salama has completed withdraw of $ 2000 with remainning balance 0
//		Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ 0
//		Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ 0
//		Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ 0
	private synchronized void makeWithdrawal(int withdrawAmount) { // method synchronized
		if(account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw $ " + withdrawAmount);
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				System.err.println("Exception has encountered");
				// TODO: handle exception
			}
			
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName() + " has completed withdraw of $ " + withdrawAmount + " with remainning balance " + account.getBalance());
		}else {
			System.out.println("Not enough of amount " + Thread.currentThread().getName() + " to withdraw an amount of $" + withdrawAmount + " Net Amount is $ " + account.getBalance() );
		}
		
		//result obtained, with synchronized at method 
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 8000
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 6000
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 4000
//		Abdullah is going to withdraw $ 2000
//		Abdullah has completed withdraw of $ 2000 with remainning balance 2000
//		Salama is going to withdraw $ 2000
//		Salama has completed withdraw of $ 2000 with remainning balance 0
//		Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ 0
//		Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ 0
//		Not enough of amount Salama to withdraw an amount of $2000 Net Amount is $ 0
	}
	
}
	
	


