package oopsConcept;

public abstract class DemoAbsClass 
{

	int x = 100;
	
	
	public void meth1()
	{
		x=200;
		System.out.println("concrete method");
	}
	
	
	public abstract void meth2();
	
	public static void main(String[] args) 
	{
	
	//	DemoAbsClass da = new DemoAbsClass();
	//	da.meth1();
		
	}
}
