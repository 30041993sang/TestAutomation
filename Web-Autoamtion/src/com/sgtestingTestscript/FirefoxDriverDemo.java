package com.sgtestingTestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverDemo {
	
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();

	}
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",path+"\\Library\\drivers\\geckodriver.exe");
		oBrowser=new FirefoxDriver();
		oBrowser.manage().window().maximize();	
		}catch(Exception e)
		{
			e.printStackTrace();
	}

}

	public static void navigate()
	{
		try
		{
		oBrowser.get("http://localhost:81/login.do");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
