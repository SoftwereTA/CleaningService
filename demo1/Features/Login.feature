Feature: Login Feature

  As a user of the application I want to be able to login to the application so that I can access my account.

#  Background:
#  Given: I have a valid username and password
#  And: I am on the login page
#  | username | password |
#  | Zen    | password |
#  | Tariq    | password |


  Scenario: Login with valid credentials
    When I enter my username and password
    And I Choose the login button It should check if the credentials are valid
    Then if invalid I should see an error message

  Scenario: Login with blank credentials
    When The username and the password fields are blank when I choose the login button
    Then I should not be logged in to the application, I should see an error message