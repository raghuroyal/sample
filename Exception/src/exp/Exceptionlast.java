package exp;

public class Exceptionlast {
	//Note:If we declare exception catch at last then we will not get any compilation errors.
	int i=10;
	int j=0;
	int k;
void m1()
{
	try
	{
	k=i/j;
	}
	catch(ArithmeticException i)
	{
		System.out.println(i.getMessage());
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
}
public static void main(String[] args) {
	Exceptionlast es=new Exceptionlast();
	es.m1();
}

}
