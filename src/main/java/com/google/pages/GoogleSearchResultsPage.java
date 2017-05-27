package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class GoogleSearchResultsPage extends BasePage {

	@FindBy (how = How.XPATH, using = "//div[@class='srg']//h3/a")
	private List<WebElement> listResults;
	
	public GoogleSearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getLinkTextByNumber(int index) {
		return assertThat(visibilityOf(listResults.get(index))).getText();
	}
}
