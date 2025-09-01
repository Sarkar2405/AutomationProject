package myAutomation.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class CommonTests {

	WebDriver driver;
	

	@BeforeMethod
	public void initializeApp() {
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
	}
}
