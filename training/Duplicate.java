package com.yash.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Duplicate {

    public static ArrayList<Integer> removeDuplicate(int[] arr)
    {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:arr)
        {
            set.add(i);  //adding elements to hashset to remove duplicates
        }
        //convert the set to the arraylist
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i:set)
        {
            list.add(i);
        }
        return list;
    }

    public static int[] removeDuplicates(int[] array) {

        //temporary array to store the unique array having the same size as that of the array which came from the user
        int[] uniqueArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;  //this is flag to check whether the current element is duplicate or not

            //check whether the current element is already exist in uniqueArray or not
            for (int k = 0; k < j; k++) {
                if (array[i] == uniqueArray[k]) {
                    isDuplicate = true; //if exist it will mark as duplicate and break the current loop
                    break;
                }
            }
            //if not duplicate it will add it to the uniquearray list
            if (!isDuplicate) {
                uniqueArray[j++] = array[i];
            }
        }

        //create the final array with the correct size
        return Arrays.copyOf(uniqueArray, j);
//       return uniqueArray;
    }

    public static void main(String[] args) {
        int arr[]={2,4,30,20,30};
       ArrayList<Integer> newArr= removeDuplicate(arr);
       for(int i:newArr)
       {
           System.out.print(i+" ");
       }


    }
}
