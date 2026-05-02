package org.wipro.automation.auex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.auex.utilties.ReadPropertiesDataFile;

public class ProductPage
{

	WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click_product_menu() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesDataFile.read_element_locator("home_menu_products_xpath"))).click();
	}
	
	
	public void enter_productname_textbox(String prod_name) throws Exception
	{
		
		driver.findElement(By.id(ReadPropertiesDataFile.read_element_locator("product_search_text_id"))).sendKeys(prod_name);
	}
	
	
	public void click_search_button() throws Exception
	{
		driver.findElement(By.id(ReadPropertiesDataFile.read_element_locator("product_search_button_id"))).click();
	}
	
	
	
	
	
	

	
	
}
