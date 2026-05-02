package testNGdemo;

import org.testng.annotations.Test;

public class TestScenario8
{

	@Test(groups="Regression")
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test(groups={"Smoke","Regression"})
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(groups="Smoke")
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(groups="Smoke")
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
}
