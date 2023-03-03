Feature: Logout from the application
  As a user
  I want to logout from the application
  So that I can logout from the application

  Scenario: Logout from the application
    Given I am on the login page
    When I login with valid credentials
    Then I should be on the home page
    When I click on the logout button
    Then I should be on the login page

