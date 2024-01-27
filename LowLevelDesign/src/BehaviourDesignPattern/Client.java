package BehaviourDesignPattern;

public class Client {
	public static void main(String[] args) {
		//now client will chose which algo or option or behavior he wants to execute 
		//// Client chooses the payment method dynamically
		PaymentStrategy creditCardPaymentStrategy = new CreditCardPayment("223125489", "SBI");
		PaymentContext crediCardContext = new PaymentContext(creditCardPaymentStrategy);
		crediCardContext.processPayment(2000);
		System.out.println();
		//do payment via Paypal
		PaymentStrategy paypalPaymentStrategy = new PaypalPayment("abdullah123456@gmail.com");
		PaymentContext paypalContext = new PaymentContext(paypalPaymentStrategy);
		paypalContext.processPayment(3000);
		
	}
}
