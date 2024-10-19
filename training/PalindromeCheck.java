package com.yash.training;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalind(int n)
    {
        int original=n;
        int rev=0;
        while (n!=0)
        {
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n=n/10;
        }
        if(rev==original)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        boolean ans=checkPalind(num);
        System.out.println(ans);
    }
}
