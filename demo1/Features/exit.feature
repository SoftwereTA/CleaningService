Feature: Exit feature

  Scenario: Exit the application
    When I click the exit option
    Then the application should exit

    Scenario: Using ALT+F4 or X to exit the application
    When I press ALT+F4 or X
    Then the application should exit