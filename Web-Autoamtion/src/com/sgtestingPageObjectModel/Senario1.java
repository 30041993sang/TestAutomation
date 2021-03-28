package com.sgtestingPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class Senario1 {
	public static WebDriver oBrowser=null;
	public static ActTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
	
	static void launchBrowser()
	{
		try
		{
		String path= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe" );
		oBrowser =new ChromeDriver();
		oPage =new ActTimePage(oBrowser);
		oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
