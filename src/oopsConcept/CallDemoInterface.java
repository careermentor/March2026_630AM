package oopsConcept;

public class CallDemoInterface implements DemoInterface
{

	
	public void meth3() 
	{
		
		System.out.println("this is Method3 coming from Interface");
	}

	
	public void meth4() 
	{
		
		System.out.println("this is Method4 coming from Interface");
	}

	public static void main(String[] args) {
		
		CallDemoInterface cdi = new CallDemoInterface();
		cdi.meth3();
		cdi.meth4();
		
	}
	
}
