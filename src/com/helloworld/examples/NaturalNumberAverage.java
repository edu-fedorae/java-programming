package com.helloworld.examples;

import java.util.Scanner;

public class NaturalNumberAverage {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter a natural number number: ");
        int number = data.nextInt();
        int average = 0;
        int sum = 0;
        for (int i = number; i > 0  ; i--) {
            sum += i;
            System.out.println(i);
            average = sum / number;
        }
        System.out.print("Average: " + average);
    }
}
