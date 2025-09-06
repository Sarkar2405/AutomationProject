package myAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgotPasswordFinalPage {
	
	WebDriver driver;
	
	public ForgotPasswordFinalPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void verifyForgotPasswordFinalPageText() {
		String heading1= driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(heading1, "Internal Server Error");
		
	}

}
