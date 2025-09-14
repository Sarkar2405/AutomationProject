package internetHerokuSite.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.WaitUtils;

public class DynamicControlsPage {
	
	WebDriver driver;
	
	
	public DynamicControlsPage(WebDriver driver) {
		this.driver= driver;
	}
	By checkbox_ele= By.xpath("//input[@type='checkbox']");
	By remove_btn_ele= By.xpath("//button[@onclick='swapCheckbox()']");
	By loading_ele= By.id("loading");
	By msg_ele= By.xpath("//p[@id='message']");
	
	public String removeCheckBox() {
	
		WaitUtils wait = new WaitUtils(driver);
		driver.findElement(checkbox_ele).click();
		driver.findElement(remove_btn_ele).click();

		wait.waitForElementInvisibility(driver.findElement(loading_ele));
		String checkboxMsg_remove = driver.findElement(msg_ele).getText();
		return checkboxMsg_remove;

}


}
