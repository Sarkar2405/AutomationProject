package internetHerokuSite.tests;

import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.JavaScriptAlerts;
import internetHerokuSite.PageObjects.WelcomPage;

public class JavaScriptAlertsTest extends CommonTests {
	
	@Test
	public void checkAlertJS() {
		WelcomPage welcome= new WelcomPage(driver, wait);
		welcome.click("JavaScript Alerts");
		
		JavaScriptAlerts alert= new JavaScriptAlerts(driver);
		alert.checkJsAlert();		
	}
	

}
