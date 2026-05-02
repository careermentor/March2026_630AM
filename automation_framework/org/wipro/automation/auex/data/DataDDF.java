package org.wipro.automation.auex.data;

import org.testng.annotations.DataProvider;

public class DataDDF 
{

	@DataProvider(name="login")
	public Object[][] logindata()
	{
		//String data1 = "it_john";
		
		//Object[] data2 = {"it_john","pass123"};  //1-dimentionsal array
		
		Object[][] data3 = {{"it_john","pass123"},{"it_david","david123"},{"it_neena","neena124"}};  //1-dimentionsal array
		
		return data3;
		
	}
	

	@DataProvider(name="register")
	public Object[][] registerdata()
	{
		//String data1 = "it_john";
		
		//Object[] data2 = {"it_john","pass123"};  //1-dimentionsal array
		
		Object[][] data3 = {{"John Lee","it_john","15"},{"David Lee","it_david","16"},{"Neena Lee","it_Neena","17"}};  //1-dimentionsal array
		
		return data3;
		
	}
	
}
