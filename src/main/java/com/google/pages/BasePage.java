package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.google.test.SeleniumDriver.getDriver;

public class BasePage {

	protected static final int TIME_OUT = 10;
	public static final String BASE_URL = "https://www.google.com/ncr";
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(getDriver(), this);
	}
	
	public WebElement assertThat(ExpectedCondition<WebElement> condition) {
		return (new WebDriverWait(getDriver(), TIME_OUT)).until(condition);
	}
}
