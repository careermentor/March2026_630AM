package org.wipro.automation.auex.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.auex.base.InitiateBrowser;
import org.wipro.automation.auex.pages.ProductPage;

public class ProductScenario extends InitiateBrowser
{

	
	@Test
	public void test_Case_9_Search_Product() throws Exception
	{
		
		
		ProductPage prod = new ProductPage(driver);
		
		prod.click_product_menu();
		prod.enter_productname_textbox("summer white top");
		
		prod.click_search_button();
	}
	
}
