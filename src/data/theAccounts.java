package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class theAccounts {

	public static  List<Account> theAccountsList = new ArrayList<Account>();	

	public static void addAccount(Account newAccount)
	{
		theAccountsList.add(newAccount);
	}
	
	public static void removeAccount(Account delAccount)
	{
		theAccountsList.remove(delAccount);
	}
	
	public void searchAccounts(int accountNumber)
	{
		for(Iterator<Account> i = theAccountsList.iterator(); i.hasNext(); ) {
		    Account item = i.next();
		    if (item.getAccountNumber() == accountNumber)
		    {
		    	System.out.println("This Account Number is in Use");
		    }
		    else 
			{
			System.out.println("This Account Number is not in Use");
			}   
		}
	}
	
	public void displayAccounts()
	{
		for(Iterator<Account> i = theAccountsList.iterator(); i.hasNext(); ) {
		    Account item = i.next();
		    System.out.println(item.toString());
		}
	}
	
}
