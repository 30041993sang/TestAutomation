package com.sgtestingTestscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
		

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
	
	public static void createUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();	
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("user");
		oBrowser.findElement(By.name("lastName")).sendKeys("demo");
		oBrowser.findElement(By.name("email")).sendKeys("user@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("userdemo");
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
	public static void deleteUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		String textcontent=oAlert.getText();
		System.out.println(textcontent);
		oAlert.accept();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("hello123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("hello123");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
