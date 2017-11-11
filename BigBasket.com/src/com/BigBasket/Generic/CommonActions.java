package com.BigBasket.Generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

	public static WebDriver driver;

	public static void selectByIndex(WebElement wb, int n) {
		Select sel = new Select(wb);
		sel.selectByIndex(n);
	}

	public static void selectByValue(WebElement wb, String name) {
		Select sel = new Select(wb);
		sel.selectByValue(name);
	}

	public static void selectByVisibleText(WebElement wb, String n) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(n);
	}

	public static void mouseOverOperation(WebElement element, WebDriver driver)

	{
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
	}

	public static void moveToElement(WebDriver driver, WebElement src, WebElement des) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des);
	}

	public static void windowHandle(WebDriver driver, String eTitle) {
		Set<String> st = driver.getWindowHandles();
		Iterator<String> itr = st.iterator();

		while (itr.hasNext()) {
			String wh = itr.next();
			driver.switchTo().window(wh);
			if (driver.getTitle().equals(eTitle)) {
				break;
			}

		}
	}

}
