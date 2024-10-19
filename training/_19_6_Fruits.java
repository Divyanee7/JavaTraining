package com.yash.training;

//1)Create  a base class Fruit with name ,taste and size as its attributes.
//Create a method called eat() which describes the name of the fruit and its taste.
//Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.


class Fruit
{
    String name;
    String taste;
    int size;

    void eat()
    {
        System.out.println("The name of the fruit is: ");
    }

}
class Apple extends Fruit
{
    Apple(String name,String taste)
    {
        this.name=name;
        this.taste=taste;
    }
    @Override
    void eat()
    {
        System.out.println("The name of the fruit is: "+name+" \nThe taste of the fruit is: "+taste);
    }

}

class Orange extends Fruit
{
    Orange(String name,String taste)
    {
        this.name=name;
        this.taste=taste;
    }
    @Override
    void eat()
    {
        System.out.println("The name of the fruit is: "+name+"\nThe taste of the fruit is: "+taste);
    }
}


public class _19_6_Fruits {
    public static void main(String[] args) {

        Fruit a=new Apple("Apple","Sweet");
        a.eat();

        Fruit o=new Orange("Orange","Sour");
        o.eat();
    }
}
