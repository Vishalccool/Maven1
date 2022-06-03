package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingButton;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	

	public HomePageClass(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	
	public void clickSettingButton()
	{
		settingButton.click();
    }
	
	public void clickLogoutButton()
	{
		logOutButton.click();
	}

	
}



