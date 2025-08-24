package myAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownSingle {

	@Test
	public void getDropdownS() {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ul[1]/li[11]/a[1]")).click();
		WebElement ddList= driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select s= new Select(ddList);
		
		s.selectByContainsVisibleText("on 2");
		//s.deselectByIndex(1);
		
	}
}
