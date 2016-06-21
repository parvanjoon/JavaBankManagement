package data;

public class Savings extends Account implements Comparable<Savings> {

	int savingNumber; 
	float annualInterestRate, savingBalance;
	
	// GETTER ACCESS METHODS
	public int getAccountNumber()
	{
		return this.savingNumber;
	}
	public float getMontlyInterest()
	{
		float mi;
		mi = this.savingBalance * (this.annualInterestRate/1000);
		setBalanceAdd(mi);
		return mi;
	}
	public float getBalance()
	{
		return this.savingBalance;
	}
	
	// SETTERS ACCESS MEETHODS
	public void setSavingNumber(int savingNumber)
	{
		this.savingNumber = savingNumber;
	}
	public void setannualInterest(float annualInterest)
	{
		this.annualInterestRate = annualInterest;
	}
	public void setBalanceAdd (Float number)
	{
		this.savingBalance = this.savingBalance + number;
		Transactions currentTransaction = new Transactions();
		currentTransaction.amount = number;
		currentTransaction.typeOfTransaction = 'D';
		super.setHistory(currentTransaction);
	}
	public void setBalanceSub (Float number)
	{
		this.savingBalance = this.savingBalance - number;
		Transactions currentTransaction = new Transactions();
		currentTransaction.amount = number;
		currentTransaction.typeOfTransaction = 'W';
		super.setHistory(currentTransaction);
	}
	
	public String toString()
	{
		String str;
		str = " Name : " + getFirstname() + " " + getLastname() + " - Account Number : " + getAccountNumber() + " - Account Balance : " + getBalance() + " - Interest Rate " + getMontlyInterest() + " % .";
		return str;
	}
 
	public int compareTo(Savings other)
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
