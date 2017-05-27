package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static final String BASE_URL = "https://www.google.com/ncr";
	protected WebDriver driver;
	protected static final int TIME_OUT = 10;
	
	protected WebDriver getDriver() {
		return driver;
	}
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement assertThat(ExpectedCondition<WebElement> condition) {
		return (new WebDriverWait(driver, TIME_OUT)).until(condition);
	}
}
