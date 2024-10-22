package com.yash.thread;

public class DaemonThreadDemo extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon thread");
        }
        else
        {
            System.out.println("Child thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Currently i'm in main Thread"); // if it's not present in main then daemon thread not provide any service
        DaemonThreadDemo d=new DaemonThreadDemo();
        d.setDaemon(true);
        d.start();

//        DaemonThreadDemo d1=new DaemonThreadDemo();
//        d1.start();
    }
}
