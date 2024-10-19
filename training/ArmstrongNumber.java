package com.yash.training;

public class ArmstrongNumber {

    public static boolean checkArms(int n)
    {
        int temp=n;
        int ans=0;
        while (n!=0)
        {
            int lastdigit=n%10;
            ans+=(int)(Math.pow(lastdigit,countNumber(temp)));
            n=n/10;
        }
        if(temp==ans)
        {
            return true;
        }
        System.out.println(ans);
        System.out.println(countNumber(n));
        return false;
    }
    public static int countNumber(int n)
    {
        int count=0;
        while (n!=0)
        {
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=1634;
        boolean checked=checkArms(n);
        System.out.println(checked);

    }
}
