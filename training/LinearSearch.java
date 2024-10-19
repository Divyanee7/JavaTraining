package com.yash.training;

public class LinearSearch {

    public static int findKey(int[] arr,int key)
    {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,10,21,77};
        int key=10;
        System.out.println(findKey(arr,key));
    }
}
