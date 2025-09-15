package internetHerokuSite.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class DynamicControlsPage {
	
	WebDriver driver;
	WaitUtils waitutils;
	
	public DynamicControlsPage(WebDriver driver, WaitUtils waitutils) {
		this.driver= driver;
		this.waitutils= waitutils;
	}
	By checkbox_ele= By.xpath("//input[@type='checkbox']");
	By remove_btn_ele= By.xpath("//button[@onclick='swapCheckbox()']");
	By loading_ele= By.id("loading");
	By msg_ele= By.xpath("//p[@id='message']");
	
	public String removeCheckBox() {

		waitutils.waitForElementClickable(checkbox_ele).click();
		waitutils.waitForElementClickable(remove_btn_ele).click();
		waitutils.waitForElementInvisibility(loading_ele);
		String checkboxMsg_remove = driver.findElement(msg_ele).getText();
		return checkboxMsg_remove;

}

}
