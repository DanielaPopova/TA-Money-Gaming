package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	@FindBy(xpath = "//div[@class='login_links']/a[text()='Join Now!']")
	private WebElement joinNowButton;

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public SignUpPage navigateToSignUpPage() {
		click(joinNowButton);
		
		return new SignUpPage(webDriver);
	}

}
