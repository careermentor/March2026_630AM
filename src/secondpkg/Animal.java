package secondpkg;

public class Animal {

	String Name;

	public Animal(String n) 
	{

		this.Name=n;
		//System.out.println("My name is :" + n);

	}

	public void display()

	{

		System.out.println("My name is :" + Name);

	}

	public static void main(String[] args) {

		Animal a1 = new Animal("Cookie");

		a1.display();

	}

}



