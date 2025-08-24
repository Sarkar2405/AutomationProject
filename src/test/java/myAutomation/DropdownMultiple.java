package myAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownMultiple {
		@Test
		public void getDropdownM() {
			
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("file:///C:/Users/joyde/Desktop/dropdown.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement dd= driver.findElement(By.xpath("//select[@id='cars']"));
			
			Select s= new Select(dd);
			s.selectByContainsVisibleText("l");
			s.selectByVisibleText("Audi");
			s.deselectAll();
			s.selectByIndex(2);
			s.selectByValue("saab");
			s.deSelectByContainsVisibleText("p");
			s.deselectByIndex(1);
			
			
		}

}
