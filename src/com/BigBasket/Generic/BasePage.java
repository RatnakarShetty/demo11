package com.BigBasket.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
		// to verify the title

	public void verifyTitle(String eTitle)
	{
		try
		
		
		{
			System.out.println("git");
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching"+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching"+eTitle,true);
			Assert.fail();
		}
	}

	public void verifyelementPresent(WebElement wb)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(wb));
			Reporter.log("");
			
		}
		catch (Exception e) {
			Reporter.log("Element is Present"+wb,true);
			Assert.fail();
		}
	}

}
