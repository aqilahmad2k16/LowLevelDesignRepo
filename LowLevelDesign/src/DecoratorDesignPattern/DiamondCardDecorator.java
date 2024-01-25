package DecoratorDesignPattern;

public class DiamondCardDecorator implements CreditCard{
	protected  CreditCard creditCardDecorator;
	
	public DiamondCardDecorator(CreditCard creditCard) {
		this.creditCardDecorator = creditCard;
	}

	@Override
	public double annualFee() {
		// TODO Auto-generated method stub
		double costOfBasicCard = creditCardDecorator.annualFee();
		return costOfBasicCard + 1000;
	}

	@Override
	public String upgradeTo() {
		// TODO Auto-generated method stub
		return creditCardDecorator.upgradeTo() + " upgraded to Platinum Card :)";
	}
	
	
}
