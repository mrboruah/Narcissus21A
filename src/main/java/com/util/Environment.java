package com.util;

import java.io.IOException;

public class Environment 
{
	public static String getURL(String environment) throws IOException {
		if(environment.equalsIgnoreCase("dev")) {
			return propUtil.getEnviroment("dev.url");
			}
		else if(environment.equalsIgnoreCase("qa"))
		{
			return propUtil.getEnviroment("qa.url");
		}
		else if(environment.equalsIgnoreCase("prepod"))
		{
			return propUtil.getEnviroment("prepod.url");
		}
		return environment;

	}
	public static String getUserName(String UserName) throws IOException 
	{
		if(UserName.equalsIgnoreCase("dev")) {
			return propUtil.getEnviroment("dev.url");
			}
		else if(UserName.equalsIgnoreCase("qa"))
		{
			return propUtil.getEnviroment("qa.url");
		}
		else if(UserName.equalsIgnoreCase("prepod"))
		{
			return propUtil.getEnviroment("prepod.url");
		}
		return UserName;

	}
	public static String getBrowser() throws IOException {
		return propUtil.getEnviroment("browserName");

	}
}
