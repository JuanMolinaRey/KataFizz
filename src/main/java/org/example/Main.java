package org.example;

public class Main {
    public static void main(String[] args) {
        int num;
        
        System.out.println("\n"+"Number sequence from 1 to 100: ");

        for (num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (num % 5 == 0) {
                System.out.println(num+".buzz");
            }
            else if (num % 3 == 0){
                System.out.println(num+".Fizz");
            }
            else {
                System.out.println(num+".");
            }
        }
    }
}