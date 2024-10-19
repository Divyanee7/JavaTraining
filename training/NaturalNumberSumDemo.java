package com.yash.training;
/*
 We are having NaturalNumberDemo class which having calculateSum method
 which return sum of n natural number which is divisible by 3 and 5
 */
public class NaturalNumberSumDemo {

    /*
    We created one method which takes argument as an integer value and return the integer
     */
    public static int calculateSum(int n)
    {
        int sum=0;
        //Created one for loop from 1 to n , we add the numbers which are divisible
        //by 3 and 5
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                sum+=i;

            }
        }
        //we return the sum which we calculated.
        return sum;
    }
    public static void main(String[] args) {

        int arr[]; //declaration
        arr=new int[5]; //creation

        System.out.println(arr);
        int n=100;
        System.out.println(calculateSum(n));
    }
}
