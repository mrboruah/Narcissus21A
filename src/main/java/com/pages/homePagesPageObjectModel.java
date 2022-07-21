package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.framework.Keyword;
//Pgae object model
//here write all locator and uska method
public class homePagesPageObjectModel 
{
	@FindBy(css="span.mvlogo-size-app1 img[alt='ijmeetimage']")
	public WebElement ijMeetLogo;
	
	@FindBy(css="a[href=\"https://ijmeet.com/app?csrt=17272497217666778740\"]")
	public WebElement joinMeetinglink;
	
	@FindBy(css="a[href=\"https://ijmeet.com/host_meeting?csrt=17272497217666778740\"]")
	public WebElement hostMeetinglink;
	
	
	
	public void clickOnLogo() 
	{
		ijMeetLogo.click();
	}
	
	public void clickOnJoinMeeting() {
		joinMeetinglink.click();

	}
	public String getTextOfJoinMeeting() {
		
		return joinMeetinglink.getText();
		

	}
	public static String getTitle() {
		Keyword keyword=new Keyword();
		return keyword.getTitle();

	}
}
