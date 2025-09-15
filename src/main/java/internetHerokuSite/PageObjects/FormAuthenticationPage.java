package internetHerokuSite.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.WaitUtils;

public class FormAuthenticationPage {
	
	//WebDriver driver;
	WaitUtils waitutils;
	
	public FormAuthenticationPage(WebDriver driver, WaitUtils waitutils) {
		//this.driver= driver;
		this.waitutils= waitutils;
	}
	

	private By username_ele= By.id("username");
	private By password_ele= By.id("password");
	private By login_ele= By.className("fa-sign-in");
	private By incorrectPwText_ele= By.id("flash");
	
	
	public void enterUsername(String username) {
		waitutils.waitForElementVisibility(username_ele).sendKeys(username);
	}	
	public void enterPassword(String password) {
		waitutils.waitForElementVisibility(password_ele).sendKeys(password);
	}
	public void login() {
		waitutils.waitForElementClickable(login_ele).click();
	}
	public String checkFlashMsg() {
		return waitutils.waitForElementVisibility(incorrectPwText_ele).getText();
		
	}

}
