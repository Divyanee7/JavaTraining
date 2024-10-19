package com.yash.training;

//Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
//        For this class, create three subclasses, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase ().
//The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively.
//        The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively.
//Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
//Shape c=new Circle();
//Shape t=new Triangle();
//Shape s=new Square();

class Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }
    void erase()
    {
        System.out.println("Erasing the Shape");
    }
}
class  Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Shape Circle");
    }
    @Override
    void erase()
    {
        System.out.println("Erasing the Shape Circle");
    }
}

class  Triangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Shape Triangle");
    }
    @Override
    void erase()
    {
        System.out.println("Erasing the Shape Triangle");
    }
}
class  Square extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Shape Square");
    }
    @Override
    void erase()
    {
        System.out.println("Erasing the Shape Square");
    }
}



public class _19_Shape {

    public static void main(String[] args) {
        Shape c=new Circle();
        c.draw();
        c.erase();

        Shape t=new Triangle();
        t.draw();
        t.erase();

        Shape s=new Square();
        s.draw();
        s.erase();
    }
}
