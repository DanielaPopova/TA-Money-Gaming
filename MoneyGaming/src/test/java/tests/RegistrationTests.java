package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataObjects.Account;
import dataObjects.Address;
import dataObjects.Currency;
import dataObjects.User;
import pages.HomePage;
import utilities.CsvHandler;

public class RegistrationTests extends BaseTest{

	private static final String USER_DATA_FILE_PATH = "user-data.csv";
	private static final String ADDRESS_DATA_FILE_PATH = "address-data.csv";
	private static final String ACCOUNT_DATA_FILE_PATH = "account-data.csv";
	
	/**
	 * Test for verifying error message when new user completes the registration form
	 * without selecting the Terms and Condition check box
	 * @throws Exception
	 */
	@Test
	public void signUpWithUncheckedTermsAndConditions() throws Exception {
		var user = CsvHandler.parseToObjectList(USER_DATA_FILE_PATH, User.class).get(0);
		var address = CsvHandler.parseToObjectList(ADDRESS_DATA_FILE_PATH, Address.class).get(0);
		var account = CsvHandler.parseToObjectList(ACCOUNT_DATA_FILE_PATH, Account.class).get(0);
		
		var homePage = new HomePage(webDriver);
		
		var signUpPage = homePage.navigateToSignUpPage();
		
		signUpPage.populateUserData(user);
		signUpPage.populateAddressData(address);
		signUpPage.populateAccountData(account);
		signUpPage.selectCurrency(Currency.GBP.name());
		signUpPage.clickJoinNow();
		
		String expectedErrorMessage = "This field is required";
		Assert.assertEquals(expectedErrorMessage, signUpPage.getTermsAndConditionErrorMessage());
	}
}
