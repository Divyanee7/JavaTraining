package com.yash.training;

import java.util.Scanner;

public class FibonnacciSeries {

    public static int printFib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        return printFib(n-1)+printFib(n-2);
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int start=0; start<=n; start++)
        {
            System.out.print(printFib(start)+" ");
        }

    }
}
