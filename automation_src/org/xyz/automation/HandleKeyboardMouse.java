package org.xyz.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HandleKeyboardMouse
{
	
	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		
//		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");  // Launch in incognito mode

	        // Initialize driver with options
	        
	        driver= new ChromeDriver(options);
			
			//WebDriver driver = new EdgeDriver();  //launch edge browser
			
			driver.get("https://demoqa.com/frames"); //pass the URL
			
			driver.manage().window().maximize();
			
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		driver.switchTo().defaultContent();
		
		ScreenshotResult.testresult(driver,"handleFrames");
		
			
	}
	
	@Test
	public void handleAlert() throws Exception
	{
		
//		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");  // Launch in incognito mode

	        // Initialize driver with options
	        
	        driver= new ChromeDriver(options);
			
			//WebDriver driver = new EdgeDriver();  //launch edge browser
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the URL
			
			driver.manage().window().maximize();
			
			driver.findElement(By.className("signin-btn")).click();
			
			driver.switchTo().alert().accept();
			
			ScreenshotResult.testresult(driver,"handleAlert");
	}
	
	@Test(enabled=false)
	public void handleMouse()
	{
		
//		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");  // Launch in incognito mode

	        // Initialize driver with options
	        
	        driver= new ChromeDriver(options);
			
			//WebDriver driver = new EdgeDriver();  //launch edge browser
			
			driver.get("https://www.mphasis.com/home.html"); //pass the URL
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
			//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
			//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //right click
			
			act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
			
			//act.click(driver.findElement(By.xpath("//span[contains(text(),'HealthCare')]"))).perform();
			
			
			//act.dragAndDrop(source, target);
			
			//control + click
			
			act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'HealthCare')]"))).keyUp(Keys.CONTROL).perform();
			
			Set<String> windows_id = driver.getWindowHandles();
			
			System.out.println(windows_id);
			
			Iterator<String> itr = windows_id.iterator();
			
			String main_window = itr.next();
			
			String child_window = itr.next();
			
			String child2_window = itr.next();
			
			driver.switchTo().window(child_window);

	}
	
	@Test(enabled=false)
	public void handleKeyboard()
	{
		
//		WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");  // Launch in incognito mode

	        // Initialize driver with options
	        
	        driver= new ChromeDriver(options);
			
			//WebDriver driver = new EdgeDriver();  //launch edge browser
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the URL
			
			driver.manage().window().maximize();
			
			Actions act = new Actions(driver);
			
			act.sendKeys("johnemail").perform();
			
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
			
			act.sendKeys(Keys.TAB).perform();
			
			act.sendKeys("pass1234").perform();
			
			//act.sendKeys(Keys.ENTER).perform();
			
	}
	
}
