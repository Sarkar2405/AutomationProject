package internetHerokuSite.PageObjects;
import org.openqa.selenium.WebDriver;

import utils.PageActions;

public class CommonPage {

	WebDriver driver;
	PageActions action;

	public CommonPage(WebDriver driver) {
		this.driver = driver;
		action= new PageActions(driver);
	}
	
	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}	
	public String getTitle() {
		return driver.getTitle();
	}
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}
	public void goBack() {
		driver.navigate().back();
	}
	public void goForward() {
		driver.navigate().forward();
	}

}
