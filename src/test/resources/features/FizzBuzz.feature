Feature: App to paly FizzBuzz

  Scenario: Play for Fizz
    When user enter 3
    Then return value is "Fizz"

  Scenario: Play for Buzz
    When user enter 5
    Then return value is "Buzz"

  Scenario: Play for FizzBuzz
    When user enter 15
    Then return value is "FizzBuzz"

  Scenario: Play for emptyResponse
    When user enter 4
    Then return value is ""

  Scenario Outline: Play FizzBuzz
    When user enter number <input>
    Then return value is "<output>"
    Examples:
      | input | output    |
      | 1     |           |
      | 3     | Fizz      |
      | 4     |           |
      | 5     | Buzz     |
      | 10    | Buzz     |
      | 15    | FizzBuzz |
      | 18    | Fizz     |
      | 30    | FizzBuzz |