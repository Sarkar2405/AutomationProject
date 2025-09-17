
package internetHerokuSite.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.FormAuthenticationPage;
import internetHerokuSite.PageObjects.WelcomePage;
import utils.ReportUtils;

public class FormAuthenticationTest extends CommonTests {
	
	String linkname= "Form Authentication";
	String username= "tomsmith";
	String correct_password= "SuperSecretPassword!";
	String incorrect_password= "abc";

	@Test
	public void testLoginSuccess() throws InterruptedException {
		
		WelcomePage welcome = new WelcomePage(driver);
		welcome.clickOn(linkname);
		ReportUtils.log.info("Clicked on " + linkname + " successfully");
		FormAuthenticationPage formAuthObj = new FormAuthenticationPage(driver); 
		formAuthObj.enterUsername(username);
		ReportUtils.log.info("Username entered successfully: " + username);
		formAuthObj.enterPassword(correct_password);
		ReportUtils.log.info("Password entered successfully: " + correct_password);
		formAuthObj.login();
		ReportUtils.log.info("Clicked on login button successfully");
	}

	@Test
	public void testLoginFail() throws IOException {
		WelcomePage welcome = new WelcomePage(driver);
		welcome.clickOn(linkname);
		ReportUtils.log.info("Clicked on " + linkname + " successfully");
		FormAuthenticationPage formAuthObj = new FormAuthenticationPage(driver); 
		formAuthObj.enterUsername(username);
		ReportUtils.log.info("Username entered successfully: " + username);
		formAuthObj.enterPassword(incorrect_password);
		ReportUtils.log.info("Password entered successfully: " + incorrect_password);
		formAuthObj.login();
		ReportUtils.log.info("Clicked on login button successfully");
		String incorrectPwText= formAuthObj.checkFlashMsg();
		Assert.assertTrue(incorrectPwText.contains("Your password is incorrect!"),"Test Fails:Message is incorrect");

	}

}
