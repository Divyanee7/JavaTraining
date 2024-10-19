package com.yash.oopsproject;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        AccountSystem payrollSystem = new AccountSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Divyanee", 104, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("DD", 105, 40, 50.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        try {
            System.out.println("\nRemoving Employee...");
            payrollSystem.removeEmployee(103);
            System.out.println("Employee Removed");
        } catch (IdDoesNotExistsException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();

        payrollSystem.close(); // Close the  connection
    }
}
