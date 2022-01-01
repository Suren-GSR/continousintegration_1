package com.nopEcommerce.test_cases;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.nopEcommerce.page_objects.Login_page;


public class TestCase_LoginTest_001 extends BaseClass {
	
	

	@Test
	public void LoginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
			
		Login_page lp = new Login_page(driver);
		
		lp.setUsername(Username);
		logger.info("User provided"); //logger msg
		
		lp.setPassword(Password);
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
			
		
			
		}
		else {
			
			captureScreen(driver,"loginTest");
			logger.info("Login Failed");
			Assert.assertTrue(false);
			//logger msg
		}
	}

}
