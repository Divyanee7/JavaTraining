package com.yash.thread;

public class ThreadDemo extends Thread
{
    public void run()
    {
//        Thread.currentThread().setName("D");
        System.out.println("Hello I'm in : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello Everyone");

        //used to get the name of the thread which is assigned by the jvm
        System.out.println(Thread.currentThread().getName());

        //change the name according to the requirement
        Thread.currentThread().setName("Divyanee");

//        System.out.println(Thread.currentThread().getName());
      //System.out.println(10/0);

        ThreadDemo t=new ThreadDemo(); //Creating user defined thread;

         t.setDaemon(true);
        Runnable run = ()-> {

            for(int i = 0; i<10;i++)
            {
                System.out.println(i);

                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            currentThread().setName("s");
            System.out.println(currentThread().getName());
        };

        Thread thread2 = new Thread(run);
        System.out.println(currentThread().getName());
        thread2.start();

//        t.start();

//        ThreadDemo t1=new ThreadDemo();
//        t1.setName("D");
//        t1.start();

    }


}
