package com.sauceDemo.TestCLasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;


public class TC01VerifyLoginFunctioanlity extends BaseClass
{
	
	@Test
	public void checktitle()
	{
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actalTitle))
		{
			System.out.println("Login test is passed");
		}
		else
		{
			System.out.println("Login test is failed");
		}		
		
	}
	
	
}



