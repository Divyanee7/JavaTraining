package com.yash.training;

public class ReverseArray {

    public static int[] reverseArrayy(int[] arr)
    {
        int reverseArray[]=new int[arr.length];
        int k=0;
        for(int i=arr.length-1; i>=0; i--)
        {
            reverseArray[k]=arr[i];
            k++;
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        int arr[]={12,3,4,5,6};
        int ans[]=reverseArrayy(arr);
        for(int i: ans)
        {
            System.out.print(i+" ");
        }
    }
}
