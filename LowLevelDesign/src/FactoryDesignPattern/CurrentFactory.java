package FactoryDesignPattern;

public class CurrentFactory implements AccountFactory{

	@Override
	public Account createFactory() {
		// TODO Auto-generated method stub
		return new CurrentsAccount();
	}

}
