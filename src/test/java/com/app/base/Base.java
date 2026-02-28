package com.app.base;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//edit the file

//changes
public class Base {

	public static WebDriver driver = null;



	public static void launchBrowser() {

		driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));

	}
//	public static void launchBrowser(String browserName) {
//		if (browserName.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
//		} else if (browserName.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//		} else {
//			throw new IllegalArgumentException("Invalid browser: " + browserName);
//		}
//	}

	// **** 2. Open URL ****
	public static void openUrl(String url) {
		driver.get(url);

	}

	// **** 3. Get Page Title ****
	public static String getPageTitle() {
		return driver.getTitle();
	}

	// **** 4. Find Element ****
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	// **** 5. Find Elements ****
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// **** 6. Click ****
	public static void click(WebElement locator) {
		locator.click();
	}

	// **** 7. Send Keys ****
	public static void type(WebElement locator, String text) {

		locator.clear();
		locator.sendKeys(text);
	}

	// **** 8. Get Text ****
	public static String getText(By locator) {
		return getElement(locator).getText();
	}

	// **** 9. Get Text ****
	public static String getText1(By locator) {
		return getElement(locator).getText();
	}

	
}
