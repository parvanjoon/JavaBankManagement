package data;

public class Checking extends Account implements Comparable<Checking> {

	int checkingNumber; 
	float minimumBalance;
	float checkingBalance = 0;
	
	// GETTER ACCESS METHODS
	public int getAccountNumber()
	{
		return this.checkingNumber;
	}
	public float getCheckingBalance()
	{
		return this.checkingBalance;
	}
	public void setCheckingBalanceAdd (Float number)
	{
		this.checkingBalance = this.checkingBalance + number;
	}
	
	// SETTERS ACCESS MEETHODS
	public void setCheckingnumber(int checkingNumber)
	{
		this.checkingNumber = checkingNumber;
	}
	public void setMinimumBalance(float minimumBalance)
	{
		this.minimumBalance = minimumBalance;
	}
	public void setCheckingBalanceSub (Float number)
	{
		this.checkingBalance = this.checkingBalance - number;
	}
	
	public String toString()
	{
		String str;
		str = " Name : " + getFirstname() + " " + getLastname() + " - Account Number : " + getAccountNumber() + " - Account Balance : " + getCheckingBalance();
		return str;
	}

	public int compareTo(Checking other)
	{ 		
		if(getAccountNumber() > other.getAccountNumber())
		{
			return 1;
		}
		else if(getAccountNumber() < other.getAccountNumber())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
}
