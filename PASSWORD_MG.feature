Feature: Register new user in moneygaming.com
  
Scenario Outline: Password verification
  Given I am on the Sign Up page
    And I populate all fileds with valid values
    But I enter <invalid-value> for the password field  
   When I click on Join Now! button
   Then An inline error message <error-message> should be displayed
    
  Examples: 
    | invalid-value | error-message                                          | 
    |      	    | This field is required                                 |
    | a      	    | The minimum length is 6 characters                     |     
    | aaaaaa*       | Password should contain at least one number            |
    | aaaaaa1       | Password should contain at least one special character |
