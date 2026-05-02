package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsWebDriver
{
	WebDriver driver;
	
	@Test
	public void launchbrowser()
	{
		
//		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");  // Launch in incognito mode

	        // Initialize driver with options
	        
	        driver= new ChromeDriver(options);
			
			//WebDriver driver = new EdgeDriver();  //launch edge browser
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the URL
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			

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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		Select con = new Select(driver.findElement(By.id("country")));
		con.selectByVisibleText("India");
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//label[text()='City']")), "City"));
		
		Select city = new Select(driver.findElement(By.xpath("//select[contains(@name,'city')]")));
		
		city.selectByVisibleText("Hyderabad");
		
		
	
	}
	
}
