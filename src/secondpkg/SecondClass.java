package secondpkg;

import firstpkg.FirstClass;

public class SecondClass
{

	public static void main(String[] args)
	{
	
		int a = 20;
		
		System.out.println(a);
		
		System.out.println("this is main method");
	
		FirstClass abc = new FirstClass();  //instance of the object "FirstClass"
		
		abc.printdata();
		abc.addition();  
		
		System.out.println(abc.b);

	}

}
