Feature: Exit feature

  Scenario: Exit the application
    Given I am using the application
    When I select the exit option
    Then the application should exit

    Scenario: Using ALT+F4 to exit the application
    Given I am using the application
    When I press ALT+F4
    Then the application should exit

      Scenario: I click the X button to exit the application
    Given I am using the application
    When I click the X button
    Then the application should exit