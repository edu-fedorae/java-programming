package com.andco;

import java.util.Scanner;

public class Employee {

    private String name;
    private int id;
    private String status; // Should be boolean
    private String employedAt;

    public Employee() { }

    public Employee(String name, int id, String status, String employedAt) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.employedAt = employedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateEmployed() {
        return employedAt;
    }

    public void setDateEmployed(String employedAt) {
        this.employedAt = employedAt;
    }

    public void acceptAndDisplay() {

        Scanner data = new Scanner(System.in);

        System.out.println("########### Employee Info #############");
        System.out.print("What is your name: ");
        name = data.nextLine();
        System.out.print("What is ID: ");
        id = Integer.parseInt(data.next());
        System.out.print("Are you an active employee (True/False): ");
        status = data.next();
        System.out.print("When were you employed: ");
        employedAt = data.next();

        Employee employee = new Employee(name, id, status, employedAt);
        System.out.println("\n########### Your Info #############");
        System.out.println(
                "ID: " + employee.id + "\n" +
                "Name: " + employee.name + "\n" +
                "Status: " + employee.status + "\n" +
                "Date Employed: " + employee.employedAt

        );

    }
}
