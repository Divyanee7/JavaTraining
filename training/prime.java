package com.yash.training;

import java.util.Scanner;

public class prime {
    public static void checkPrime(int n)
    {
        int sum=0;
        for(int start=2; start<=n; start++) {
            int count=0;
            for (int i = 2; i <=start/2; i++) {
                if (start % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(start+" ");
                sum+=start;
            }
        }
        System.out.println();
        System.out.println("The sum of total prime number is: "+sum);

    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

       checkPrime(n);


    }
}
