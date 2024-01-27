package BehaviourDesignPattern;

public class PaypalPayment implements PaymentStrategy{
	String userEmail;
	
	public PaypalPayment(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Payment is successful...." + " Amount: $" + amount);
		System.out.println("You will be informed by a notification on the Email: " + userEmail);
	}

}
