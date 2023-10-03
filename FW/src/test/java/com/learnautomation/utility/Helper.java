package com.learnautomation.utility;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	// screenshot,alert,sync issue,frame,javascript executor
	
	public static void captureScreenShot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./Screenshot/login11.png"));
		} catch (Exception e) {
			System.out.println("Unable to capture screenshot in file"+e.getMessage());
		}
	}
	
	public void handleFrame()
	{
		
	}
	
	public void handleAlert()
	{
		
	}
	
	
}
