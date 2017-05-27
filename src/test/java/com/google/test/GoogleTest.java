package com.google.test;

import com.google.pages.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GoogleTest extends BaseTest {
  
	@Test
	public void googleSearchTextByEnter() {
		//Test
		GoogleHomePage homePage = new GoogleHomePage(getDriver());
		GoogleSearchResultsPage resultPage = homePage.searchByEnter("Selenium");
		//Check
		String expectedResult = "Selenium - Web Browser Automation";
		String actualResult = resultPage.getLinkTextByNumber(0);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void googleSearchTextByClick() {
		//Test
		GoogleHomePage homePage = new GoogleHomePage(getDriver());
		GoogleSearchResultsPage resultPage = homePage.searchByClick("Selenium");
		//Check
		String expectedResult = "Selenium - Web Browser Automation";
		String actualResult = resultPage.getLinkTextByNumber(0);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void googleSignInWrongEmail() {
		//Test
		GoogleHomePage homePage = new GoogleHomePage(getDriver());
		GoogleSignInPage signInPage = homePage.clickOnSignInButton().inputEmail("selenium@selenium.org");
		//Check
		String expectedResult = "Couldn't find your Google Account";
		String actualResult = signInPage.getEmailStatus();
		assertEquals(actualResult, expectedResult);
	}
}
