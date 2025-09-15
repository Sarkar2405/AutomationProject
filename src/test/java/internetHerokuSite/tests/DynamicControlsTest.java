package internetHerokuSite.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import internetHerokuSite.PageObjects.DynamicControlsPage;
import internetHerokuSite.PageObjects.WelcomPage;

public class DynamicControlsTest extends CommonTests{

	@Test
	public void testRemoveCheckBox() {
		
		WelcomPage welcome= new WelcomPage(driver,waitutils);
		welcome.clickOn("Dynamic Controls");
		
		DynamicControlsPage dynamic= new DynamicControlsPage(driver, waitutils);
		String text= dynamic.removeCheckBox();
		Assert.assertEquals(text, "It's gone!");		
	}

		
}



