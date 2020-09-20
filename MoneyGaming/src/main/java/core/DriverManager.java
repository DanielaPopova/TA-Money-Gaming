package core;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected WebDriver webDriver;
	protected abstract void createDriver();
	
	public WebDriver getDriver() {
		if (webDriver == null) {
			createDriver();
		}
		
		return webDriver;
	}
	
	public void quitDriver() {
		if (webDriver != null) {
    		webDriver.quit();
		}
    }
	
	public void goTo(String url) {
		getDriver().get(url);
	}
}
