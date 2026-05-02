package org.xyz.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebElementsListDemo
{

	@Test
	public void webelements_list() throws Exception
	{
		
	//	WebDriver driver = new ChromeDriver();  //launch chrome browser
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Launch in incognito mode

        // Initialize driver with options
        WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new EdgeDriver();  //launch edge browser
		
        driver.get("https://www.saucedemo.com/"); //pass the URL
        
        driver.manage().window().maximize();
        
     // Locate Username field and enter value
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // Locate Password field and enter value
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        // Click Login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        
        Thread.sleep(2000);
        
      List<WebElement> productlist =   driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
      
      System.out.println(productlist.size());   //6
      
      //System.out.println(productlist.get(1).getText());
      
      for(WebElement list : productlist)
      {
    	  System.out.println(list.getText());
      }
      
      productlist.get(1).click();
	
	}
	
}
