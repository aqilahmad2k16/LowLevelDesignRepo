package FactoryDesignPattern;

public class SavingFactory implements AccountFactory{
	

	@Override
	public Account createFactory() {
		// TODO Auto-generated method stub
		return new SavingsAccount();
	}
}
