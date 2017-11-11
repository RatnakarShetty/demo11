package com.BigBasket.Test;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BigBasket.Generic.BaseTest;
import com.BigBasket.Page.HomePage;

public class HomeTest extends BaseTest {

	@BeforeTest
	public void OpenApp() {
		Reporter.log("App Opened");
	}

	@AfterTest
	public void CloseApp() {
		Reporter.log("App Closed");
	}

	@Test
	public void LoginPage() {
		HomePage hp = new HomePage(driver);
		hp.clickOnSortByCategory();
	}
}
