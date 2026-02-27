package com.app.stepdefinition;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.app.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base{
	
	@Before
	public void before() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start maxmimized");
		options.addArguments("--incognito");
		options.addArguments("--headless");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notification");
		//options.addArguments("--headless=new");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@After
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot js= (TakesScreenshot)driver;
			byte[] screenshotAs = js.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "Failedscreenshot");
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
			driver.quit();
		}
		
		
	}
	
	

}
