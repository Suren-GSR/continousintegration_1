package com.nopEcommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	Properties pro;
	public ReadConfig() {
	
	File src=new File("./Configuration\\Config.properties");
	
	try {
		
		FileInputStream fis=new FileInputStream(src);
		
		pro=new Properties();	
		
		pro.load(fis);
		
			}
	
	catch(Exception e) 
	{
		
	System.out.println("Exception is "+ e.getMessage());
		
	}
	
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}

	public String getUseremail()
	{
		String username=pro.getProperty("useremail");
		return username;
	}
	
	public String getPassword()
	{
		String Password=pro.getProperty("password");
		return Password;
	}
	
	public String getChromepath()
	{
		String Chromepath=pro.getProperty("chromepath");
		
		return Chromepath;
	}
	
	public String getedgepath()
	{
		String edgepath=pro.getProperty("edgepath");
		
		return edgepath;
	}
	
	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		
		return firefoxpath;
	}
	
}
