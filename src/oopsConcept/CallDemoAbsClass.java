package oopsConcept;

public class CallDemoAbsClass extends DemoAbsClass
{

	
	public void meth2()
	{
	System.out.println("this is called password");
		
	}
	
	public static void main(String[] args) {
		
		CallDemoAbsClass cac = new CallDemoAbsClass();
		cac.meth1();
		cac.meth2();
		
	}

}
