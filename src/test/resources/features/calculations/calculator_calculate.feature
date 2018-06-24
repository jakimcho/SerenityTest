Feature: Simple Calculator

  Background: 
    Given Calculator is opened

  @tc:11
  Scenario Outline: Perform addition of two numbers:
    When user sums numbers:
      | <nummber_1> | <number_2> |
    Then Calculator displays <value> and <test>

    Examples: 
      | a   | b    | value | test   |
      |   1 |    1 |     2 | test   |
      | 1.5 |  1.5 |     3 | test   |
      | 100 | 9900 | 10000 | test   |
      |  -1 |    1 |     0 | test   |
      |   0 |    0 |     0 | tsetse |

  @tc:12
  Scenario Outline: Perform substraction of two numbers:
    When user substracts numbers:
      | <a> | <b> |
    Then Calculator displays <value>

    Examples: 
      | a   | b    | value |
      |   1 |    1 |     0 |
      | 1.5 |  0.5 |     1 |
      | 100 | 9900 | -9800 |
      |  -1 |    1 |     2 |
      |   0 |    0 |     0 |

  @tc:13
  Scenario Outline: Perform multiplication of two numbers:
    When user multiplies numbers:
      | <a> | <b> |
    Then Calculator displays <value>

    Examples: 
      | a   | b    | value  |
      |   1 |    1 |      1 |
      | 1.5 |  0.5 |   0.75 |
      | 100 | 9900 | 990000 |
      |  -1 |    1 |     -1 |
      |   0 |    0 |      0 |

  @tc:14
  Scenario Outline: Perform devision of two numbers:
    When user devides numbers:
      | <a> | <a> |
    Then Calculator displays <value>

    Examples: 
      | a   | b    | value |
      |   1 |    1 |     1 |
      | 1.5 |  0.5 |     3 |
      | 100 | 1000 |   0.1 |
      |  -1 |    1 |    -1 |
      |   0 |    0 | N/A   |
