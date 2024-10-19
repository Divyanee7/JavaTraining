package com.yash.training;

class myClass
{
    int a;
    String b;
    myClass()
    {
        a=0;
        b="Default";
    }
    myClass(int x)
    {
        a=x;
        b="Default";

    }
    myClass(int x,String y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("a = "+a+" & b = "+b);
    }
}

public class _8_ConstructorOverloading {
    public static void main(String[] args) {
        myClass obj1=new myClass();
        myClass obj2=new myClass(10);
        myClass obj3=new myClass(20,"Divyanee");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
