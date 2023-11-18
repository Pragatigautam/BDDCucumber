Feature: Dashboard Functionality

  Scenario: Valid Login with Correct Credentials
    Given the user is on the dashboard page
    When the user enters valid Dusername and Dpassword
    And clicks on the DLogin button
    Then the user should be navigated to the dashboard