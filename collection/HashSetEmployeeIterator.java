package com.yash.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEmployeeIterator {
    public static void main(String[] args) {
        HashSet<String> employee=new HashSet<>();
        employee.add("D");
        employee.add("Divyani");
        employee.add("Vaishnavi");

       /*
        The element are returned in the order they appear in the internal
        has table,Which is not the same as the insertion order
        If we want to maintain the insertion order we can use the LinkedHashSet
        which uses the LinkedList
        */
        Iterator<String> itr=employee.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
