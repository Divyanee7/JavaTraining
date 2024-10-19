package com.yash.collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee
{
    String name;
    int id;

    Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String toString()
    {
        return "\nEmployee ID: "+id+" , Name: "+name;
    }

}

public class VectorEmployeeObject {
    public static void main(String[] args) {
        Vector<Employee> employees=new Vector<>();

        employees.add(new Employee("D",101));
        employees.add(new Employee("DD",102));
        employees.add(new Employee("DDD",103));

        Iterator<Employee> iterator=employees.iterator();
        System.out.println("Using Iterator: ");
        /*
        We are passing Employee object to the sout.Since the
        Employee class overrides the toString() method,Java
        automatically calls that method to get the representation of the object.
        it gets invoked by sout internally.
         */
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");  //Without toString() method :com.yash.collection.Employee@4554617c com.yash.collection.Employee@74a14482 com.yash.collection.Employee@1540e19d
        }

        Enumeration<Employee> enumeration=employees.elements();
        System.out.println();
        System.out.println("\nUsing Enumeration: ");;
        while (enumeration.hasMoreElements())
        {
            System.out.print(enumeration.nextElement());
        }

    }

}

