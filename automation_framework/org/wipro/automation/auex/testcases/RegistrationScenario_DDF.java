package org.wipro.automation.auex.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.auex.base.InitiateBrowser;
import org.wipro.automation.auex.data.DataDDF;
import org.wipro.automation.auex.pages.RegistrationPage;

public class RegistrationScenario_DDF extends InitiateBrowser
{

	
	@Test(dataProvider="register",dataProviderClass=DataDDF.class)
	public void tc02_validate_registration_functionality_valid_data(String fullname, String email, String DOB_Day) throws Exception
	{
		
		
		RegistrationPage reg = new RegistrationPage(driver);
		
		reg.click_get_new_rediffmail_id_button();
		reg.enter_fullname_textbox(fullname);
		reg.enter_email_textbox(email);
		reg.select_dob_day(DOB_Day);
		reg.click_gender_female_radiobttn();
	}
	
}
