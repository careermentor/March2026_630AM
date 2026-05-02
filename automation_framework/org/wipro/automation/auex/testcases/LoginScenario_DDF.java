package org.wipro.automation.auex.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.auex.base.InitiateBrowser;
import org.wipro.automation.auex.data.DataDDF;
import org.wipro.automation.auex.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	
	@Test(dataProvider="login", dataProviderClass=DataDDF.class)
	public void tc01_validate_login_functionality_valid_credential(String username, String password) throws Exception
	{
		
		
		LoginPage login = new LoginPage(driver);
		
		
		login.enter_username_textbox(username);
		login.enter_password_textbox(password);
		login.click_login_button();
		
		
	}
	
	
	
}
