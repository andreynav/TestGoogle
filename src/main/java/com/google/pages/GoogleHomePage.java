package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePage extends BasePage {

	@FindBy (how = How.XPATH, using = "//input[@name='q']")
	private WebElement fieldSearch;
	@FindBy (how = How.NAME, using = "btnG")
	private WebElement buttonSearch;
	@FindBy (how = How.XPATH, using = "//a[text()='Sign in']")
	private WebElement buttonSignIn;
	
	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}
	
	public GoogleSearchResultsPage searchByEnter(String text) {
		driver.get(baseURL);
		fieldSearch.sendKeys(text, Keys.ENTER);
		return new GoogleSearchResultsPage(driver);
	}

	public GoogleSearchResultsPage searchByClick(String text) {
		driver.get(baseURL);
		fieldSearch.sendKeys(text);
		buttonSearch.click();
		return new GoogleSearchResultsPage(driver);
	}
	
	public GoogleSignInPage clickOnSignInButton() {
		buttonSignIn.click();
		return new GoogleSignInPage(driver);
	}
}
