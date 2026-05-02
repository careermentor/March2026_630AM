package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo_Calendar
{

	@Test
	public void calendar_text() throws Exception
	{
		
	//	WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Launch in incognito mode

        // Initialize driver with options
        WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new EdgeDriver();  //launch edge browser
		
        driver.get("https://practice-automation.com/calendars/"); //pass the URL
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2026-04-23");
        
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        
        driver.findElement(By.xpath("//button[contains(@aria-label,'Thu Apr 23')]")).click();
        
       // Thread.sleep(2000);  // 2 sec
        
        
       
	
	}
	
}
