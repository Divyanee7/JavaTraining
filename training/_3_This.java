package com.yash.training;

//This keyword is used to invoke the current class constructor

class Study
{
    Study()
    {
        System.out.println("Let's Study");
    }
    Study(String str)
    {
        this();  //It's used to reuse the constructor
        System.out.println(str);
    }
}


public class _3_This {
    public static void main(String[] args) {
        Study st=new Study("Physics");

    }
}
