package com.yash.thread;

public class Test implements Runnable
{
    public void run()
    {
        System.out.println("Creating the thread by using the Runnable interface");
    }

    public static void main(String[] args) {
        Test t=new Test();
        Thread th=new Thread(t);
        th.start();
    }
}
