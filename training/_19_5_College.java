package com.yash.training;

class Person{
    String name;
    String Dob;
}

class Teacher extends Person
{
    int salary;
    String subject;

}

class Studentss extends Person{
    int studentId;

}
class CollegeStudent extends Studentss
{
    String collegeName;
    int year;

}

public class _19_5_College {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="Divyanee";
        t.Dob="21st September";
        t.salary=231000;
        t.subject="Java";

        System.out.println("Name : "+t.name+"\nDate of birth: "+t.Dob+"\nSalary: "+t.salary+"\nSubject: "+t.subject );

        System.out.println();
        CollegeStudent cs=new CollegeStudent();
        cs.name="DD";
        cs.Dob="21 Sep";
        cs.collegeName="JSPM's Rajarshi shahu college of engineering,Tathwade";
        cs.year=4;
        cs.studentId=57;

        System.out.println("Name : "+cs.name+"\nDate of birth: "+cs.Dob+"\nCollege Name: "+cs.collegeName+"\nYear: "+cs.year+"\nStudent ID: "+cs.studentId);


    }

}
