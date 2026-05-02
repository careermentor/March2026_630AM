package firstpkg;

public class ArthOperation 
{
	

	public ArthOperation()
	{
		int a = 20;
		int b = 30;
		int c = a + b;
		System.out.println("constructor's sum of a&b:  "  + c);
		
	}
	
	
	public ArthOperation(int a, int b)
	{
		int c = a+b;
		System.out.println("constructor's addition: " + c);
	}
	
	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a + b;
		System.out.println("sum of a&b:  "  + c);
		
		float d = 20.5f;
		
		String e = "Java";
		
		return c;
		
		
	}
	
	public int addition(int a, int b)
	{
		//int c = a+b;
		System.out.println(  a+b );
		return a+b;
	}
	
	
	//30+40+50
	
	public static void main(int a) 
	{
		int b = a*a;
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		ArthOperation ao1 = new ArthOperation();
		ArthOperation ao2 = new ArthOperation(60, 70); //constructor will automatically get called
		
		int x = ao2.sum();
		
		
		System.out.println(x);  //
		
		ao1.addition(x, 40);
		
		int y = ao2.addition(30, 40);
		int z = ao2.addition(y, 50);
		System.out.println(z);
		
		ao1.main(5);
	}
	
}
