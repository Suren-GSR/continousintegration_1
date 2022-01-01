package com.nopEcommerce.test_cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopEcommerce.page_objects.Login_page;
import com.nopEcommerce.utilities.XLUtils;

public class TestCase_LoginDDT_002 extends BaseClass


{

	@Test(dataProvider="LoginData")
	public void logintest(String user, String pwd) throws InterruptedException {
		
		driver.get(baseURL);
		driver.manage().window().maximize(); 
		
		Login_page lp = new Login_page(driver);
				
		lp.setUsername(user);
		logger.info("User provided"); //logger msg
		
		lp.setPassword(pwd);
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		Thread.sleep(2000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) 
		{
			lp.clickLogout();
			Assert.assertTrue(true);
					
		}
		else 
		{
			logger.info("Login Failed");//logger msg
			Assert.assertTrue(false);
		}

	}
		
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		
	
		String path=System.getProperty("user.dir")+"/src/test/java/com/nopEcommerce/test_data/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
		}
		
		return logindata;
		
	}
	
	
}
