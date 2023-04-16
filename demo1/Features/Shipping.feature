Feature: Shipping feature

  Scenario: Delivery method
    When i choose delivery method
    Then i should be asked for my location

  Scenario: Pickup method
    When i choose pickup method
    Then i should receive a message when it's ready