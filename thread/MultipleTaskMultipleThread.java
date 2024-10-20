package com.yash.thread;

class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Performing Task1");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Performing Task2");
    }
}

public class MultipleTaskMultipleThread {
    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        th1.start();
        Thread2 th2=new Thread2();
        th2.start();
        Thread1 th3=new Thread1();
        th3.start();
    }
}
