package exp;

public class Exceptionfirst {
	//Note: After writing the Exception catch as first then and remaining-
	//-exceptions after that then we get compilation error and also at runtime.
	
	int i=10;
	int j=0;
	int k;
	void m1()
	{
		try
		{
		k=i/j;
		}
	
		catch(Exception e)
		{
			e.getMessage();
		}
		catch(ArithmeticException i)
		{
			i.getMessage();
		}
			
	}
	public static void main(String[] args) {
		Exceptionfirst ess=new Exceptionfirst();
		ess.m1();
	}
}
