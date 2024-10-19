package com.yash.training;

class Animals
{
    void eat()
    {
        System.out.println("I'm in eat method from Animal class");

    }
    void sleep()
    {
        System.out.println("I'm in sleep method from Animal class");
    }
}

class Bird extends Animals
{
    @Override
    void eat()
    {
        System.out.println("I'm in eat method from Bird class");
    }
    @Override
    void sleep()
    {
        System.out.println("I'm in sleep method from the Bird class");
    }

    void fly()
    {
        System.out.println("I'm in fly method from the Bird class");
    }
}
public class _19_4_Animal {
    public static void main(String[] args) {
        Animals a=new Animals();
        a.eat();
        a.sleep();

        System.out.println();
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
