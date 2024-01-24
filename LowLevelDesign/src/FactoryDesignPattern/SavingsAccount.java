package FactoryDesignPattern;

public class SavingsAccount implements Account{
	@Override
	public String accountType() {
		return "Saving Account";
	}
}
