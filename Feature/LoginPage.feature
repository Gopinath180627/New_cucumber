Feature: Login Functionality for an application

  Scenario: Valid login with correct credentials
    Given user is on login page
    When the enters the valid user_name and password
    Then User should be in the home page
