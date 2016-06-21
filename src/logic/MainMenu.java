package logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import data.*;
import logic.*;

public class MainMenu {
	
	public static void main(String [ ] args)
	{		
	      System.out.println("Welcome to HBC Canada, Please Select your Account Type");
	      System.out.printf("\n\t  I. Sign In  \n\t II. Register\n\t --> ");
	      Scanner input = new Scanner(System.in);
	      int accountStatus;
	      try
	      {
	    	  accountStatus = input.nextInt();
	    	  checkSignInOrRegister(accountStatus);
	      }
	      catch(Exception e)
	      {
	    	  System.out.println("\n\tInvalid Entry (Digits Only), Please Try Again \n\n ");
	    	  String[] empty = {"",""};
	    	  main(empty);
	      }
	}

	private static void checkSignInOrRegister(int accountStatus) {
		switch(accountStatus)
		{
		case 1:
			signIn();
			break;
		case 2:
			createAccount();
			break;
		default:
			System.out.println("Invalid Option, Please Try Again ");
	    	String[] empty = {"",""};
	        main(empty);
			break;
		}	
	}

	private static void createAccount() {
		System.out.printf("\n\t  I. Create Checkings Account \n\t II. Create Savings Account \n\t --> ");
	      @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    AtomicInteger seq = new AtomicInteger();
	      int nextVal = theAccounts.theAccountsList.size() + 1 ;
	      int accountType;
	      
	      accountType = input.nextInt();
	      
	      RegisterAccounts ra = new RegisterAccounts();
	      String[] empty = {"",""};
	      
	      switch(accountType)
	      {
	      case 1:
	    		Checking newCheckings = new Checking();
	    		newCheckings = ra.registerChecking(newCheckings, nextVal);
		    	theAccounts.addAccount(newCheckings);
		    	System.out.println("\n\n Successfully created " + newCheckings.getFirstname() + " Checkings Account \n\n ");
		    	main(empty);
	    		
	    	  break;
	      case 2:
				Savings newSavings = new Savings();
				newSavings = ra.registerSaving(newSavings, nextVal);
				theAccounts.addAccount(newSavings);
				System.out.println("\n\n Successfully created " + newSavings.getFirstname() + " Savingss Account \n\n ");
				main(empty);
	    	  break;
	      default:
	    	  System.out.println("Invalid Option, Please Try Again ");
	    	  createAccount();
	    	  break;
	      }
		
	}

	private static void signIn() {
		System.out.printf("\n\t  Enter Account Number \n\t --> ");
	      Scanner input = new Scanner(System.in);
	      Authenticate ath = new Authenticate();
	      DisplayScreens ds = new DisplayScreens();
	      int accountNumber;   
	      accountNumber = input.nextInt();
	      
	      for(Iterator<Account> i = theAccounts.theAccountsList.iterator(); i.hasNext(); ) {
			    Account item = i.next();
			    if (ath.AuthenticateAccount(item,accountNumber, theAccounts.theAccountsList))
			    {
			    	if(item instanceof Checking)
			    	{
			    		ds.checkingClient((Checking) item);
			    	}
			    	else if (item instanceof Savings)
			    	{
			    		ds.savingsClient((Savings) item);	
			    	}
			    }
	     
	    	//  catch(Exception b)
	    	  {
	    	  System.out.println("Invalid Account Type, Please Try Again ");
	    	  String[] empty = {"",""};
	    	  main(empty);
	      }
	    	  }
	}
}
