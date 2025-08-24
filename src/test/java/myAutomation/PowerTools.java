package myAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerTools {
	
	
	@Test
	public void getPowerTools() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://with-bugs.practicesoftwaretesting.com/#/category/power-tools");
		driver.findElement(By.xpath("//li[@class='nav-item dropdown']")).click();
		driver.findElement(By.xpath("//a[@data-test='nav-power-tools']")).click();
		
		WebElement sortList= driver.findElement(By.className("form-select"));
		Select s= new Select(sortList);
		//s.selectByValue("price,asc");
		s.selectByVisibleText("Price (High - Low)");
		//String tooltext= driver.findElement(By.xpath("//div/a[5]/div[2]/h5")).getText();
		String tooltext= driver.findElement(By.xpath("//a[@data-test='product-21']/div[2]/h5")).getText();
		//System.out.println(tooltext);
		Assert.assertEquals(tooltext, "Circular Saw");
		//Assert.assertEquals(tooltext, "Belt Sanders");
		
	}

}
