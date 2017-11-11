package com.BigBasket.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements GenericUtils{

	public WebDriver driver;
		
		@BeforeMethod
		
		public void preConditions()
		{
			System.setProperty(Chrome_Key, Chrome_Value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bigbasket.com/");
			
			
		}
		
		/*@AfterMethod
		
		public void postConditions(){
			
			driver.close();
		}*/

}
