package com.framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.util.waitUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword 
{
	public static WebDriver driver=null;
	public static waitUtil wait=null;
	/**
	 * This keyword is use for lunch Browser
	 * @param BrowserName to lunch
	 */
	public static void openBrowser(String BrowserName) 
	{
	if(BrowserName.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}else if(BrowserName.equalsIgnoreCase("Firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}else if(BrowserName.equalsIgnoreCase("Opera")) {
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
	}else {
		System.err.println("Invalid Browsername");
	}
	 wait=new waitUtil();
	}
	/**
	 * This keyword is use for Open URL
	 * @param url
	 */
	public static void lunchURL(String url) {
		driver.get(url);
		
	}
	/**
	 * 
	 * @param Compare 
	 * @return
	 */
	public static String getTitle() {
		return driver.getTitle();
		
	}
	/**
	 * This keyword is use for click on webelemnt using Css selector
	 * @param string
	 */
	public static void clickon(String locator) {
		 WebElement el = getWebElement(locator);
		el.click();
		}
	private static WebElement getWebElement(String locator) {
		String LocatorType=locator.split("##")[0];
		 String LocatorValue=locator.split("##")[1];
		 WebElement el=null;
		 
		 if(LocatorType.equalsIgnoreCase("Xpath"))
		 	el=driver.findElement(By.xpath(LocatorValue));
		 else if (LocatorType.equalsIgnoreCase("CSS")) 
			 el=driver.findElement(By.cssSelector(LocatorValue));
		else if (LocatorType.equalsIgnoreCase("id")) 
			el=driver.findElement(By.id(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("name"))
			el=driver.findElement(By.name(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("className"))
			el=driver.findElement(By.className(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("tagName")) 
			el=driver.findElement(By.tagName(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("PartialLinkedTest")) 
			el=driver.findElement(By.partialLinkText(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("LinkedTest")) 
			el=driver.findElement(By.linkText(LocatorValue));
		return el;
	}
	
	public static List<WebElement> getWebElements(String Locator) {
		String LocatorType=Locator.split("##")[0];
		 String LocatorValue=Locator.split("##")[1];
		 List<WebElement> elements=new ArrayList<>();
		 
		 if(LocatorType.equalsIgnoreCase("Xpath"))
			 elements=driver.findElements(By.xpath(LocatorValue));
		 else if (LocatorType.equalsIgnoreCase("CSS")) 
			 elements=driver.findElements(By.cssSelector(LocatorValue));
		else if (LocatorType.equalsIgnoreCase("id")) 
			elements=driver.findElements(By.id(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("name"))
			elements=driver.findElements(By.name(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("className"))
			elements=driver.findElements(By.className(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("tagName")) 
			elements=driver.findElements(By.tagName(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("PartialLinkedTest")) 
			elements=driver.findElements(By.partialLinkText(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("LinkedTest")) 
			elements=driver.findElements(By.linkText(LocatorValue));
		return elements;	

	}
	
	/**
	 * This keyword is use for click using By element
	 * @param element
	 */
	public static void clickon(By element) {
		driver.findElement(element).click();
	}
	public void clickon(WebElement xpath) {
		//driver.findElement(By.xpath(xpath)).click();

	}
	/**all 8 locator ke liye code likh denge-xpath,css,id,className,tagName,linkedTest,PartialLinked Text
	 * This keyword is for sent particuler word in search box in myntra testcase
	 * @param elemt 
	 * @param text
	 *  CSS##input[placeholder*=Se]
	 */
	
	public static void enterText(String Locator,String text) {
		
		String LocatorType=Locator.split("##")[0];//CSS or XPATH
		String LocatorValue=Locator.split("##")[1];//Locator value 1 index t thakibo
		WebElement element = null;
		
		if(LocatorType.equalsIgnoreCase("XPATH")) 
			element=driver.findElement(By.xpath(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("CSS")) 
			element =driver.findElement(By.cssSelector(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("id")) 
			element=driver.findElement(By.id(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("className"))
			element=driver.findElement(By.className(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("tagName")) 
			element=driver.findElement(By.tagName(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("PartialLinkedTest")) 
			element=driver.findElement(By.partialLinkText(LocatorValue));
		else if(LocatorType.equalsIgnoreCase("LinkedTest")) 
			element=driver.findElement(By.linkText(LocatorValue));
		element.sendKeys(text);
	}
	
		
		//WebElement el1=driver.findElement(By.cssSelector(Locator));//by css selctor di d
		//el1.sendKeys(Text);
		//el1.sendKeys(Keys.ENTER);
		//or
		//driver.findElement(By.cssSelector(Path)).sendKeys(Text+Keys.ENTER);		
	
	/**
	 * This keyword is used for closewindow
	 * @param Title
	 */
	public static void closewindow(String Title) {
		
		Set<String> allwindow=driver.getWindowHandles();
		for (String window : allwindow) 
		{
			driver.switchTo().window(window);
			if(driver.getTitle().equalsIgnoreCase(Title))
				driver.close();
			
		}
		

	}
	/**
	 * This keyword is used for maximise the window
	 */
	public static void maximiseWindow() {
		driver.manage().window().maximize();
		
	}
	public static void quiteAllWindow() {
		driver.quit();

	}
	public static void mousehover(int x,int y) throws AWTException {
		Robot Ro=new Robot();
		Ro.mouseMove(x, y);
		
	}
	public static List<String> getTextOfElements(By cssSelector) {
		
		List<String> ProductText=new ArrayList<String>();
		List<WebElement>productTitles=driver.findElements(cssSelector);
		for (WebElement productTitle : productTitles) {
			ProductText.add(productTitle.getText());
		}
		
		
		return ProductText;//return list of String
		
		
	}
	public static  List<String>getTextOfElements(String Locator) {
		List<WebElement>elements=getWebElements(Locator);//getWebElements call and list of webelmnt p pass
		//text get karna hein all elemnt ka string ka list bana lenge
		List<String> elementText=new ArrayList<>();
		for (WebElement element  : elements) {
			elementText.add(element.getText());
		}
		return elementText;
	}
	public static void enterText(WebElement el, String text) {
		el.sendKeys(text);
		
	}
	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser is close");
		
	}
	
}
