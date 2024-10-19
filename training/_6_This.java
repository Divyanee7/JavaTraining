package com.yash.training;

//This keyword is used to return the current class instance

class AS{
    AS getA(){
        return this;
    }
    void msg()
    {
        System.out.println("Hello java");
    }
}
public class _6_This {
    public static void main(String[] args) {
        new AS().getA().msg();
    }
}
