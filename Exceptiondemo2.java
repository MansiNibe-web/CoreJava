package Demo;

public class Exceptiondemo2 {

	public static void main(String[] args) {

		int i=6;
		int j=0;
		try {
		System.out.println(i/j); //critical code
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("The code is executed !");
		}
		
	}

}
