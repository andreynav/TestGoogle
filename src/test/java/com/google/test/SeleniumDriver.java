package com.google.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumDriver {
	private volatile static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			synchronized (SeleniumDriver.class) {
				if (driver == null) {
					DesiredCapabilities capabilitiesFirefox = new DesiredCapabilities();
					capabilitiesFirefox.setCapability("marionette", true);
					System.setProperty("webdriver.gecko.driver", "e:\\Autotests\\TestGoogle\\src\\test\\resources\\Geckodriver 0.16.1\\geckodriver.exe");
					driver = new FirefoxDriver(capabilitiesFirefox);
				}
			}
		}
		return driver;
	}
}
