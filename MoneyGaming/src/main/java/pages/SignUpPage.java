package pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dataObjects.Account;
import dataObjects.Address;
import dataObjects.User;
import utilities.DateHandler;

public class SignUpPage extends BasePage{

	@FindBy(name = "map(title)")
	private WebElement title;
	
	@FindBy(id = "forename")
	private WebElement firstName;
	
	@FindBy(name = "map(lastName)")
	private WebElement surname;
	
	@FindBy(name = "map(dobDay)")
	private WebElement birthDay;
	
	@FindBy(name = "map(dobMonth)")
	private WebElement birthMonth;
	
	@FindBy(name = "map(dobYear)")
	private WebElement birthYear;
	
	@FindBy(name = "map(email)")
	private WebElement emailAddress;
	
	@FindBy(name = "map(phone)")
	private WebElement telephone;
	
	@FindBy(name = "map(mobile)")
	private WebElement mobile;
	
	@FindBy(name = "map(address1)")
	private WebElement addressLine1;
	
	@FindBy(name = "map(addressCity)")
	private WebElement city;
	
	@FindBy(name = "map(stateProv)")
	private WebElement country;
	
	@FindBy(name = "map(postCode)")
	private WebElement postcode;
	
	@FindBy(name = "map(countryCode)")
	private WebElement countryCode;
	
	@FindBy(name = "map(userName)")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "map(passwordConfirm)")
	private WebElement retypePassword;
	
	@FindBy(name = "map(securityQuestionOne)")
	private WebElement securityQuestion1;
	
	@FindBy(name = "map(securityAnswerOne)")
	private WebElement answer1;
	
	@FindBy(name = "map(securityQuestionTwo)")
	private WebElement securityQuestion2;
	
	@FindBy(name = "map(securityAnswerTwo)")
	private WebElement answer2;
	
	@FindBy(name = "map(currency)")
	private WebElement currency;
	
	@FindBy(name = "map(terms)")
	private WebElement termsAndConditions;
	
	@FindBy(id = "form")
	private WebElement joinNowButton;
	
	public SignUpPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public void populateUserData(User user) {
		populateField(title, user.getTitle());
		populateField(firstName, user.getFirstName());
		populateField(surname, user.getSurname());
		selectFromDropdownByText(birthDay, DateHandler.getDay(user.getDateOfBirth()));
		selectFromDropdownByText(birthMonth, StringUtils.capitalize(DateHandler.getMonth(user.getDateOfBirth())));
		selectFromDropdownByValue(birthYear, DateHandler.getYear(user.getDateOfBirth()));
		populateField(emailAddress, user.getEmailAddress());
		populateField(telephone, user.getTelephone());
		populateField(mobile, user.getMobile());
	}
	
	public void populateAddressData(Address address) {
		populateField(addressLine1, address.getAddress());
		populateField(city, address.getCity());
		populateField(country, address.getCountryCode());
		populateField(postcode, String.valueOf(address.getPostcode()));
		selectFromDropdownByValue(countryCode, address.getCountry());
	}
	
	public void populateAccountData(Account account) {
		populateField(username, account.getUsername());
		populateField(password, account.getPassword());
		populateField(retypePassword, account.getPassword());
		selectFromDropdownByValue(securityQuestion1, account.getSecurityQuestion1());
		populateField(answer1, account.getAnswer1());
		selectFromDropdownByValue(securityQuestion2, account.getSecurityQuestion2());
		populateField(answer2, account.getAnswer2());
	}
	
	public void selectCurrency(String value) {
		selectFromDropdownByValue(currency, value);
	}
	
	public void clickJoinNow() {
		click(joinNowButton);
	}
	
	public String getTermsAndConditionErrorMessage() {
		var label = webDriver.findElement(By.xpath("//fieldset/label[@for='map(terms)']"));
		return label.getText();
	}
}
