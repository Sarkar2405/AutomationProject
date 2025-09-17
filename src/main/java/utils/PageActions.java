package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageActions {

	WaitUtils waitUtils;
	
	public PageActions(WebDriver driver) {
		this.waitUtils= new WaitUtils(driver);
	}

	public void click(By locator) {

		try {
			waitUtils.waitForElementClickable(locator).click();
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to click due to " + e.getMessage());
		}
	}
	
	public void enter(By locator, String text) {

		try {
			waitUtils.waitForElementVisibility(locator).sendKeys(text);
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to enter due to " + e.getMessage());
		}
	}
	
	public String getText(By locator) {
		try {
			return waitUtils.waitForElementVisibility(locator).getText();
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to enter due to " + e.getMessage());
			throw e;
		}
	
	}
	
	public Alert goToAlert() {
		
		try {
			return waitUtils.waitForAlert();
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to check alert due to " + e.getMessage());
			throw e;
		}
		
	}

}
