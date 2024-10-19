package com.yash.training;

//This keyword is used to pass an argument in the method
//mainly used in the event handling
class AB
{
    void m(AB obj)
    {
        System.out.println("Method Invoked");
    }
    void p()
    {
        m(this);
    }
}

public class _4_This {

    public static void main(String[] args) {
    AB a=new AB();
    a.p();
    }

}
