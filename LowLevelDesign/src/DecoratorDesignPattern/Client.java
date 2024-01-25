package DecoratorDesignPattern;

public class Client {
	public static void main(String[] args) {
		//create instance of simple basic card
		CreditCard basiCreditCard = new BasicCreditCard();
		System.out.println("Annual Fee: $" + basiCreditCard.annualFee() + " for " + basiCreditCard.upgradeTo());
		System.out.println();
		//now upgrade to Classic
		CreditCard classicCardDecorator = new ClassicCardDecorator(basiCreditCard);
		System.out.println("Annual Fee: $ " + classicCardDecorator.annualFee() + " for " + classicCardDecorator.upgradeTo());
		System.out.println();
		//now upgrade to Platinum
		CreditCard platinumCardDecorator = new PlatinumCardDecorator(basiCreditCard);
		System.out.println("Annual Fee: $ " + platinumCardDecorator.annualFee() + " for " + platinumCardDecorator.upgradeTo());
		System.out.println();		
		//now upgrade to Diamond
		CreditCard diamondCardDecorator = new DiamondCardDecorator(basiCreditCard);
		System.out.println("Annual Fee: $ " + diamondCardDecorator.annualFee() + " for " + diamondCardDecorator.upgradeTo());
		
		//now upgrade platinum to diamon
		CreditCard platinumToDiamoandCardDecorator = new DiamondCardDecorator(new PlatinumCardDecorator(basiCreditCard));
		System.out.println("Annual Fee: $ " + platinumToDiamoandCardDecorator.annualFee() + " for " + platinumToDiamoandCardDecorator.upgradeTo());
	}
	
}
