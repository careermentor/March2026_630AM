package org.wipro.automation.auex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.auex.utilties.ReadPropertiesDataFile;

public class LoginPage
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		
	}


	public void enter_username_textbox(String uname) throws Exception
	{
		//driver.findElement(By.id("login1")).sendKeys("it_john");
		
		driver.findElement(By.id(ReadPropertiesDataFile.read_element_locator("login_username_id"))).sendKeys(uname);
	}
	
	
	public void enter_password_textbox(String pass) throws Exception
	{
		
		
		driver.findElement(By.name(ReadPropertiesDataFile.read_element_locator("login_password_name"))).sendKeys(pass);
	}
	
	
	public void click_login_button() throws Exception
	{
		
		
		driver.findElement(By.cssSelector(ReadPropertiesDataFile.read_element_locator("login_loginbttn_css"))).click();
	}
}
