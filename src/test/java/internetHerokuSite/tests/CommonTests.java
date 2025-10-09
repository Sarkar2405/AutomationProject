package internetHerokuSite.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;

import utils.BaseUtils;
import utils.ReportUtils;
import utils.WaitUtils;

public class CommonTests {

	WebDriver driver;

	@BeforeSuite
	public void init() throws IOException {
		ReportUtils.initReport();
	}

	@BeforeMethod
	public void initializeApp(Method testmethod) throws IOException {

		ReportUtils.createTest(testmethod.getName());

		String browser = BaseUtils.getConfigValue("browser").toLowerCase();
		switch (browser) {
		case "edge":
			driver = new EdgeDriver();
			ReportUtils.log.info(browser + " launched successfully");
			break;
		case "chrome":
			driver = new ChromeDriver();
			ReportUtils.log.info(browser + " launched successfully");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			ReportUtils.log.info(browser + " launched successfully");
			break;
		default:
			ReportUtils.log.info("Browser is not launched");
			break;
		}
		driver.get(BaseUtils.getConfigValue("url"));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait
		//(Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("implicitwait"))));		
	}
	
	@AfterMethod
	public void endTest(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			ReportUtils.getLog().fail(result.getThrowable(),
					MediaEntityBuilder.createScreenCaptureFromPath(
							BaseUtils.getScreenshotPath(driver, result.getInstanceName().getClass().getSimpleName()
									+ "." + result.getMethod().getMethodName()))
							.build());
		}
		if (result.getStatus() == ITestResult.SUCCESS) {
			ReportUtils.getLog().pass(result.getThrowable(),
					MediaEntityBuilder.createScreenCaptureFromPath(
							BaseUtils.getScreenshotPath(driver, result.getInstanceName().getClass().getSimpleName()
									+ "." + result.getMethod().getMethodName()))
							.build());
		}
	}

	@AfterSuite
	public void generateReport() {
		ReportUtils.generateReport();
	}

}
