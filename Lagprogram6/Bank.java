package labpg6;

public class Bank {
	private int accno;
	private double balance;
	private String name;

	public Bank(int accno, double balance , String name)
	{
		this.accno = accno;
		this.balance = balance;
		this.name = name;
		
		// TODO Auto-generated constructor stub
	}
	public void deposit(double amount) {
		if(amount<0) {
			throw new ArithmeticException("Deposit amount cannot be negative");
		}
		balance += amount;
		System.out.println("Deposited amount ="+ amount);
		
	}
	public void withdraw(double amount ) throws InsufficientBalanceException{
		if(amount<=0) {
			throw new ArithmeticException("Withdrawal amount canot be zero or negative");
			
		}
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Withdrawn amount ="+ amount);
			
	}
	public void showBalance() {
		System.out.println("Account number :"+accno + "Name :" + name +"Balance :" + balance) ;
		}
		
	}


