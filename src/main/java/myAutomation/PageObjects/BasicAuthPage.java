package myAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasicAuthPage {

	WebDriver driver;
	
	By basic_auth_ele= By.linkText("Basic Auth");
	By not_authorized_text_ele= By.xpath("/html/body");
	
	public void goToBasicAuth() {
		driver.findElement(basic_auth_ele).click();		
	}
	
	public void signIn() {
		driver.switchTo().alert().dismiss();
		String not_authorized_text= driver.findElement(not_authorized_text_ele).getText();
		Assert.assertEquals(not_authorized_text, "Not authorized");
		
	}
	

}
