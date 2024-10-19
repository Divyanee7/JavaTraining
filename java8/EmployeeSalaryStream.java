package com.yash.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee
{
    String name;
    double salary;

    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public String toString()   //Apne aap call hoti hai yehhhhhh*****************
    {
        return "Employee{name='"+name+"', salary="+salary+ "}";
    }
}
public class EmployeeSalaryStream {
    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee("Divyanee",45000),
                new Employee("John",49000),
                new Employee("Jane",34699),
                new Employee("Tom",67000)
        );
        Stream<Employee> e1=employees.stream();
        List<Employee> filtererdEmployees=e1.filter(e->e.getName().startsWith("J")).filter(e->e.getSalary()<50000).collect(Collectors.toList());
        filtererdEmployees.forEach(System.out::println);
//        System.out.println("The Employees whose name start with 'J' and having salary less than 50000 : "+filtererdEmployees);



    }
}
