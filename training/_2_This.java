package com.yash.training;
//This keyword is used to invoke the current class method

class A
{
    void me()
    {
        System.out.println("Hello Me");
    }
    void you()
    {
        System.out.println("Hello You");
        this.me();
        //if you don't use this keyword compiler automatically adds
        //this keyword while invoking the method
    }

}

public class _2_This {
    public static void main(String[] args) {
        A a=new A();
        a.you();
    }

}
