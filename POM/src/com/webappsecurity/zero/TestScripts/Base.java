package com.webappsecurity.zero.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base{
	
	WebDriver driver;
	@BeforeClass
	public void openApplication() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	ChromeOptions capability = new ChromeOptions();
	capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
    driver = new ChromeDriver(capability);
	driver.get("http://zero.webappsecurity.com/login.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}	
	@AfterClass
	public void closeApplication() {
		driver.close();
	}
}
