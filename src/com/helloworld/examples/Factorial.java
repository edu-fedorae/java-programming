package com.helloworld.examples;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Factorial: " + factFunc(5));
    }

    public static int factFunc(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return (number * factFunc(number - 1));
        }
    }
}
