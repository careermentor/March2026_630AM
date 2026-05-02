package org.wipro.automation.auex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.auex.utilties.ReadPropertiesDataFile;

public class RegistrationPage
{

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}


	public void click_get_new_rediffmail_id_button() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesDataFile.read_element_locator("login_register_email_rediff_xpath"))).click();
	}
	
	public void enter_fullname_textbox(String fullname) throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropertiesDataFile.read_element_locator("register_fullName_css"))).sendKeys(fullname);
	}
	
	
	public void enter_email_textbox(String email) throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropertiesDataFile.read_element_locator("register_emailid_css"))).sendKeys(email);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.cssSelector(ReadPropertiesDataFile.read_element_locator("register_dob_day_css"))));
		
		dob_day.selectByVisibleText(day);
	}
	
	public void click_gender_female_radiobttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesDataFile.read_element_locator("register_gender_female_xpath"))).click();
	}
}
