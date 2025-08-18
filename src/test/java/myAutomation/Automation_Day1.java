package myAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Automation_Day1 {
	
	public static void get() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();
		WebElement usernameinputfield= driver.findElement(By.xpath("//input[@id='username']"));
		usernameinputfield.sendKeys("tomsmith");
		WebElement passwordinputfield= driver.findElement(By.id("password"));
		passwordinputfield.sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String welcomeMessage= driver.findElement(By.xpath("//h4[@class='subheader']")).getText();
		
		String output= welcomeMessage.equals("Welcome to the Secure Area. When you are done click logout below.")?"Welcome message is Ok":"Fail";
		System.out.println(output);
				
	}
	
	

}
