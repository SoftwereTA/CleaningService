Feature: Login Feature

  As a user of the application I want to be able to login to the application so that I can access my account.

#  Background:
#  Given: I have a valid username and password
#  And: I am on the login page
#  | username | password |
#  | Zen    | password |
#  | Tariq    | password |
#

    Scenario: Login with valid credentials
    When I login and the credentials are valid
    Then I should be logged in to the application

    Scenario: Login with invalid credentials
    When I login  and the credentials are invalid
      Then I should not be logged in to the application, I should see an error message

  Scenario: Login with blank credentials
    When I login with blank credentials
    Then I should not be logged in to the application, I should see an error message