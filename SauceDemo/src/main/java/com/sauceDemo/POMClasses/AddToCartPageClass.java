package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPageClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//div//button")
	private List <WebElement> addTocart;

	public AddToCartPageClass (WebDriver driver)
	{
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void addTocart()
//	{
//		addTocart.get(4).click();
//	}
	
// when we have to add all item in cart so we use for loop	
	public void addTocart()
	{
		for(int i=2; i<8; i++)
		{
		 addTocart.get(i).click();
		}
	}
}