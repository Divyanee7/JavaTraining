package com.yash.training;

public class Ignore6_7 {

    public static int sumIgnore(int arr[])
    {

        //we are creating one flag which checked whether the value is in between 6 and 7 or not
        boolean flag=false;
        int sum=0;
        //created one loop which check the whole array
        for(int i=0; i<arr.length; i++)
        {
            //using conditional statement for checking the number is 6 if it's 6 then the flag turns true
            if(arr[i]==6)
            {
                flag=true;
            }
            //the second condition is whether the value is 7 and the flag is true then flag turns false
            else if(arr[i]==7 && flag)
            {
                flag=false;
            }
            //the remaining element from the array will add in the sum variable
            else if (!flag)
            {
              sum+=arr[i];
            }
        }
        //lastly we simply returning the sum which we calculated
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={10,3,6,1,2,7,9};
        int ans=sumIgnore(arr);
        System.out.println(ans);

    }
}
