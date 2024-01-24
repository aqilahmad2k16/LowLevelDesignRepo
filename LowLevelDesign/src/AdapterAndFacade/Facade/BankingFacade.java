package AdapterAndFacade.Facade;

public class BankingFacade {
	private Account account;
	private TransactionLog transactionLog;
	private NotificationService notificationService;
	
	public BankingFacade(Account account, TransactionLog transactionLog, NotificationService notificationService) {
		super();
		this.account = account;
		this.transactionLog = transactionLog;
		this.notificationService = notificationService;
	}
	
	public void transferFund(String destinationAccountNubmer, double amount) {
		account.withdraw(amount);
		transactionLog.logTransaction("Transfer to: " + destinationAccountNubmer + ": $" + amount);
		notificationService.sendNotification("Funds transfered successfully!!!");
	}
	
	public double checkBalance() {
		return account.getBalance();
	}
	
	
}
