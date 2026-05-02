package org.wipro.automation.auex.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.auex.base.InitiateBrowser;
import org.wipro.automation.auex.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	
	@Test
	public void tc01_validate_login_functionality_valid_credential() throws Exception
	{
		
		
		LoginPage login = new LoginPage(driver);
		
		
		login.enter_username_textbox("it_john");
		login.enter_password_textbox("pass1234");
		login.click_login_button();
		
		
	}
	
}
