package oopsConcept;

public class QA2 extends QA1
{
	
	final int x = 200; //global 
	
	
	
	public void printvalueX(int y)
	{
		//x=600;
		
		final int x = 300;  //local
		//x=400;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
		super.sum(20, 30);
		
	}

	public QA2()
	{
		int a = 25;
		int b = 35;
		int c = a-b;
		System.out.println("sum of a&b: " + c);
		System.out.println("this is QA1 constructor");
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void subs(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of a&b: " + c);
	}
	
	public static void main(String[] args)
	{
	
		QA2 q2 = new QA2();
		//q2.subs(20, 30);
		
		//QA1 q1 = new QA1();
		q2.sum(20, 30);
		
		//System.out.println(q2.x);
		q2.printvalueX(400);
		//q2.qa11m();
		//q2.qa11m();
		
		
		
	}

	
	public void qa11m() {
		
		System.out.println("this is method of QA1I");
	}
	
}
