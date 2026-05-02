package firstpkg;

public class MathOperation
{

public MathOperation(int a) 
	
	{
		
	
		int b = a*a;
		
		System.out.println("square of num: " + b);
		
		//return b;
	
	}
	
	public int cube(int c)
	
	{
		
		int d = c*c*c;
		
		System.out.println(d);
		
		return d;
		
	}
	
	public boolean isEven(int num)
	
	{
		
		
		if (num%2==0) 
		{
			//System.out.println(num +": is Even ");
			return true;
		}
		
		else
			
		{
			//System.out.println(num + ": is Odd");
			return false;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation sq = new MathOperation(5);
		
		
		
		sq.cube(5);
		
		boolean x = sq.isEven(10);
		System.out.println(x);
		
		FirstClass.addition();

	}

}
