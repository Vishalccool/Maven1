package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass 
{   
	// 1. WebDriver driver global initialize
	WebDriver driver;
	
	//2. Will find the webelement
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	
	//3.Create constructor
	public LoginPageClass(WebDriver driver)
	 {
		 //4. Assign local var to global var
		 this.driver = driver;
		 //5. calling the method of pagefactory
		 PageFactory.initElements(driver, this);
	 }
	
//	6. Create methods to do the actions on elements
	
	public void sendUsername()
	    {
		   username.sendKeys("standard_user");
	    }
	
	 public void sendPassword()
		 {
		 password.sendKeys("secret_sauce");
		 }
	
	 public void clickLoginButton()
	    {
		 loginButton.click();
		}
	
}
