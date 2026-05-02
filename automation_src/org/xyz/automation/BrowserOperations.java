package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserOperations
{

	@Test
	public void validate_login_functionality() throws Exception
	{
		
	//	WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Launch in incognito mode

        // Initialize driver with options
        WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new EdgeDriver();  //launch edge browser
		
        driver.get("https://www.google.com/"); //pass the URL
        
        Thread.sleep(2000);
        
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		//driver.close();   //will close only one active winodw
		driver.quit();  //will close all the open window
		
	}
	
}
