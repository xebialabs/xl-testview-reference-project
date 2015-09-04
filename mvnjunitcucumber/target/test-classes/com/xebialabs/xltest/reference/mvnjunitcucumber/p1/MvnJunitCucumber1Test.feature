Feature: Reference test
  To test all possible scenarios, a reference test must be executed

  Scenario: Perform a reference test
    Given a test without parameters
    When doing nothing
    Then I will succeed
    Then I will succeed

    Given a test with parameter 3
    When and another parameter 'a'
    Then we still succeed
