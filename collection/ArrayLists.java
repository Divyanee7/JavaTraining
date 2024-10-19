package com.yash.collection;
import java.util.ArrayList;


public class ArrayLists {


    public static void main(String[] args) {
        ArrayList<String> monthName = new ArrayList<>();


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

        for (String month : monthName) {
            System.out.print(month + " ");
        }


    }

}

