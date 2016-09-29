/* Written by Aldrin Manus  **/

public class Account {

	private int accountNumber;
	private double balance = 0.0;


	Account(int accountNum, double bal)
	{
		this.accountNumber = accountNum;
		this.balance = bal;
	}

	Account(int accountNum)
	{
		this.accountNumber = accountNum;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double bal)
	{
		this.balance = bal;
	}

	public void credit(double amount)
	{
		if(this.balance >= 0 && amount >= 0)
		{
			this.balance = amount + balance;
		}
		else
		{ 
			 throw new IllegalArgumentException("Invalid balance or amount");
		}
	}

	public void debit(double amount)
	{
		if( balance >= 0 && amount >= 0)
		{
			 this.balance = balance - amount;
		}
		else
		{
			throw new IllegalArgumentException("Invalid balance or amount");
		}

	}
	public String toString()
	{
		String a = String.format("A/C no:%d, Balance=$%.02f",accountNumber,balance);
		return a;
	}
}
