package FactoryDesignPattern;

public class CurrentsAccount implements Account{
	@Override
	public String accountType() {
		return "Current Account";
	}
}
