package com.games.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzShould {

    FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void return_fizz_when_play_3() {
        assertEquals("Fizz", fizzbuzz.play(3));
    }

    @Test
    public void return_buzz_when_play_5() {
        assertEquals("Buzz", fizzbuzz.play(5));
    }

    @Test
    public void return_fizzbuzz_when_play_15() {
        assertEquals("FizzBuzz", fizzbuzz.play(15));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throw_exception_when_play_O() {
        fizzbuzz.play(0);
    }

}
