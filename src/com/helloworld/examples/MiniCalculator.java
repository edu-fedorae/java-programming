package com.helloworld.examples;

import java.util.Scanner;

public class MiniCalculator {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Mini Calculator");
        System.out.print("Enter first number: ");
        int firstNumber = data.nextInt();
        System.out.print("Enter Operator (eg: +, -, *, /): ");
        char operator = data.next().charAt(0);
        System.out.print("Enter second number: ");
        int secondNumber = data.nextInt();

        switch (operator) {
            case '+':
                System.out.print("Addition - " + firstNumber + " + " + secondNumber + " = ");
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.print("Subtraction " + firstNumber + " - " + secondNumber + " = ");
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.print("Multiplication " + firstNumber + " * " + secondNumber + " = ");
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.print("Division " + firstNumber + " / " + secondNumber + " = ");
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Error: Operator not accepted");
        }
    }
}
