Feature: Multiple Logins on Saucedemo

  Scenario Outline: Login with Different User Credentials
    Given the user is on the Saucedemo login page
    When the user enters "<username>" and "<password>"
    And the clicks on the Login button
    Then the user should be "<login_status>"

    Examples:
      | username      | password  | login_status   |
      | standard_user | secret_sauce | successful   |
      | problem_user  | secret_sauce | successful |
      | locked_out_user| secret_sauce | unsuccessful |
      | performance_glitch_user | secret_sauce | successful |