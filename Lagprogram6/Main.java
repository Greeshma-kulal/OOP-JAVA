package labpg6;

public class Main {
public static void main(String[] args) throws InsufficientBalanceException {
	Bank b1= new Bank(12321, 12000.00d,"Arun");
	try
	{
	b1.deposit(89);
	b1.withdraw(9000);
	b1.showBalance();
	b1.withdraw(10000);

	b1.showBalance();
	}
	catch(InsufficientBalanceException e)
	{
		System.out.println("Insufficient amount");
	}
	catch (ArithmeticException e) {
		System.out.println("Withdrawal amount canot be zero or negative");
	}
	catch (Exception e) {
		System.out.println("Other problem");
		// TODO: handle exception
	}
	
	
}
}


	
