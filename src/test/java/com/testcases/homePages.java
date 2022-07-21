package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.baseTest;
import com.framework.Keyword;
import com.pages.homePagesPageObjectModel;
import com.pages.joinMeetingPage;
//Wireite test case
public class homePages extends baseTest
{
	@Test
	public void verifyOnClickOnJoinMeetingUserRedirectsToJoinMeetingPage() {
		homePagesPageObjectModel home=new homePagesPageObjectModel();//homepage of IJMeet class ka object creat
		homePagesPageObjectModel home1=PageFactory.initElements(Keyword.driver, homePagesPageObjectModel.class);
		
		
		
		home.clickOnJoinMeeting();//using object call click on joint method
		home.getTextOfJoinMeeting();
		
		String  expectedTitle="Quick join meeting";
		joinMeetingPage join=new joinMeetingPage();//2nd page
		joinMeetingPage join1=PageFactory.initElements(Keyword.driver, joinMeetingPage.class);
		String actual=join.getQuickJoinMeetingText();
		
		Assert.assertEquals(actual, expectedTitle);

	}
}
