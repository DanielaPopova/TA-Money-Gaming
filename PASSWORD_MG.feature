Feature: Register new user in moneygaming.com
  
Scenario Outline: Password verification
  Given I am on the Sign Up page
    And I populate all fileds with valid values
    But I enter <invalid-value> for the password field  
   When I click on Join Now! button
   Then An inline error message <error-message> should be displayed
    
  Examples: 
    | invalid-value | error-message                                          | 
<<<<<<< HEAD
    |      	    | Password cannot be empty                               |
    | a      	    | Password should be at least 6 characters long          |    
=======
    |      	        | Password cannot be empty                               |
    | a      	      | Password is too short                                  |    
>>>>>>> d72d6aea83b15793854d4c4e61a0af163decda95
    | aaaaaa*       | Password should contain at least one number            |
    | aaaaaa1       | Password should contain at least one special character |
