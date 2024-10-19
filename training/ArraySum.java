package com.yash.training;

import java.util.Scanner;

public class ArraySum {

    public static int sumArray(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static int findMax(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int findMin(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("The array given from the user is: ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The sum of the given array is: "+sumArray(arr));
        System.out.println("The maximum number from the given array is: "+findMax(arr));
        System.out.println("The minimum number from the given array is: "+findMin(arr));
    }
}
