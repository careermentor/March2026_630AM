package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario4
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void registeration()
	{
		System.out.println("registeration");
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test(dependsOnMethods="registeration")
	public void login()
	{
		System.out.println("login");
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
