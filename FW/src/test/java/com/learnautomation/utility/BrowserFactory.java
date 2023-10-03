package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	WebDriver driver;
	public static WebDriver startApplication(WebDriver driver, String browsername, String appURL)
	{
		if(browsername.equals("Chrome"))
		{
			
		}
		else if (browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(browsername.equals("IE")) 
		{
			
		}
		else
		{
			System.out.println("Sorry we do not support this browser");
		}
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.manage().timeouts().wait(30,TimeUnit.SECONDS);
		
		return driver;
	}
	public static void quitBrowser(WebDriver driver) 
	{
				driver.quit();
	}
}
