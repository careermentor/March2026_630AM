package firstpkg;

public class Calculator 
{

	//global variable
	int a = 20;
	
	int b = 30;
	
	public void addition()
	{
		a=25;
		
		//local variable
		int a = 40;
		a=50;
		int b = 60;
		
		int c = a+b;
		System.out.println("Addition of 2 numbers: " + c); //50
		//System.out.println(a+b);  //50
		
		//System.out.println("a" + b); //a30
		
		//System.out.println("a" + "b");  //ab
	}
	
	
	public void substraction()
	{
		int c = a-b;  //
		System.out.println("substraction between 2 numbers: " + c);
	}
	
	public static void main(String[] args)
	{
		
		Calculator cal = new Calculator();
		
		cal.substraction();
		cal.addition();
		
		System.out.println(cal.a);
		
	}
	
}
