package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import core.DriverManagerFactory;
import core.DriverType;
import core.DriverManager;
import core.Url;

public class BaseTest {
	protected WebDriver webDriver;
	private DriverManager driverManager;
	 
    @BeforeTest
    public void setup() {
    	driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
    	webDriver = driverManager.getDriver();
    	webDriver.get(Url.MONEY_GAMING.getUrl());
    }
    
    @AfterTest
    public void tearDown() {
    	driverManager.quitDriver();
    }
}
