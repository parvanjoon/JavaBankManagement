package logic;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import logic.*;
import data.*;

public class Authenticate {

	public boolean AuthenticateAccount(Account item, int accountNumber, List<Account> theAccounts) {
		Checking acct = new Checking();
		 
	    if (item.getAccountNumber() == accountNumber)
	    {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Please Enter PIN ");
	    	if(item.getPin() == input.nextInt())
	    		{
	    			return true;
	    		}
	    
	}
		return false;
	}
	}
