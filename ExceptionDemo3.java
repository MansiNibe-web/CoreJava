package Demo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		Vit v=new Vit();
		v.Add(10, 0);

	}

}

class Vit{
	public void Add(int i, int j)
	{
		try {
			if(i==0||j==0)
			{
				throw new Exception("zero not allowed !");
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
		finally {
			System.out.println("Code executed !");
		}
	}
}