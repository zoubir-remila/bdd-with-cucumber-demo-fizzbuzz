package com.games.fizzbuzz;

public class FizzBuzz {
    public String play(int number) {
        if (number == 0) throw new IllegalArgumentException("0 non accepted");
        if (multipleOf(number, 5) && multipleOf(number, 3)) return "FizzBuzz";
        if (multipleOf(number, 3)) return "Fizz";
        if (multipleOf(number, 5)) return "Buzz";


        return null;
    }

    private boolean multipleOf(int number, int i) {
        return number % i == 0;
    }
}
