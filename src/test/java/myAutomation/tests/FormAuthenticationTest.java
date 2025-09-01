package myAutomation.tests;

import org.testng.annotations.Test;
import myAutomation.PageObjects.FormAuthenticationPage;

public class FormAuthenticationTest extends CommonTests {
	
	@Test
	public void testLogin() {
	
		/*
		 * CommonTests comTestObj= new CommonTests(); 
		 * comTestObj.initializeApp();
		 */	
		FormAuthenticationPage formAuthObj= new FormAuthenticationPage(driver);
		formAuthObj.goToFormAuth();
		formAuthObj.enterUsername("tomsmith");
		formAuthObj.enterPassword("SuperSecretPassword!");
		formAuthObj.login();
		
	}
	
	@Test
	public void testLoginFail() {
		
		/*
		 * CommonTests comTestObj= new CommonTests(); 
		 * comTestObj.initializeApp();
		 */	
		FormAuthenticationPage formAuthObj= new FormAuthenticationPage(driver);
		formAuthObj.goToFormAuth();
		formAuthObj.enterUsername("tomsmith");
		formAuthObj.enterPassword("Password!");
		formAuthObj.login();
		formAuthObj.checkFlashMsg();
		
		
	}

}
