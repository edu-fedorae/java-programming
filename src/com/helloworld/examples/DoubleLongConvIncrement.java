package com.helloworld.examples;

import java.util.Scanner;

public class DoubleLongConvIncrement {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter a double number(eg. 99.999): ");
        double myNumber = data.nextDouble();
        System.out.println(myNumber);
        ++myNumber;
        System.out.println(myNumber);
        long myResult = (long) myNumber / 3;
        System.out.println(myResult);
        System.out.println(((Object)myResult).getClass().getName());
    }
}
