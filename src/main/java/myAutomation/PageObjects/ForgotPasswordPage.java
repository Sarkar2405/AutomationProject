package myAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgotPasswordPage {
	
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver){
		this.driver= driver;
	}
	
	By forgot_password_ele= By.linkText("Forgot Password");
	By forgot_password_heading_text_ele= By.xpath("//div/h2");
	By emailId_ele= By.id("email");
	By retrieve_password_button_ele= By.xpath("//form/button/i");
	
	public void goToForgotPassword() {
		
		driver.findElement(forgot_password_ele).click();
	}
	
	public void checkForgotPasswordHeading() {
		String forgot_password_heading_text= driver.findElement(forgot_password_heading_text_ele).getText();
		Assert.assertEquals(forgot_password_heading_text, "Forgot Password");
	}
	
	public void enterEmail(String email) {
		driver.findElement(emailId_ele).sendKeys(email);
	}
	
	public void retrievePassword() {
		driver.findElement(retrieve_password_button_ele).click();
	}

}
