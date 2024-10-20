package com.yash.thread;

public class SingleTaskMultipleThread extends Thread
{
    public void run()
    {
        System.out.println("Performing task");
    }

    public static void main(String[] args) {
        SingleTaskMultipleThread th=new SingleTaskMultipleThread();
        th.start();
        SingleTaskMultipleThread th1=new SingleTaskMultipleThread();
        th1.start();
    }
}
