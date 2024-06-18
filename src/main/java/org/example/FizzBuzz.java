package org.example;

public class FizzBuzz {

    public boolean multi3and5 (int num) {
        System.out.println("Is FizzBuzz");
        return num % 3 == 0 && num % 5 == 0;
    }
    public boolean multi3 (int num) {
        System.out.println("Is Fizz");
        return num % 3 == 0;
    }
    public boolean multi5 (int num) {
        System.out.println("Is Buzz");
        return num % 5 == 0;
    }
}
