package org.wipro.automation.auex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.auex.utilties.ReadPropertiesDataFile;

public class LoginPage_PF
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username_textbox;
	
	@FindBy(name="passwd")
	WebElement password_textbox;

	
	@FindBy(css="[class='signin-btn']")
	WebElement login_button;

	public void enter_username_textbox(String uname) throws Exception
	{
		//driver.findElement(By.id("login1")).sendKeys("it_john");
		
		//WebElement username_textbox = driver.findElement(By.id(ReadPropertiesDataFile.read_element_locator("login_username_id")));
		username_textbox.sendKeys(uname);
	}
	
	
	public void enter_password_textbox(String pass) throws Exception
	{
		
		
		password_textbox.sendKeys(pass);
	}
	
	
	public void click_login_button() throws Exception
	{
		
		
		login_button.click();
	}
}
