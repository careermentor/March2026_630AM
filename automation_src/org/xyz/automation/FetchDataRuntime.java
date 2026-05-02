package org.xyz.automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchDataRuntime
{

	@Test
	public void login_fetch_element_state() throws Exception
	{
		
	//	WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Launch in incognito mode

        // Initialize driver with options
        WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new EdgeDriver();  //launch edge browser
		
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the URL
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        System.out.println(driver.findElement(By.id("remember")).isSelected());  //true
        
        driver.findElement(By.id("remember")).click();  
        
        System.out.println(driver.findElement(By.id("remember")).isSelected());  //false
        
        System.out.println(driver.findElement(By.name("proceed")).isEnabled());  //true
        
        System.out.println(driver.findElement(By.xpath("//h2[text()='Sign in']")).isDisplayed());  //true
	
	}
	
	@Test(enabled=false)
	public void webelements_list() throws Exception
	{
		
	//	WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Launch in incognito mode

        // Initialize driver with options
        WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new EdgeDriver();  //launch edge browser
		
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the URL
        
        driver.manage().window().maximize();
        
        String act_URL= driver.getCurrentUrl(); //fetch the URL from browser
        
        System.out.println(act_URL);
        
        Assert.assertEquals(act_URL, "https://mail.rediff.com/cgi-bin/login.cgi");
        
        String act_page_title = driver.getTitle();
        System.out.println(act_page_title);
        
        Assert.assertEquals(act_page_title, "Rediffmail - Free Email for Login with Secure Access");
        
        driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
        
        Thread.sleep(2000);
        
        String fullname = driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder");
        
        System.out.println(fullname);
        
        Assert.assertNotSame(fullname, "Enter your full name");
        
        String createrediffmail = driver.findElement(By.xpath("//h2[text()='Create a Rediffmail account']")).getText();
        
        System.out.println(createrediffmail);
        
        //find the location of the username textbox
        System.out.println(driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getLocation());
        
        System.out.println(driver.getPageSource());
      	
	}
	
}
