package logic;

import data.*;
import java.util.Scanner;

public class DisplayScreens {

	Scanner input = new Scanner(System.in);
	int clientChoice;
	float tempAmount;
	
	public void checkingClient(Checking acct)
	{
		System.out.println("Welcome to Your Checking Account " + acct.getFirstname());
		System.out.println( " \n\n\t Please Select Options (1 OR 2 OR 3 OR 4)");
		System.out.printf( " \n\n\t   I. Check balance \n\n\t  II. Make Deposit \n\n\t III. Make Withdrawels \n\n\t\t --> ");
		
		clientChoice = input.nextInt();
		
		switch(clientChoice)
		{
		case 1:
			System.out.println("Dear " + acct.getFirstname() + ", Your current Balance is " + acct.getCheckingBalance());
			break;
		case 2:
			System.out.printf("How much would you like to Deposit ? \n\n\t\t --> ");
			tempAmount = input.nextFloat();
			acct.setCheckingBalanceAdd(tempAmount);
			System.out.println("Successfully Deposited " + tempAmount);
			break;
		case 3:
			System.out.printf("How much would you like to Withdrawel ? \n\n\t\t");
			tempAmount = input.nextFloat();
			acct.setCheckingBalanceSub(tempAmount);
			System.out.println("Successfully Withdrawed " + tempAmount);
			break; 
		default:
			System.out.println("You have made an Incorect Selection" + acct.getFirstname() + ". Please Try Again \n\n");
		}
		checkingClient(acct);
	}
	
	public void savingsClient(Savings acct)
	{
		System.out.println("Welcome to Your Savings Account " + acct.getFirstname());
		System.out.println( " \n\n\t Please Select Options (1 OR 2 OR 3 OR 4)");
		System.out.printf( " \n\n\t   I. Check balance \n\n\t  II. Make Deposit \n\n\t III. Make Withdrawels \n\n\t  IV. Calculate Monthly Interest \n\n\t    V. Modify Interest Rate \n\n\t\t --> ");
		
		clientChoice = input.nextInt();
		
		switch(clientChoice)
		{
		case 1:
			System.out.println("Dear " + acct.getFirstname() + ", Your current Balance is " + acct.getBalance() );
			break;
		case 2:
			System.out.printf("How much would you like to Deposit ? \n\n\t\t --> ");
			tempAmount = input.nextFloat();
			acct.setBalanceAdd(tempAmount);
			System.out.println("Successfully Deposited " + tempAmount);
			break;
		case 3:
			System.out.printf("How much would you like to Withdrawel ? \n\n\t\t");
			tempAmount = input.nextFloat();
			acct.setBalanceSub(tempAmount);
			System.out.println("Successfully Withdrawed " + tempAmount);
			break;
		case 4:
			System.out.println("Your Most Recent Monthly Interest is " + acct.getMontlyInterest() + ". Your new balance has been updated");
			break;
		case 5:
			System.out.println("Please Enter your New Interest Rate ? \n\n\t\t --> ");
			tempAmount = input.nextFloat();
			acct.setannualInterest(tempAmount);
			System.out.println("Successfully Updated Your interest Rate to " + tempAmount);
			break;
		default:
			System.out.println("You have made an Incorect Selection" + acct.getFirstname() + ". Please Try Again \n\n");
			break;
		}
		savingsClient(acct);
	}	
	
}
