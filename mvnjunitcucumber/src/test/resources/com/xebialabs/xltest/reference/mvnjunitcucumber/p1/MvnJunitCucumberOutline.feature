Feature: Reference for Scenario Outline
  Testing using the Scenario Outline template

  Scenario Outline: adding cucumbers
    Given there are <start> cucumbers
    When we add <amount> cucumbers
    Then we should have <result> cucumbers

    Examples:
      | start | amount | result |
      |  12   |  5  |  17   |
      |  20   |  5  |  25  |
