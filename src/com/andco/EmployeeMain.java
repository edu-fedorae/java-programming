package com.andco;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        Employee employee = new Employee();
        employee.acceptAndDisplay();

        System.out.println("\n########### Employee Payment Info #############");
        System.out.print("Are you a FullTime or Contracted employee [f/c]: ");

        char employeeType = data.next().charAt(0);
        switch (employeeType) {
            case 'f':
                FullTime full_time_employee = new FullTime();
                full_time_employee.calculateSalary();
                break;
            case 'c':
                Contract contract_employee = new Contract();
                contract_employee.calculateSalary();
                break;
            default:
                System.out.println("invalid response.");
        }
    }
}
