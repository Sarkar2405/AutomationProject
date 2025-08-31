package myAutomation.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DynamicLoadingPage {
	
	WebDriver driver;
	
	By dynamic_loading_ele= (By.linkText("Dynamic Loading"));
	By dynamic_loading_heading_ele= By.xpath("//div/h3");
	By example1_ele= By.linkText("Example 1: Element on page that is hidden");
	By example1_text_ele= By.xpath("//div/h4");
	By btn_start_ele= By.xpath("//div[@id='start']/button");
	By final_text_ele= By.xpath("//div[@id='finish']/h4");
	
	By example2_ele= By.linkText("Example 2: Element rendered after the fact");
	
	public void getDynamicLoading() {
		driver.findElement(dynamic_loading_ele).click();
	}
	public void getDynamicLoadingHeading() {
		String dynamic_loading_heading_text= driver.findElement(dynamic_loading_heading_ele).getText();
		Assert.assertEquals(dynamic_loading_heading_text, "Dynamically Loaded Page Elements");
	}
	public void getExample1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(example1_ele).click();
		String example1_text= driver.findElement(example1_text_ele).getText();
		Assert.assertEquals(example1_text, "Example 1: Element on page that is hidden");
		driver.findElement(btn_start_ele).click();
		String final_text= driver.findElement(final_text_ele).getText();
		Assert.assertEquals(final_text, "Hello World");
		driver.navigate().back();	
	}
	
	public void getExample2() {
		driver.findElement(example2_ele).click();
	
	}

}
