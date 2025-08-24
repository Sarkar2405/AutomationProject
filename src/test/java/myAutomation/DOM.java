package myAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DOM {
	@Test
	public void getDOM() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		List<WebElement> listDOM = driver.findElements(By.partialLinkText("DOM"));
		//System.out.println(listDOM.size());
		for (int i = 0; i < listDOM.size(); i++) {
			String textDOM = listDOM.get(i).getText();
			System.out.println(textDOM);
		}

	}
}
