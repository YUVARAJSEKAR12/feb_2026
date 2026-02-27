package com.app.li;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.app.base.Base;

public class TestThree extends Base{
	
	public static void main(String[] args) {
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//	    driver.manage().deleteCookieNamed("session_id");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start maxmimized");
//		options.addArguments("--incognito");
//		options.addArguments("--headless");
//	    DesiredCapabilities caps = new DesiredCapabilities();
//	    caps.setBrowserName("chrome");
//	    caps.setPlatform(Platform.WINDOWS);
//	    caps.setVersion("latest");
//	    caps.setCapability(ChromeOptions.CAPABILITY,options);
//	    try {
//			driver = new RemoteWebDriver(new URL(""), caps);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 700));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(20000));
		driver.switchTo().alert();
		
		
	}

}
