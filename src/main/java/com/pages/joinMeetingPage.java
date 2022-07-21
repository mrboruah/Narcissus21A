package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class joinMeetingPage 
{
		@FindBy(css="span.mvlogo-size-app1 img[alt='ijmeetimage']")
		public WebElement quickJoinMeeting;
		
		public String getQuickJoinMeetingText() {
			return quickJoinMeeting.getText();
			

		}

}
