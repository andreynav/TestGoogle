package com.google.test;

import com.google.pages.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GoogleTest extends BaseTest {
  
	@Test
	public void googleSearchTextByEnter() {
		//===TEST===
		GoogleSearchResultsPage resultPage = homePage().searchByEnter("Selenium");
		//===CHECK===
		String expectedResult = "Selenium - Web Browser Automation";
		String actualResult = resultPage.getLinkTextByNumber(0);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void googleSearchTextByClick() {
		//===TEST===
		GoogleSearchResultsPage resultPage = homePage().searchByClick("Selenium");
		//===CHECK===
		String expectedResult = "Selenium - Web Browser Automation";
		String actualResult = resultPage.getLinkTextByNumber(0);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void googleSignInWrongEmail() {
		//===TEST===
		GoogleSignInPage signInPage = homePage().clickOnSignInButton().inputEmail("selenium@selenium.org");
		//===CHECK===
		String expectedResult = "Couldn't find your Google Account";
		String actualResult = signInPage.getEmailStatus();
		assertEquals(actualResult, expectedResult);
	}
}
