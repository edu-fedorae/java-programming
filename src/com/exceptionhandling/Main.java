package com.exceptionhandling;

public class Main {

    public static void main(String[] args) {
        // Uncomment each section to use.

	    /*/ NumberFormatException /*/
        int number = Integer.parseInt("Ten");
        System.out.println(number);
        // Fix
//        int fix_number = Integer.parseInt("10");
//        System.out.println(fix_number);
        // Handle
//        try {
//            int number = Integer.parseInt("Ten");
//            System.out.println(number);
//        } catch (Throwable err) {
//            System.out.println("The error is: " + err);
//            err.printStackTrace();
//        }

        /*/ NullPointerException /*/
//        String name = null;
//        System.out.println(name.toUpperCase());
        // Fix
//        String name = "jane";
//        System.out.println(name.toUpperCase());
        // Handle
//        try {
//            String name = null;
//            System.out.println(name.toUpperCase());
//        } catch (Throwable err) {
//            System.out.println("The error is: " + err);
//            err.printStackTrace();
//        }

        /*/ StringIndexOutOfBoundsException /*/
//        String name = "jane";
//        System.out.println(name.charAt(10));
        // Fix
//        String name = "jane";
//        System.out.println(name.charAt(3));
        // Handle
//        try {
//            String name = "jane";
//            System.out.println(name.charAt(10));;
//        } catch (Throwable err) {
//            System.out.println("The error is: " + err);
//            err.printStackTrace();
//        }

        /*/ Adjusted Code /*/
//        Scanner scan = new Scanner(System.in);
//        int x;
//        int y;
//        int quotient = 0;
//        try {
//            System.out.print("Enter dividend: ");
//            x = scan.nextInt();
//            System.out.print("Enter divisor: ");
//            y = scan.nextInt();
//            try {
//                if (y == 0) {
//                    quotient = x / y;
//                }
//            } catch (Throwable err) {
//                System.out.println("You cannot divide by zero");
//            }
//        } catch (Throwable err) {
//            System.out.println("You most enter an Integer value. [Positive or negative numbers without decimal point]");
//        }
//        System.out.print("The quotient is: " + quotient);

    }

}