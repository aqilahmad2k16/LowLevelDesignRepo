package DecoratorDesignPattern;

public class PlatinumCardDecorator implements CreditCard{
	
	protected CreditCard creditCarDecorator;
	
	public PlatinumCardDecorator(CreditCard creditCard) {
		this.creditCarDecorator = creditCard;
	}

	@Override
	public double annualFee() {
		// TODO Auto-generated method stub
		double costOfBasicCard = creditCarDecorator.annualFee();
		return costOfBasicCard + 300;
	}

	@Override
	public String upgradeTo() {
		// TODO Auto-generated method stub
		return creditCarDecorator.upgradeTo() + " upgraded to Platinum Card :) ";
	}

}
