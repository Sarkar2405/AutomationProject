package internetHerokuSite.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class JavaScriptAlerts {
	
	WebDriver driver;
	
	By js_alert_btn_ele= By.xpath("//button[@onclick='jsAlert()']");
	
	public JavaScriptAlerts(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void checkJsAlert() {
		driver.findElement(js_alert_btn_ele).click();
		WaitUtils wait= new WaitUtils(driver);
		wait.waitForAlertaccept();
	}

}
