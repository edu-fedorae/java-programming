package com.helloworld.examples;

public class CheckType {

    public static void main(String[] args) {
        long myResult;
        double myNumber = 99.999;
        myResult = (long) myNumber / 3;
        System.out.println(myResult);
        System.out.println(((Object)myResult).getClass().getName());
    }
}
