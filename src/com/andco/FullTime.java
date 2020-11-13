package com.andco;

import java.util.Scanner;

public class FullTime extends Employee {

    // 20 Employee

    private int salary; // I made this an int for obvious money reason, should do the correct calculation somewhere down the line.
    private double hoursWorked;

    public FullTime(String name, int id, String status, String employedAt, int salary, int hoursWorked) {
        super(name, id, status, employedAt);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public FullTime() { }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void calculateSalary() {

        Scanner data = new Scanner(System.in);

        double[] hours = new double[4];
        double overTimeHours;
        int totalSalary = 0;
        int week = 1;

        System.out.println("\n########### FullTime Employee Payment Info #############");

        for (int i = 0; i <= 3; i++) {
            System.out.print("How many hours did you work in week " + week++ + " : ");
            hours[i] = data.nextDouble();
            hoursWorked += hours[i];

            overTimeHours = hours[i] - 40;

            // This is just for one week
            if (hours[i] < 40){
                salary = 0;
                System.out.println("You are required to work 40 hours per week. No Pay!");
            } else if (hours[i] > 40 && overTimeHours != 40) {
                double overTimePay = overTimeHours * 1.5 * 500;
                salary = (int) (40 * 500 + overTimePay);
                System.out.println("Salary for the week: $" + salary);
            } else {
                salary = 40 * 500;
                System.out.println("Salary for the week: $" + salary);
            }

            totalSalary += salary;
        }

        System.out.println("\n########### This Month's Salary #############");

        System.out.println("Salary for the month: $" + totalSalary);

    }
}
