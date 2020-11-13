package com.andco;

import java.util.Scanner;

public class Contract extends Employee {

    // 10 Employee

    private int salary;
    private double hoursWorked;

    public Contract(String name, int id, String status, String employedAt, int salary, double hoursWorked) {
        super(name, id, status, employedAt);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public Contract() { }

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

        System.out.println("\n########### Contracted Employee Payment Info #############");

        for (int i = 0; i <= 3; i++) {
            System.out.print("How many hours did you work in week " + week++ + " : ");
            hours[i] = data.nextDouble();
            hoursWorked += hours[i];

            overTimeHours = hours[i] - 40;

            if (hours[i] < 40) {
                salary = 0;
                System.out.println("You are required to work 40 hours per week. No Pay!");
            } else if (overTimeHours > 6) {
                salary = 40 * 700 + 4000; // Still a give him a food for the work he already did
                System.out.println("You are not allowed to work over 6 hours on overtime.");
                System.out.println("Salary for the week: $" + salary);
            } else if (overTimeHours == 6) {
                salary = 40 * 700 + 4000;
                System.out.println("Salary for the week: $" + salary);
            } else if (overTimeHours >= 3 || overTimeHours <= 5) {
                salary = 40 * 700 + 2000;
                System.out.println("Salary for the week: $" + salary);
            }  else {
                salary = 40 * 700;
                System.out.println("Salary for the week: $" + salary);
            }

            totalSalary += salary;
        }

        System.out.println("\n########### This Month's Salary #############");

        System.out.println("Salary for the month: $" + totalSalary);

    }

}
