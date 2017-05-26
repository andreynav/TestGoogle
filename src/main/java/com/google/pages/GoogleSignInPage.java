package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class GoogleSignInPage extends BasePage {

	@FindBy (how = How.ID, using = "identifierId")
	private WebElement emailInputField;
	@FindBy (how = How.XPATH, using = "//div[contains(text(), 'find your Google Account')]")
	private WebElement emailStatusField;
	
	public GoogleSignInPage(WebDriver driver) {
		super(driver);
	}
	
	public GoogleSignInPage inputEmail(String email) {
		assertThat(visibilityOf(emailInputField)).sendKeys(email, Keys.ENTER);
		return this;
	}

	public String getEmailStatus() {
		return assertThat(visibilityOf(emailStatusField)).getText();
	}
}
