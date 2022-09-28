Feature: Is able to reverse a string

  Scenario Outline:
    Given that i want to reverse a string
    When the string is "<input>"
    Then the reversed string is "<output>"

    Examples:
      | input | output |
      | aBC   | CBa    |
      | cba   | abc    |
