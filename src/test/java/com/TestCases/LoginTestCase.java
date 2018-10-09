package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Actions.LoginActions;
import com.PageObjects.LoginPageObjects;
import com.utilities.*;
import org.apache.log4j.xml.DOMConfigurator;

public class LoginTestCase extends TestBase {

	@Test
	public static void LoginTest() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		try {
			Log.startTestCase("LoginTest");
			LoginActions.LoginAction();
			Assert.assertEquals(WebDriverUtils.TextChecker(LoginPageObjects.WelcomeText()),
					Environment.getWelcomeHeader());
			Log.info(Environment.getPassedText());
			Log.endTestCase("LoginTest");
		} catch (Exception e) {
			Log.error(e);
			Log.info(Environment.getFailedText());
			Log.endTestCase("LoginTest");
			Assert.fail(e.getMessage());
		}
	}
}