Feature: Login Testcases

  Scenario: Login with correct credenatials
    Given Enter the url "https://debugautomation.com/"
    When Enter UserName "testuser" and Password "testpassword"
    When click on submit button
    Then Verify user land on homepage
