Feature: Available Worker Feature

  Scenario:
    When the worker enter the order ID
    And click on Waiting button
    Then his status will be unavailable

  Scenario:
    When the worker enter the order ID
    And click on Complete button
    Then his status will be available