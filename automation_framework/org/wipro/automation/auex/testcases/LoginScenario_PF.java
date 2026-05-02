package org.wipro.automation.auex.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.auex.base.InitiateBrowser;
import org.wipro.automation.auex.pages.LoginPage;
import org.wipro.automation.auex.pages.LoginPage_PF;

public class LoginScenario_PF extends InitiateBrowser
{

	
	@Test
	public void tc01_validate_login_functionality_valid_credential() throws Exception
	{
		
		
		LoginPage_PF login = new LoginPage_PF(driver);
		
		
		login.enter_username_textbox("it_john");
		login.enter_password_textbox("pass1234");
		//login.click_login_button();
		
		
	}
	
}
