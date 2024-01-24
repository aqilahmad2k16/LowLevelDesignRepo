package FactoryDesignPattern;

public class Client {
	//Factory Design Pattern:-
	//1) creational design pattern that provide interface to create instances of a class
	//2) allows subclasses to alter the type of object that will be created.
	public static void main(String[] args) {
		
		//here we will only tell factory to create objects of those interface which is implementing common interface
		AccountFactory accountFactory = new SavingFactory();
		Account account = accountFactory.createFactory();
		System.out.println("Account type: " + account.accountType());
		
		//for others object
		AccountFactory accountFactory2 = new CurrentFactory();
		Account account2 = accountFactory2.createFactory();
		System.out.println("Account type " + account2.accountType());
		
	}
}
