package com.yash.training;

class Animal{
    Animal()
    {
        System.out.println("We are in Animal class now");
    }
    int num(int a)
    {
        return 0;
    }
    boolean num(boolean b)
    {
        return false;
    }
}

public class StringDemo {


    public static void main(String[] args) {

        Animal a=new Animal();  //when there is no Animal constructor present in the class then default constructor will get call otherwise the non argument constructor will get cll

    }
}
