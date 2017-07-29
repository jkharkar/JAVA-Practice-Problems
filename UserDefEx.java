import java.io.*;

public class UserDefEx {

	public static void main(String args[]) throws Exception
	{
		UserDefEx x = new UserDefEx();
		x.getInput();
	}
	
	public void getInput() throws Exception
	{
		System.out.print("Enter salary amt: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		long amt = Long.parseLong(br.readLine());
		
		if(amt>100000)
		{
			System.out.println("Eligible for 1000000");
		}
		else if(amt>50000)
		{
			System.out.println("Eligible for 500000");
		}
		else if(amt>10000)
		{
			System.out.println("Eligible for 100000");
			
		}
		else if(amt<=0 || amt<=10000)
		{
			throw new LoanException("Not eligible for loan");
		}
	}
}

class LoanException extends Exception
{
	LoanException(String msg)
	{
		System.out.println(msg);
	}
}
