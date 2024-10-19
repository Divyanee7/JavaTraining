package com.yash.training;

class Persone {

    private void calculateSalary() {
        System.out.println("Salary calculation in Person");
    }
}


class Employeess extends Person {
    private double salary;
    private double taxPercent;


    public Employeess(double salary, double taxPercent) {
        this.salary = salary;
        this.taxPercent = taxPercent;
    }


    public void calculateSalary() {
        double netSalary = salary - (salary * taxPercent / 100);
        System.out.println("Employee Net Salary: " + netSalary);
    }
}

class UnEmployed extends Person {
    public void calculateSalary() {
        System.out.println("No Salary for Unemployed");
    }
}

class SelfEmployee extends Person {
    private double income;
    private double taxPercent;


    public SelfEmployee(double income, double taxPercent) {
        this.income = income;
        this.taxPercent = taxPercent;
    }


    public void calculateSalary() {
        double netIncome = income - (income * taxPercent / 100);
        System.out.println("SelfEmployed Net Income: " + netIncome);
    }
}


class CalculateSalari {
    public CalculateSalari(Employeess employee) {
        employee.calculateSalary();
    }

    public CalculateSalari(SelfEmployee selfEmployed) {
        selfEmployed.calculateSalary();
    }

    public CalculateSalari(UnEmployed unemployed) {
        unemployed.calculateSalary();
    }
}
public class Demo {

    public static void main(String[] args) {
        Employeess emp = new Employeess(50000, 10);
        SelfEmployee selfEmp = new SelfEmployee(60000, 15);
        UnEmployed unEmp = new UnEmployed();

        CalculateSalari empSalary = new CalculateSalari(emp);
        CalculateSalari selfEmpSalary = new CalculateSalari(selfEmp);
        CalculateSalari unEmpSalary = new CalculateSalari(unEmp);
    }
}
