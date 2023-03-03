Feature: Login Feature

  As a user of the application I want to be able to login to the application so that I can access my account.

  Background:
   Given: I have a valid username and password
    And: I am on the login page
    | username | password |
    | Zen    | password |
    | Tariq    | password |


    Scenario: Login with valid credentials
        Given I am on the login page
        When I enter my username and password
        And I click the login button
        Then I should be logged in to the application
        And I should see the home page

    Scenario: Login with invalid credentials
        Given I am on the login page
        When I enter my username and password
        And I click the login button
        Then I should not be logged in to the application
        And I should see an error message

    Scenario: Login with blank credentials
        Given I am on the login page
        When I enter my username and password
        And I click the login button
        Then I should not be logged in to the application
        And I should see an error message
