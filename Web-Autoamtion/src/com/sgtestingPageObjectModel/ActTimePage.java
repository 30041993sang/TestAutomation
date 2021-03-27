package com.sgtestingPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimePage {
	
	WebDriver oBrowser=null;
	public ActTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout Link WebElement
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	//user button
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement ouserbutton;
	public WebElement getuserbutton() {
		return ouserbutton;
		
	}
	
	//Add user
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAdduserbutton;
	public WebElement getAdduser() {
		return oAdduserbutton;
	}

	//create user
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return  userDataLightBox_usernameField;
	}
	
	private WebElement password;
	public WebElement getPwd()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement getPwdCopy()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement ocreateUserbutton;
	public WebElement getcreateUserbutton()
	{
		return ocreateUserbutton;
	}
	
	//Delete User
	@FindBy(xpath ="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oDemoUser;
	public WebElement getoDemoUserbutton()
	{
		return  oDemoUser;
	}
	
	@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
	private WebElement oDeleteuser;
	public WebElement getDeleteuserbutton()
	{
		return oDeleteuser;
	}
	
	//modify user 
	
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement getSavechangesbutton()
	{
		return userDataLightBox_commitBtn;
	}
	
	// create customer
	
	//clickOnTaskbutton
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")
	private WebElement oTasks;
	public  WebElement gettaskbutton()
	{
		return oTasks;
	}
	
	// clickOnAddnew
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oAddnew;
	public WebElement getAddnewButton()
	{
		return oAddnew;
	}
	
	// createNewCoustomer
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oNewCoustomer;
	public WebElement getNewCoustomer()
	{
		return oNewCoustomer;
	}
	
	//EntercoustomerName
	private WebElement customerLightBox_nameField;
	public WebElement getEntercoustomerName()
	{
		return customerLightBox_nameField;
	}
	
	//createCoustomer
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement ocreatecoustomer;
	public WebElement getcreatecoustomer() 
	{
		return ocreatecoustomer;
	}
	
	
	//deleteCoustomer
	//Settingbutton
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oCoustomerSetting;
	public WebElement getCoustomerSetting()
	{
		return oCoustomerSetting;
	}
	
	//clickActionbutton
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oAction;
	public WebElement getActionutton()
	{
		return oAction;
	}
	
	//clickDelete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement oDelete;
	public WebElement getDelete()
	{
		return oDelete;
	}
	
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getDeletePermanentaly()
	{
		return customerPanel_deleteConfirm_submitTitle;
		
	}
	
	//modifyCoustomer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement oModifyUser;
	public WebElement getModifyUser() 
	{
	return oModifyUser;	
	}
	
	//CreateProject
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement oNewproject;
	public WebElement getNewproject() 
	{
	return oNewproject;	
	}
	
	//ClickEnterProjectname
	
	private WebElement projectPopup_projectNameField;
	public WebElement getEnterProjectName()
	{
		return projectPopup_projectNameField;
	
	}
	@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
	private WebElement oCreateNewProject;
	public WebElement  getCreateNewProject()
	{
		return oCreateNewProject;
	}
	
	//DeleteProject
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oProjectSetting;
	public WebElement getProjectSetting()
	
	{
	return 	oProjectSetting;
	}
	
	//clickOnactions
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oActionButton;
	public WebElement getActionButton()
	{
		return oActionButton;
	}
	// clickonDelete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement oDeletebutton;
	public WebElement getDeletebutton()
	{
		return oDeletebutton;
	}
	
	//clickonDeletePermanenatlyproject
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getDeletePermanenatlyproject()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//modifyProject
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement omodifyProject;
	public WebElement getmodifyProject()
	{
		return  omodifyProject;
	}
	
	//createTask
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement oAddNewTask;
	public WebElement getAddNewTask()
	{
		return oAddNewTask;
	}
	
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement oCreatenewTask;
	public WebElement getCreatenewTask()
	{
		return oCreatenewTask;
		
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement oEnterTaskname;
	public WebElement getEnterTaskname()
	{
		return oEnterTaskname;
	}
	

	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement oCreateTask;
	public WebElement getCreateTask()
	{
		return oCreateTask;
	}
	
	//deleteTask
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
	private WebElement oclicktaskbutton;
	public WebElement getclicktaskbutton()
	{
		return oclicktaskbutton;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oActiontask;
	public WebElement getActiontask()
	{
		return oActiontask;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement oDeleteTask;
	public WebElement getDeleteTask()
	{
		return oDeleteTask;
	}
	
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getDeletepermanentlyTask()
	{
		return taskPanel_deleteConfirm_submitTitle; 
		
	}
	
	//modifyTask
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]")
	private WebElement odownIcon;
	public WebElement getdownIcon()
	{
		return odownIcon;
	}
	
	@FindBy(xpath="/html/body/div[29]/div/div[1]/div[2]/div[2]/div")
	private WebElement ochangetoBillable;
	public WebElement getchangetoBillable()
	{
		return ochangetoBillable;
	}
	
}


	

