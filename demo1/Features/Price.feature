Feature: Price feature

  Scenario: i want clean 200x100 cm item
    When i choose 200x100 size
    And i choose speed cleaning
    Then the price will be 10

  Scenario: i want clean 200x200 cm item
    When i choose 200x200 size
    And i choose deep cleaning
    Then the price will be 20

  Scenario: i want clean 300x200 cm item
    When i choose 300x200 size
    And i choose dry cleaning
    Then the price will be 300