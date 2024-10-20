package com.yash.thread;

public class Demo extends Thread
{
    @Override
    public void run()  //runnable ke andar public tha isliye public provide krna pdega
    {
        System.out.println("New Thread Created");
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.start();  //one time it will create
      //  d.start(); //provide and exception. we can't invoke thread again and again

    }
}
