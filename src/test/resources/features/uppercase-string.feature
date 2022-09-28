Feature: Is able to uppercase string

  Scenario Outline:
    Given that i want to uppercase a string
    When the lowercase string is "<input>"
    Then the uppercased string is "<output>"

    Examples:
      | input       | output      |
      | abc         | ABC         |
      | bob         | BOB         |
      | BOB         | BOB         |
      | hello world | HELLO WORLD |
