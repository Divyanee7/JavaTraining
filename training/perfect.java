package com.yash.training;
//The first 5 perfect numbers are 6, 28, 496, 8128, and 33550336.
public class perfect {
    public static void perfectNumber(long n)
    {
        for(int start=1; start<=n; start++)
        {
            int sum=0;
            for(int d=1; d<start; d++)
            {
                if(start%d==0)
                {
                    sum+=d;
                }
            }
            if(sum==start)
            {
                System.out.println(start+" is perfect number");
            }
        }
    }

    public static void main(String[] args) {
        long n=10000;
        perfectNumber(n);
    }
}
