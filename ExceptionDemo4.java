package Demo;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		Checkentry ck=new Checkentry();
		ck.checkentry(num);
		

	}

}

class Checkentry{
	
	public void checkentry(int num)
	{
		try {
			if(num>=5)
			{
				throw new Exception("Invalid Entry");
			}
			else
			{
				System.out.println("Valid ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("code executed !");
		}
	}
}
