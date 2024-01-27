package BehaviourDesignPattern;

public class UpiPayment implements PaymentStrategy{
	String upiNumber;
	String upiPlateform;
	
	public UpiPayment(String upiNumbString, String upiPlateform) {
		this.upiNumber = upiNumbString;
		this.upiPlateform = upiPlateform;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Your Upi's Number: " + upiNumber + " Via Upi's Plateform: " + upiPlateform);
		System.out.println("Your payment is processing....");
		System.out.println("Your payment is successful " + " Amount: $" + amount);
		
	}

}
