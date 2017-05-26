package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class GoogleSearchResultsPage extends BasePage {

	@FindBy (how = How.XPATH, using = "//div[@class='srg']//a[text()='Selenium - Web Browser Automation']")
	private WebElement firstLink;
	
	public GoogleSearchResultsPage(WebDriver driver) {
		super(driver);
	}

	public String getFirstLinkText() {
		return assertThat(visibilityOf(firstLink)).getText();
	}
}
