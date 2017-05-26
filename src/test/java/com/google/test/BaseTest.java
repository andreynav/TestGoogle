package com.google.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected WebDriver driver;

	protected WebDriver getDriver() {
		return driver;
	}
	
	@BeforeTest
	public void setUp() {
		initializeDriver();
		setPropertyWindow();
		setPropertyTimeOut();
	}
	
	@AfterTest
	public void tearDown() {
		delay(3000);
		driver.close();
	}
	
	public void initializeDriver() {
		DesiredCapabilities capabilitiesFirefox = new DesiredCapabilities();
		capabilitiesFirefox.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver", "e:\\Autotests\\TestGoogle\\src\\test\\resources\\Geckodriver 0.16.1\\geckodriver.exe");
		driver = new FirefoxDriver(capabilitiesFirefox);
	}
	
	public void setPropertyWindow() {
		driver.manage().window().maximize();
	}

	public void setPropertyTimeOut() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void delay (long millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
