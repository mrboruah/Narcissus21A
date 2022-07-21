package com.util;


import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.Keyword;




public class waitUtil 
{
	WebDriverWait wait;
	public waitUtil() {//make constructor
		wait=new WebDriverWait(Keyword.driver, Duration.ofSeconds(30));
		wait.withMessage("TimeOut");
		wait.pollingEvery(Duration.ofMillis(500));
	}
	public void forDuration(long milliseconds) {
		//wait.until(ExpectedConditions.v)visibly denge toh ebelemnt dena pedga so logic write systemtime
		long StartTime=System.currentTimeMillis();
		long endTime=StartTime+milliseconds;
		while(StartTime!=endTime) {
			StartTime=System.currentTimeMillis();
		}
	}
}
