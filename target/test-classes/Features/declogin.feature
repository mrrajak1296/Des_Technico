Feature: Login Functionality

  Scenario: User logs in with valid credentials
    Given User is on login page
    When User enter email and password
    And User click on login button
    When User click on Create notebook
    And User enter the booktitle
    Then User submit the notebook
    And user click on profile
    When user enter the Todo 
    And write the todo 
    And set the priority
