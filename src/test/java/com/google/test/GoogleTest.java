package com.google.test;

import com.google.pages.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GoogleTest extends BaseTest {
  
	@Test
	public void googleSearchTextByEnter() {
		GoogleHomePage homePage = new GoogleHomePage(getDriver());
		GoogleSearchResultsPage resultPage = homePage.searchByEnter("Selenium");
		assertEquals(resultPage.getFirstLinkText(), "Selenium - Web Browser Automation");
	}
	
	@Test
	public void googleSearchTextByClick() {
		GoogleHomePage homePage = new GoogleHomePage(getDriver());
		GoogleSearchResultsPage resultPage = homePage.searchByClick("Selenium");
		assertEquals(resultPage.getFirstLinkText(), "Selenium - Web Browser Automation");
	}
	
	@Test
	public void googleSignInWrongEmail() {
		GoogleHomePage homePage = new GoogleHomePage(getDriver());
		GoogleSignInPage signInPage = homePage.clickOnSignInButton().inputEmail("selenium@selenium.org");
		assertEquals(signInPage.getEmailStatus(), "Couldn't find your Google Account");
	}
}
