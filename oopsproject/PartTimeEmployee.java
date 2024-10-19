package com.yash.oopsproject;

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double rate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double rate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setHourlyRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {

        return hoursWorked * rate;
    }
}
