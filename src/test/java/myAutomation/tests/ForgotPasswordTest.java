package myAutomation.tests;

import org.testng.annotations.Test;

import myAutomation.PageObjects.ForgotPasswordFinalPage;
import myAutomation.PageObjects.ForgotPasswordPage;

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
