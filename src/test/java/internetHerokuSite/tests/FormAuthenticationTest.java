
package internetHerokuSite.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.FormAuthenticationPage;
import internetHerokuSite.PageObjects.WelcomPage;

public class FormAuthenticationTest extends CommonTests {

	@Test
	public void testLoginSuccess() throws InterruptedException {
	
		WelcomPage welcome = new WelcomPage(driver, waitutils);
		welcome.clickOn("Form Authentication");
		FormAuthenticationPage formAuthObj = new FormAuthenticationPage(driver, waitutils);
		formAuthObj.enterUsername("tomsmith");
		formAuthObj.enterPassword("SuperSecretPassword!");
		formAuthObj.login();

	}

	@Test
	public void testLoginFail() throws IOException {
		WelcomPage welcome = new WelcomPage(driver,waitutils);
		welcome.clickOn("Form Authentication");
		FormAuthenticationPage formAuthObj = new FormAuthenticationPage(driver,waitutils);
		formAuthObj.enterUsername("tomsmith");
		formAuthObj.enterPassword("Password!");
		formAuthObj.login();
		String incorrectPwText= formAuthObj.checkFlashMsg();
		Assert.assertTrue(incorrectPwText.contains("Your password is incorrect!"),"Test Fails:Message is incorrect");

	}

}
