package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.baseTest;
import com.framework.Keyword;
import com.util.propUtil;



public class Testcases extends baseTest
{
	 @Test(description="with framework")
	 public static  String verifyhomepage()  {
		return Keyword.getTitle();
}
	

	 
}
