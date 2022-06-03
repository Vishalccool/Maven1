package com.sauceDemo.TestCLasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.AddToCartPageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class TC03VerifyAddtoCartFunctionality extends BaseClass
{
  
	@Test
	public void verifyAddtocart()
 {
	 	 
	 AddToCartPageClass add = new AddToCartPageClass(driver);
	 add.addTocart();
	 System.out.println("Product are added to cart");
	 Assert.assertTrue(false);
 }
}


