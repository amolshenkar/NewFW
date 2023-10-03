package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="firstname")WebElement fname;
	@FindBy(name="lastname")WebElement lname;
	//@FindBy(name="wp-submit")WebElement loginBtn;
	
	public void loginToFacebook(String emailApp,String passwordApp)
	{
		fname.sendKeys(emailApp);
		lname.sendKeys(passwordApp);
		//loginBtn.click();
	}
	
}
