package AdapterAndFacade;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException {
		//here we are using ICICI bankApi with phonepe
//		BankApiAdapter bankApiAdapter = new ICICIBankApiAdapter();
		//check banalance 
//		System.out.println("Your balance is " + bankApiAdapter.checkBalance());
//		double widthdrawAmount = bankApiAdapter.widthdraw(1000);
//		PhonePe.initiatePayment("2121355", widthdrawAmount);
		
		//but now we don't want to use ICICI bankApi, from today onwards will be working with Yes bank Api
		BankApiAdapter bankApiAdapter = new YesBankApiAdapter();
		System.out.println("Your balance is " + bankApiAdapter.checkBalance());
		double widthdrawAmount = bankApiAdapter.widthdraw(3000);
		PhonePe.initiatePayment("2121355", widthdrawAmount);
	}
}
