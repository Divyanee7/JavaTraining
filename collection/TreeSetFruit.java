package com.yash.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetFruit {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();

        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Kiwi");

        TreeSet<String> reverseFruitSet= (TreeSet<String>) fruit.descendingSet();   //returns the value into Navigable set but we want it into Treeset so,// typecasting

        System.out.print("The reverse elements of the collection is: ");
        for(String f:fruit)
        {
            System.out.print(f+" ");
        }
        System.out.println();
        Iterator<String> Fr=fruit.iterator();
        while(Fr.hasNext())
        {
            System.out.print(Fr.next()+" ");
        }


        System.out.println();
        String checkFruit="Apple";
        if(fruit.contains(checkFruit))
        {
            System.out.println(checkFruit+" exist in the Fruit Set");
        }
        else
        {
            System.out.println(checkFruit+" doesn't exist in the Fruit Set");
        }

    }
}
