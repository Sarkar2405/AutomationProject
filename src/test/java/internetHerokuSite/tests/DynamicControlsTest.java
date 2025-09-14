package internetHerokuSite.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.DynamicControlsPage;
import internetHerokuSite.PageObjects.WelcomPage;

public class DynamicControlsTest extends CommonTests{

	@Test
	public void testRemoveCheckBox() {
		
		WelcomPage welcome= new WelcomPage(driver, wait);
		welcome.click("Dynamic Controls");
		
		DynamicControlsPage dynamic= new DynamicControlsPage(driver);
		String text= dynamic.removeCheckBox();
		Assert.assertEquals(text, "It is gone!");		
	}

		
}



