package com.Actions;

import com.PageObjects.LoginPageObjects;
import com.utilities.Environment;
import com.utilities.WebDriverUtils;

public class LoginActions {

	public static void LoginAction() throws Exception {

		WebDriverUtils.goToURL(Environment.getURL());
		WebDriverUtils.InputValues(LoginPageObjects.UsernameField(), Environment.getUsername());
		WebDriverUtils.ClickAction(LoginPageObjects.NextButtonEmail());
		WebDriverUtils.InputValues(LoginPageObjects.PasswordField(), Environment.getPassword());
		WebDriverUtils.ClickAction(LoginPageObjects.SignInButton());
		WebDriverUtils.ClickAction(LoginPageObjects.YesButton());
		WebDriverUtils.ClickAction(LoginPageObjects.DoneButton());
	}
}