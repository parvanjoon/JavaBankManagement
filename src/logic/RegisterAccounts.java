package logic;

import java.util.Scanner;

import data.*;

public class RegisterAccounts {

	public Checking registerChecking(Checking acct, int accountNumber)
	{     
		  acct.setCheckingnumber(accountNumber); 
		  
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\n\t  Please Enter your First Name ? \n\t --> ");	      
	      acct.setFirstName(input.nextLine());
	      
	    System.out.printf("\n\t  Please Enter your Last Name ? \n\t --> ");	      
		  acct.setlastName(input.nextLine());
	    
		System.out.printf("\n\t  Please Enter your Pin ? \n\t --> ");	      
		  acct.setPin(input.nextInt()); 
		  
	    System.out.printf("\n\t  Please Enter your Preferred Minimum Balance ? \n\t --> ");	 
	      acct.setMinimumBalance(input.nextInt());
		
	      System.out.println("Your Account Number is " + acct.getAccountNumber() + ", Please Keep it for your Records");
	      
		  return acct;
	      
	}
	
	public Savings registerSaving(Savings acct, int accountNumber)
	{     
		  acct.setSavingNumber(accountNumber);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\n\t  Please Enter your First Name ? \n\t --> ");	      
	      acct.setFirstName(input.nextLine());
	      
	    System.out.printf("\n\t  Please Enter your Last Name ? \n\t --> ");	      
		  acct.setlastName(input.nextLine());
	    
		System.out.printf("\n\t  Please Enter your Pin ? \n\t --> ");	      
		  acct.setPin(input.nextInt());
		 
	    System.out.printf("\n\t  Please Enter This Accounts Annual Interest ? \n\t --> ");	      
		  acct.setannualInterest(input.nextFloat());
		  
	     System.out.println("Your Account Number is " + acct.getAccountNumber() + ", Please Keep it for your Records");
	      
		 return acct;
	}
}
