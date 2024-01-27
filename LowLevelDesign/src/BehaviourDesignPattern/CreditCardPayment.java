package BehaviourDesignPattern;

public class CreditCardPayment implements PaymentStrategy{
	
	private String creditCardNumber;
	private String name;
	
	public CreditCardPayment(String creditCardNumber, String name) {
		this.creditCardNumber = creditCardNumber;
		this.name = name;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Your payment is processing...");
		System.out.println("Your payment is successful " + " Amount: $" + amount);
		System.out.println("Your payment is via Credit Card: " + name + " with CreditCard Number: " + creditCardNumber);
	}

}
