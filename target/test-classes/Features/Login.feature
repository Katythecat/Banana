Feature: Login Functionality
  Scenario: User enter valid username and password on login page
    Given open the browser and HRM application
    When enter valid username and password
    And click on login button
    Then user login successfully
    And close the browser
