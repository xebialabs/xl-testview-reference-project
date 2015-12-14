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

  Scenario: Perform a test with an ignored step
    Given a test without parameters
    When I will be ignored

  Scenario: Perform something cool without any step implemented yet
    Given a test without parameters
    When doing something that is not bound yet to any code

  Scenario: Perform something cool with a pending step
    Given a test without parameters
    When doing something that is pending

  Scenario: Perform something that fails and thus skips steps after that
    When I will fail
    Then I will be skipped