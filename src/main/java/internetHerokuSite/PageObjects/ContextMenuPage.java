package internetHerokuSite.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContextMenuPage extends CommonPage {

	WebDriver driver;

	public ContextMenuPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By box_ele = By.id("hot-spot");

	public void clickBox() {
		action.rightClick(box_ele, driver.findElement(box_ele));
	}
	public void acceptAlert() {
		action.goToAlert().accept();
	}

}
