package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propUtil 
{
	/**
	 * Properties.org Object repository ka file read ka code
	 * This method return value of spcific locator form Properties.org file
	 * @param locator
	 * @throws IOException
	 * this is code of Object repository ko read ka
	 */	
	public static String getlocator(String locator) throws IOException {
	
		String dir=System.getProperty("user.dir");//current directoey maven project 1
		FileInputStream fis=new FileInputStream(dir+"/src/main/resources/OR.Properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(locator);
}
	
	
	public void getproperty(String Filename ,String Key) 
	{
		

	}
	/**
	 * environment.Properties Object repository ka file read ka code
	 * This method return value of spcific locator form Environment.properties
	 * @param locator
	 * @throws IOException
	 * this is code of Object repository file ko read ka
	 */
	public static String getEnviroment(String Key) throws IOException 
	{
		String value="";
		String dir=System.getProperty("user.dir");
		FileInputStream fis1=new FileInputStream(dir+"/src/test/resources/environment.Properties");
		
		Properties prop=new Properties();
		prop.load(fis1);
		return prop.getProperty(Key);
		
}
}
