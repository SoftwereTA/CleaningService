Feature: Exit feature

  Scenario: Exit the application
    When I click the exit option
    Then the application should exit

    Scenario: ALT + F4
    When I press ALTF4 option
    Then the application should exit

    Scenario: X
    When I click the X
    Then the application should exit
