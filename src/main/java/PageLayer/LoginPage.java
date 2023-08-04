package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class LoginPage extends BaseClass{

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void loginPageFunctionality(String uname,String pass)
	{
		UtilsClass.sendkeys(username, uname);
		UtilsClass.sendkeys(password, pass);
		UtilsClass.click(loginbtn);
	}
	
}
