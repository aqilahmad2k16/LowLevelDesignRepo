package DecoratorDesignPattern;

public class BasicCreditCard implements CreditCard{

	@Override
	public double annualFee() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String upgradeTo() {
		// TODO Auto-generated method stub
		return "Basic Credit Card";
	}
	

}
