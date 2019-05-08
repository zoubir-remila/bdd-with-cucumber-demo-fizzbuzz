Feature: FizzBuzz Game Play

  Scenario: Play FizzBuzz to get Fizz
    Given Create FizzBuzz game
    When Play with number 3
    Then Get the "Fizz"

  Scenario: Play FizzBuzz to get Fizz
    Given Create FizzBuzz game
    When Play with number 5
    Then Get the "Buzz"

  Scenario: Play FizzBuzz to get Fizz
    Given Create FizzBuzz game
    When Play with number 15
    Then Get the "FizzBuzz"
