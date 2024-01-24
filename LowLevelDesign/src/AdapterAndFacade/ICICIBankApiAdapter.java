package AdapterAndFacade;

public class ICICIBankApiAdapter implements BankApiAdapter{
	private static final double balance = 5000;
	@Override
	public double widthdraw(double amount) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		if(amount > ICICIBankApiAdapter.balance) {
			System.out.println("You do not have enought money"); 
			throw new ClassNotFoundException();
		}
		return ICICIBankApiAdapter.balance - amount;
	}

	@Override
	public double checkBalance() {
		return ICICIBankApiAdapter.balance;
		
	}

}
