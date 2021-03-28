package com.sgtestingPageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ModifyUser {
	public static WebDriver oBrowser=null;
	public static ActTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
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
			String path =System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path +"\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			oPage=new ActTimePage(oBrowser);
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


	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(5000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(5000);
			oPage.getLogin().click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyoutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout() 
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser() 
	{
		try
		{
			oPage.getuserbutton().click();
			Thread.sleep(4000);
			oPage.getAdduser().click();
			Thread.sleep(5000);
			oPage.getfirstName().sendKeys("user");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("demo");
			Thread.sleep(2000);
			oPage.getemail().sendKeys("user@mail.com");
			Thread.sleep(2000);
			oPage.getusername().sendKeys("userdemo");
			Thread.sleep(2000);
			oPage.getPwd().sendKeys("hello");
			Thread.sleep(2000);
			oPage.getPwdCopy().sendKeys("hello");
			Thread.sleep(2000);
			oPage.getcreateUserbutton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oPage.getoDemoUserbutton().click();
			Thread.sleep(5000);
			oPage.getDeleteuserbutton().click();
			Thread.sleep(5000);
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
	
	static void modifyUser()
	{
		try
		{
			oPage.getoDemoUserbutton().click();
			Thread.sleep(5000);
			oPage.getPwd().sendKeys("hello123");
			Thread.sleep(2000);
			oPage.getPwdCopy().sendKeys("hello123");
			Thread.sleep(2000);
			oPage.getSavechangesbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
