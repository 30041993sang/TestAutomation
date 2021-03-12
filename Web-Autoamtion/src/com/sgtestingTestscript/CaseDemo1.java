package com.sgtestingTestscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseDemo1 {
	
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createUser1();
		logout();
		loginAsUser1();
		createUser2();
		modifyUser2();
		logout();
//		closeApplication();
		
	}
	
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
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
	
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void minimizeflyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createUser1()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("user1");
		oBrowser.findElement(By.name("lastName")).sendKeys("demo");
		oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("userdemo1");
		oBrowser.findElement(By.name("password")).sendKeys("hello");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("hello");
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("userdemo1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("hello");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("userdemo2");
			oBrowser.findElement(By.name("password")).sendKeys("hello123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("hello123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void modifyUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("hello");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("hello");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
