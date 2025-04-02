Feature: Register Functionality

  Scenario: User registers with valid credentials
    Given User is on register page
    When User enters valid details
    And User clicks on register button
    Then User should be redirected to loginpage
