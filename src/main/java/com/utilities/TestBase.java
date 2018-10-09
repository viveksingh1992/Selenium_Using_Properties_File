package com.utilities;

import java.io.File;
import java.lang.reflect.Method;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp(Method method) throws Exception {

		WebDriverUtils.setTestName(method.getName());
		driver = WebDriverUtils.openBrowser();
	}

	@AfterMethod(alwaysRun = true)
	public static void tearDown(ITestResult result) throws Exception {
		try {
			if (result.getStatus() == ITestResult.FAILURE) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File srcFile = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile,
						new File("C:\\Users\\vsingh\\eclipse-workspace\\Selenium\\defectScreenShots\\"
								+ result.getName() + ".jpeg"));
				Log.info(Environment.getScreenShotPass());
			}

			if (driver != null) {
				try {
					driver.quit();
					Log.info(Environment.getQuitDriverPass());
				} catch (Exception x) {
					Log.error(x);
					Log.info(Environment.getQuitDriverFail());
				}
			}
		} catch (Exception x) {
			Log.error(x);
			Log.info(Environment.getScreenShotFail());
		}
	}

}
