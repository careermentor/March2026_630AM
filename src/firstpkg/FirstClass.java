package firstpkg;

 public class FirstClass
{

	int a = 10;
	
	float c = 10.5f;
	
	char d = 'J';
	
	public static String b = "Java";
	
	boolean e = true;
	
	String[] f = {"java","Python"};
	
	int[] g = {1,2};
	
	
	
	 public void printdata()
	{
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(f[1]);
		
	}
	
	 public static void addition()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
	
		FirstClass xyz = new FirstClass();  //instance of the object "FirstClass"
		
		addition();
		
		xyz.printdata();
		
		System.out.println(b);
		
		//xyz.addition();
		
		//SecondClass sc = new SecondClass();
		//sc.main(args);

	}
	
}
