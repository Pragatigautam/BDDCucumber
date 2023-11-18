Feature: Login Functionality

  Scenario: Valid Login with Correct Credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks on the Login button
    Then the user should be redirected to the dashboard