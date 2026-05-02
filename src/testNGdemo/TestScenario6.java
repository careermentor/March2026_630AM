package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario6
{

	@Test
	public void first_testcase()
	{
		//Step1
		System.out.println("first_testcase");
		
		//Hard assertion
		Assert.assertEquals("Login Successful", "Login Successful");  //fail and it will stop
		
		//Soft Assertion
		//SoftAssert sa = new SoftAssert();
		
		
		
		//Step2
		
		System.out.println("this step should work");
		Assert.assertEquals("Hello", "Hello");
		
		//Step3
		
		System.out.println("this step3 is working");
		Assert.assertEquals("Hello", "Hello World");
		
		//sa.assertAll();
		
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
}
