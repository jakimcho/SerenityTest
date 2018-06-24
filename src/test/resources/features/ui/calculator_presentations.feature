Feature: Simple Calculator

Background:
  Given Calculator is opened

@tc:15
  Scenario Outline: User enter number <value>
    When user enters <value>
    Then Calculator displays <value>

Examples:
| value   |
| 1230    |
| 0736    |
| 9548    |
| -120932 |
