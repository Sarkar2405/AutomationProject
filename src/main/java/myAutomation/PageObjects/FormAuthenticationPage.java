package myAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FormAuthenticationPage {
	
	WebDriver driver;
	
	public FormAuthenticationPage(WebDriver driver) {
		this.driver= driver;
	}
	
	private By formAuth_ele= By.linkText("Form Authentication");
	private By username_ele= By.id("username");
	private By password_ele= By.id("password");
	private By login_ele= By.className("fa-sign-in");
	private By incorrectPwText_ele= By.id("flash");
	
	
	public void goToFormAuth() {
		driver.findElement(formAuth_ele).click();
	}
	public void enterUsername(String username) {
		driver.findElement(username_ele).sendKeys(username);
	}	
	public void enterPassword(String password) {
		driver.findElement(password_ele).sendKeys(password);
	}
	public void login() {
		driver.findElement(login_ele).click();
	}
	
	public void checkFlashMsg() {
		String incorrectPwText=  (driver.findElement(incorrectPwText_ele).getText());
		Assert.assertTrue(incorrectPwText.contains("Your password is invalid!"),"Test Fails:Message is incorrect");
		
	}

}
