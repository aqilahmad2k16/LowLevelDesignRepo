package AdapterAndFacade.Facade;

public class Client {
	public static void main(String[] args) {
		Account sourceAccount = new Account("123456", 1000.0);
		TransactionLog transactionLog = new TransactionLog();
		NotificationService notificationService = new NotificationService();
		
		BankingFacade bankingFacade = new BankingFacade(sourceAccount, transactionLog, notificationService);
		//transfer funds;
		String destinationAccountNumberString = "222222";
		bankingFacade.transferFund(destinationAccountNumberString, 200.0);
		
		//check balance
		double balance = bankingFacade.checkBalance();
		System.out.println("Current Balance: $" + balance);
	}
}
