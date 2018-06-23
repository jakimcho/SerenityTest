Feature: Simple Calculator

Background:
  Given Calculator is opened

@tc:15
  Scenario Outline: User enter a number
    When user enters <value>
    Then Calculator displays <value>

Examples:
| value   |
| 1230    |
| 0736    |
| 9548    |
| -120932 |
