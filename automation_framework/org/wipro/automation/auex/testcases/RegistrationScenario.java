package org.wipro.automation.auex.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.auex.base.InitiateBrowser;
import org.wipro.automation.auex.pages.RegistrationPage;

public class RegistrationScenario extends InitiateBrowser
{

	
	@Test
	public void tc02_validate_registration_functionality_valid_data() throws Exception
	{
		
		
		RegistrationPage reg = new RegistrationPage(driver);
		
		reg.click_get_new_rediffmail_id_button();
		reg.enter_fullname_textbox("John Lee");
		reg.enter_email_textbox("it_john");
		reg.select_dob_day("15");
		reg.click_gender_female_radiobttn();
	}
	
}
