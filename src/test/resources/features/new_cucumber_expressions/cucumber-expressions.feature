# new feature
# Tags: optional

Feature: Cucumber 3.0.2 Expressions demo

  Scenario: Simple test that show scenario step glue with expressions
    Given I have nymber 40.5
    When I add number 8.5 to that number
    Then I should have the answer of the question

  @jt:test
  Scenario: Simple data table glu
    Given I have bought a cat:
      | name | color | tailLength |
      | Lila | black | 7          |