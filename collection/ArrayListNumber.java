package com.yash.collection;

import java.util.ArrayList;

public class ArrayListNumber {
    public static void main(String[] args) {
        ArrayList<Number> addInt=new ArrayList<>();
        addInt.add(4);
        addInt.add(4.5);
        addInt.add(5f);

        for(Number in:addInt)
        {
            System.out.print(in+" ");
        }

    }
}
