

public class Account {

	private int balance = 10000;
	
	public int getBalance()
	{
		return balance;
	}
	
	public void deposit(int amount)
	{
		balance= balance+amount;
	}
	
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}
	
	public static void transfer(Account acc1,Account acc2,int amount)
	{
		// withdraw from acc1 and deposit to acc2
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}
}
