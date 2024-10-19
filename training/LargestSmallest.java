package com.yash.training;

import java.util.Arrays;

public class LargestSmallest {

    public static int findMax(int arr[])
    {
        int max=Integer.MIN_VALUE;

        int secondMax=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]<secondMax && arr[i]!=max)
            {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static int findMin(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int secondMin=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                secondMin=min;
                min=arr[i];
            }
            else if(arr[i]<secondMin &&  arr[i]!=secondMin)
            {
                secondMin=arr[i];
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int arr[]={1,5,10,21,77};
        int len=arr.length;


        System.out.println("The second largest element from the array is: "+findMax(arr));

        System.out.println("The second smallest element from the array is: "+findMin(arr));
    }
}
