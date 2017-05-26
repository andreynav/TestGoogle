package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected String baseURL = "https://www.google.com/ncr";
	protected long timeOutInSeconds = 10;
	
	protected WebDriver getDriver() {
		return driver;
	}
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement assertThat(ExpectedCondition<WebElement> condition) {
		return (new WebDriverWait(driver, timeOutInSeconds)).until(condition);
	}
}
