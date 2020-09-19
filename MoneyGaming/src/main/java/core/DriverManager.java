package core;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected WebDriver webDriver;
	protected abstract void createDriver();
	
	public void quitDriver() {
		if (webDriver != null) {
    		webDriver.quit();
		}
    }
	
	public WebDriver getDriver() {
		if (webDriver == null) {
			createDriver();
		}
		
		return webDriver;
	}
}
