package AdapterAndFacade;

public interface BankApiAdapter {
	double widthdraw(double amount) throws ClassNotFoundException;
	double checkBalance();

}
