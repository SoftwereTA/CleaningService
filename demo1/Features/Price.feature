Feature: Price feature

  Scenario: i want clean 200x100 cm item
    When i choose speed cleaning
    Then the price will be 10

  Scenario: i want clean 200x100 cm item
    When i choose deep cleaning
    Then the price will be 20

  Scenario: i want clean 200x100 cm item
    When i choose dry cleaning
    Then the price will be 300