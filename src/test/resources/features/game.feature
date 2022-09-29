Feature: can play a bowling game

  Scenario Outline:
    Given a bowling game
    When i roll <rolls> times and hit <amount> each time
    Then my final score is <finalScore>

    Examples:
      | rolls | amount | finalScore |
      | 20    | 0      | 0          |
      | 21    | 4      | 80         |
      | 3     | 5      | 20         |

  Scenario:
    Given a bowling game
    When i roll a strike
    Then i should be given a bonus for my next two rolls
