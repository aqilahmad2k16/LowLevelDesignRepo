package DecoratorDesignPattern;

public class ClassicCardDecorator implements CreditCard{
	protected CreditCard creditCardDecorator;
	
	public ClassicCardDecorator(CreditCard creditCard) {
		this.creditCardDecorator = creditCard;
	}

	@Override
	public double annualFee() {
		// TODO Auto-generated method stub
		double costOFBasicCard = creditCardDecorator.annualFee();
		return costOFBasicCard + 200;
	}

	@Override
	public String upgradeTo() {
		// TODO Auto-generated method stub
		return creditCardDecorator.upgradeTo() + " upgraded to Classic Card :) ";
	}

}
