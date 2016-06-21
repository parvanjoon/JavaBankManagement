package data;

import java.util.ArrayList;
import java.util.List;

public class Account {
	int pin;
	// Customer cust;
	String firstName, lastName;
	Date openDate; 
	List<Transactions> accountHistory = new ArrayList<Transactions>();	

	// GETTER ACCESS METHODS
public String getFirstname()
{
	return this.firstName;
}
public String getLastname()
{
	return this.lastName;
}
public int getAccountNumber()
{
	// DEFAULT ACCOUNT NUMBER, THIS WILL BE OVERRIDED BY CHECKING/SAVINGS ACCOUNTS
	int def = 703;
	return def;
}
public int getPin()
{
	return this.pin;
}
public List getHistory()
{
	return accountHistory;
	
}

	// SETTERS ACCESS MEETHODS
public void setFirstName(String firstName)
{
	this.firstName = firstName;
}
public void setlastName(String lastName)
{
	this.lastName = lastName;
}
public void setPin(int pin)
{
	this.pin = pin;
}
public void setHistory(Transactions daTransaction)
{
	this.accountHistory.add(daTransaction);
}


public int compareTo(Account other)
{	
	if(getAccountNumber() > other.getAccountNumber() )
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
