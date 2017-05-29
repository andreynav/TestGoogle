package com.google.test;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.google.pages.GoogleHomePage;
import static com.google.test.SeleniumDriver.getDriver;

public class BaseTest {
	
	@BeforeTest
	public void setUp() {
			setPropertyWindow();
			setPropertyTimeOut();
	}
	
	@AfterTest
	public void tearDown() {
		delay(3000);
		if (getDriver() != null) {
			getDriver().close();
		}
	}
	
	public void setPropertyWindow() {
		getDriver().manage().window().maximize();
	}

	public void setPropertyTimeOut() {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void delay (long millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public GoogleHomePage homePage() {
		return new GoogleHomePage(getDriver());
	}
}
