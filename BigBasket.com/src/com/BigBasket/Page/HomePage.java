package com.BigBasket.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BigBasket.Generic.BasePage;

public class HomePage extends BasePage{

	@FindBy(xpath="")
	private WebElement SortByCategory;
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void clickOnSortByCategory()
	{
		SortByCategory.click();
	}
	
}
