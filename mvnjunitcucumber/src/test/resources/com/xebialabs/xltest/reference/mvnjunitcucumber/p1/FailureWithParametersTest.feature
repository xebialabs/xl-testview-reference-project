Feature: FailureWithParameters
  A test with parameters that fails

  Scenario: Perform a reference test
    Given a test with parameter 3
    When and another parameter 'a'
    Then we still succeed
    And we still fail
