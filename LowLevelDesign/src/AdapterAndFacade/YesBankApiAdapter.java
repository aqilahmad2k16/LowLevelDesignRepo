package AdapterAndFacade;

public class YesBankApiAdapter implements BankApiAdapter{
	private static final double balance = 3000;
	@Override
	public double widthdraw(double amount) throws ClassNotFoundException {
		if(amount > YesBankApiAdapter.balance) {
			System.out.println("You do not have enought money"); 
			throw new ClassNotFoundException();
		}
		return YesBankApiAdapter.balance - amount;
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return YesBankApiAdapter.balance;
	}

}
