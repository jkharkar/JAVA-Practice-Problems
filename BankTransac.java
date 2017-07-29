/*
 Write a program to create user defined exception which will allo to perform bank transactions
1. If user tries to withdraw amount > balance program must show Insufficient fund Exception
2. Before withdraw or deposit user must enter pin , if pin is not valid then it should show Invalid pin Exception 
3. User cannot deposit ? Rs.200000 without PAN details , if pan details are not provided program must raise 
exception saying InvalidTransaction*/

import java.io.*;

public class BankTransac {
    
  

	long bal = 25000L;
	String pan = null;
	String name = "ABC";
	String PIN = "1234";
	boolean b = false;
	
	public static void main(String args[]) throws Exception
	{
		BankTransac x = new BankTransac();
		x.chooseOpt();
	}
	
	public void showDetails()
	{
		System.out.println("Name: "+name+" || Balance: "+bal+" || PAN details: "+(pan == null?"Pan details not provided!! ": pan));
	}
	public void chooseOpt() throws Exception
	{
		b=true;
		while(b)
		{
			
			this.showDetails();
			System.out.println("Select an option: ");
			System.out.println("1. withdraw   2. deposit   3. Exit");
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			int opt = Integer.parseInt(br.readLine());
			
			switch(opt)
			{
			case 1 : System.out.println("Calling wd method..."); this.withdraw(); break;
			case 2 : System.out.println("Calling Deposit method... "); this.deposit(); break;
			case 3 : System.out.println("U chose exit. Exiting now..."); b=false; break;
			default : System.out.println("Invalid option.");
			}
		}
		
	}
	
	public void deposit() throws Exception
	{
		System.out.println("Enter amt u want to deposit: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int depAmt = Integer.parseInt(br.readLine());
		
		System.out.println("Enter PIN:");
		String entPIN = br.readLine();
		if(PIN.equals(entPIN))
		{
			if(depAmt >= 20000 && pan == null)
			{
				throw new InvalidTxException();
			}
			else if(depAmt < 20000 && depAmt > 0)
			{
				bal += depAmt;
				System.out.println(depAmt+" rs deposited in ur AC...");
			}
			else
			{
				System.out.println("invaid amt...");
			}
			
			
		}
		else {
			throw new InvalidPinException();
		}
		
		
	}
	
	public void withdraw() throws Exception
	{
		System.out.println("Enter amt u want to withdraw: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int wdAmt = Integer.parseInt(br.readLine());
		
		System.out.println("Enter PIN:");
		String entPIN = br.readLine();
		if(PIN.equals(entPIN))
		{
		
			if(wdAmt > bal)
			{
				throw new InsufficientFundException(wdAmt, bal);
			}
			else if(wdAmt <= bal)
			{
				bal -= wdAmt;
				System.out.println(wdAmt+" rs deducted from ur ac");
			}
			else
			{
				System.out.println("Invalid input...");
			}
			
		}
		else
		{
			throw new InvalidPinException();
		}
	}
	
}

class InsufficientFundException extends Exception
{
	InsufficientFundException(long amt, long bal)
	{
		System.out.println("Insufficient account balance...");
		System.out.println("AC balance: "+bal);
		System.out.println("Need more "+(amt-bal)+" rupees.");
	}
}

class InvalidPinException extends Exception
{
	public InvalidPinException() {
		
		System.out.println("PIN u have enterd is invalid...");
	}
}

class InvalidTxException extends Exception
{
	public InvalidTxException()
	{
		System.out.println("U need to provide ur PAN card details for tx above 20000...");
	}
}
    

