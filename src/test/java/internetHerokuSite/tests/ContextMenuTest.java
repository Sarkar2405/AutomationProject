package internetHerokuSite.tests;

import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.ContextMenuPage;
import internetHerokuSite.PageObjects.WelcomePage;

public class ContextMenuTest extends CommonTests {

	@Test
	public void checkContextMenu() {

		WelcomePage welcome = new WelcomePage(driver);
		welcome.clickOn("Context Menu");
		

		ContextMenuPage context = new ContextMenuPage(driver);
		context.clickBox();
		context.acceptAlert();

	}

}
