package com.base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.framework.Keyword;
import com.util.Environment;

public class baseTest
{
	
	Keyword keyword=new Keyword();
	@BeforeMethod
	public void setUp() throws Exception {
		keyword.openBrowser(Environment.getBrowser());
		String env=System.getProperty("evn").toLowerCase();
		keyword.lunchURL(Environment.getURL(env));
	}
	@AfterMethod
	public void tearDown() throws Exception {
		keyword.closeBrowser();
	}
}
