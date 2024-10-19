package com.yash.training;
//This keyword is used to refer current class instance variable

class Student
{
    int rollNo;
    String name;
    Student(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
    }
    void displayed()
    {
        System.out.println(rollNo+" "+name);
    }

}

public class _1_This {
    public static void main(String[] args) {
        Student s1=new Student(57,"DD");
        s1.displayed();
    }


}
