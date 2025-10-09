package internetHerokuSite.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormAuthenticationPage extends CommonPage{
	
	public FormAuthenticationPage(WebDriver driver) {
		super(driver);	
	}

	private By username_ele= By.id("username");
	private By password_ele= By.id("password");
	private By login_ele= By.className("fa-sign-in");
	private By incorrectPwText_ele= By.id("flash");
	
	public void enterUsername(String username) {
		action.enter(username_ele, username);
	}	
	public void enterPassword(String password) {
		action.enter(password_ele, password);
	}
	public void login() {
		action.click(login_ele);
	}
	public String checkFlashMsg() {
		return action.getText(incorrectPwText_ele);
		
	}

}
