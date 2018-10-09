package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {
	public static String getURL() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("testUrl");

		return url;

	}

	public static String getUsername() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("username");

		return url;

	}

	public static String getPassword() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("password");

		return url;

	}

	public static String getWelcomeHeader() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("welcomeheader");

		return url;

	}

	public static String getPassedText() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("passedText");

		return url;

	}

	public static String getFailedText() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("failedText");
		return url;

	}
	
	public static String getQuitDriverFail() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("quitDriverFail");
		return url;

	}
	
	public static String getQuitDriverPass() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("quitDriverPass");
		return url;

	}
	
	public static String getScreenShotPass() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("screenShotTaken");
		return url;

	}
	
	public static String getScreenShotFail() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//com//properties//config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		String url = pro.getProperty("screenShotFailed");
		return url;

	}
}
