package myAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls {

	@Test
	public void getDynamicControls() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();

		String checkboxMsg_remove = driver.findElement(By.id("message")).getText();
		if (checkboxMsg_remove.equalsIgnoreCase("It's gone!")) {
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);

		driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
		String enableMsg = driver.findElement(By.xpath("//p[@id='message']")).getText();

		if (enableMsg.equalsIgnoreCase("It's enabled!")) {
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);
	}

}


