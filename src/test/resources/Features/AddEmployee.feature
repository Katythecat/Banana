Feature: Add Employee
  Scenario: after log in HRM we will add employee
    Given open the browser and HRM application
    When enter valid username and password
    And click on login button
    When user click on PIM option
    And user click on Add employee button
    And user enter username and middlename,and password
    And user click on save button
    And close the browser
