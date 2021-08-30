Feature: Test login functionality

  Scenario Outline: check login is sucessfull with valid credentials are not
    Given google browser is open
    And and go to the given url
    When user entered the <username> and <password>
    And user clicked on the login page 
    Then user is navigated to the homepage of that link

    	Examples:
    	|username||password|
    	|maha||1234|
    	|sana||4567|
    	|Ragav||12345|