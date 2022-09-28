Feature: Is able to lowercase string

  Scenario Outline:
    Given that i want to lowercase a string
    When the uppercase string is "<input>"
    Then the lowercased string is "<output>"

    Examples:
      | input       | output      |
      | ABC         | abc         |
      | BOB         | bob         |
      | bob         | bob         |
      | HELLO WORLD | hello world |
