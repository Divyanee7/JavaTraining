package com.yash.collection;

import java.util.Vector;

public class VectorMonth {
    public static void main(String[] args) {
        Vector<String> monthName=new Vector<>();
        monthName.add("January");
        monthName.add("February");
        monthName.add("March");
        monthName.add("April");
        monthName.add("May");
        monthName.add("June");
        monthName.add("July");
        monthName.add("August");
        monthName.add("September");
        monthName.add("October");
        monthName.add("November");
        monthName.add("December");

        for(String month:monthName)
        {
            System.out.print(month+" ");
        }
    }
}
