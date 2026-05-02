package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation
{
	
	int x;
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		
		
		x= 100;
		System.out.println(x);
		
		
//		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");  // Launch in incognito mode

	        // Initialize driver with options
	        
	        driver= new ChromeDriver(options);
			
			//WebDriver driver = new EdgeDriver();  //launch edge browser
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the URL
			
			driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		
		System.out.println(x);
	}
	
	
	@Test
	public void validate_registretion_functionality()
	{
		
	
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Lee");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("it_john");
		
		driver.findElement(By.cssSelector("[value='Check availability']")).click();
		
		
		Select dob_month = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		
		
		//dob_month.selectByIndex(5);  //05
		//dob_month.selectByValue("06");  //05
		dob_month.selectByVisibleText("JUL");
		
		//dob_month.selectByContainsVisibleText("SE");
		
		//dob_month.deselectAll();
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	
	}

	@Test
	public void validate_login_functionality()
	{
		
	
		
		WebElement username_textbox = driver.findElement(By.id("login1"));
		username_textbox.sendKeys("it_santosh");
		
		username_textbox.clear();
		
		username_textbox.sendKeys("it_john");
		
		driver.findElement(By.name("passwd")).sendKeys("pass12344555");
		
		driver.findElement(By.name("passwd")).clear();
		
		//driver.findElement(By.className("signin-btn")).click();
		
		
	}
	
}
