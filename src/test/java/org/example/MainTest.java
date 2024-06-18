package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void TestFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.multi3and5 (15));

    }

    @Test
    public void TestBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.multi5 (10));
    }

    @Test
    public void TestFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertTrue(fizzbuzz.multi3 (9));
    }


}