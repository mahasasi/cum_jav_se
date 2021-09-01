Feature: Test login functionality for testproject

  Scenario Outline: check login is sucessfull with valid credentials are not for testproject
    Given google chrome browser is open
    And and go to the given url of the site
    When user entered their <username> and <password>
    And user clicked on the login page of the site
    Then user is navigated to the homepage of the link given

    	Examples:
    	|username||password|
    	|maha||1233|
    	|sana||4566|
    	|Ragav||12345|