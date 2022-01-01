package com.nopEcommerce.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

public WebDriver ldriver;

public Login_page(WebDriver rdriver){
      ldriver=rdriver;
 
      PageFactory.initElements(rdriver, this);
   }

@FindBy(id="Email")
@CacheLookup
WebElement txtEmail;

@FindBy(id="Password")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
@CacheLookup
WebElement btnlogin;

@FindBy(linkText="Logout")
@CacheLookup
WebElement lnklogout;

public void setUsername(String uname) throws InterruptedException {
	txtEmail.clear();
	
	txtEmail.sendKeys(uname);
	Thread.sleep(3000);
}
public void setPassword(String pwd) throws InterruptedException
{
	txtPassword.clear();
	Thread.sleep(2000);
	txtPassword.sendKeys(pwd);
}
	
public void clickLogin()
{
	btnlogin.click();
}



public void clickLogout()
{
	lnklogout.click();
}


		// TODO Auto-generated method stub

	}


