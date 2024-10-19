package com.yash.training;
import java.util.*;

class Tester
{
    void show()
    {
        System.out.println("Hello I'm in tester class");
    }
}

public class _7_ObjectCreation {
    public static void main(String[] args) {
        //Using the new Keyword
        Tester t1=new Tester();

        //Using Class.forName() method
//        Tester t2 = (Tester)Class.forName("Tester").newInstance();

//        Tester t3=t1.clone();
//        Tester tester4 = Tester.class.getDeclaredConstructor().newInstance();
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream );
//        Tester tester5 = (MyObject) objectInputStream.readObject();

    }
}
