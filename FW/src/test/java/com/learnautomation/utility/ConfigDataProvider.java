package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties pro;
	public ConfigDataProvider()
	{
		File src = new File("./Config/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Unable to open config file"+e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keytoserach)
	{
		return pro.getProperty(keytoserach);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStagingUrl()
	{
		return pro.getProperty("qaUrl");
	}
	
}
