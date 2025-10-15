package internetHerokuSite.tests;

import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.ForgotPasswordFinalPage;
import internetHerokuSite.PageObjects.ForgotPasswordPage;

public class ForgotPasswordTest extends CommonTests {

	@Test
	public void testForgotPassword() {
		
		ForgotPasswordPage forgotpassword= new ForgotPasswordPage(driver);
		forgotpassword.goToForgotPassword();
		forgotpassword.checkForgotPasswordHeading();
		forgotpassword.enterEmail();
		forgotpassword.retrievePassword();
		
		ForgotPasswordFinalPage forgotpasswordfinal= new ForgotPasswordFinalPage(driver);
		forgotpasswordfinal.verifyForgotPasswordFinalPageText();
	}
	
	
}
