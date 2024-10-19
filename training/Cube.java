package com.yash.training;

import java.util.Scanner;

public class Cube {

    public static int returnCube(int n)
    {
        int ans=0;
        while (n!=0)
        {
            int lastdigit=n%10;
            ans+=(int)(Math.pow(lastdigit,3));
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(returnCube(n));
    }
}

