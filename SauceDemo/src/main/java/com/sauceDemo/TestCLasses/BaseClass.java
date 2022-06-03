package com.sauceDemo.TestCLasses;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class BaseClass 
{
WebDriver driver;
LoginPageClass login;
HomePageClass home;
Logger log;


    @Parameters("browserName")
	@BeforeMethod
	public void setupUpMethod(String browserName)
	{	
		if(browserName.equals("chrome"))
		{

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();	
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\selenium installation\\edgedriver_win64\\msedgedriver.exe");
			driver =  new EdgeDriver();
		}
		else
		{
			System.out.println("Open Browser");
		}
		
		log = Logger.getLogger("SauceDemo");
		PropertyConfigurator.configure("Log4j.properties");
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32 98.0.4\\chromedriver.exe");
//		driver =  new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		log.info("URL is opened");
	
	
		
		login = new LoginPageClass(driver);
		login.sendUsername();
		log.info("sendUsername");
		login.sendPassword();
		log.info("sendPassword");
		login.clickLoginButton();
		log.info("clickLoginButton");
	
	 }
	
	@AfterMethod
	public void logoutMethod()
	{
		home = new HomePageClass(driver);
		home.clickSettingButton();
		log.info("clickSettingButton");
		home.clickLogoutButton();
		log.info("clickLogoutButton");
	
	
	
//	@AfterClass
//	public void tearDown()
//		{
			driver.quit();
		}	

}
