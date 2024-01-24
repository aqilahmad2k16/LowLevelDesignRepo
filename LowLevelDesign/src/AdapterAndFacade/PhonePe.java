package AdapterAndFacade;

public class PhonePe {
	private BankApiAdapter bankApiAdapter;
	
	public PhonePe(BankApiAdapter bankApi){
		this.bankApiAdapter = bankApi;
	}
	public static void initiatePayment(String orderId, double amount) {
		System.out.println("initiating phonepe payment for orderId " + orderId + " with ammount " + amount);
	}

}
