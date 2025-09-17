package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageActions {

	WaitUtils waitUtils;
	Actions act;

	public PageActions(WebDriver driver) {
		waitUtils = new WaitUtils(driver);
		act = new Actions(driver);
	}

	public void click(By locator) {
		try {
			waitUtils.waitForElementClickable(locator).click();
		} catch (Exception e) {
			ReportUtils.getLog().fail("Failed to click due to " + e.getMessage());
		}
	}

	public void rightClick(By locator, WebElement element) {
		try {
			waitUtils.waitForElementVisibility(locator);
			act.contextClick(element).build().perform();
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
