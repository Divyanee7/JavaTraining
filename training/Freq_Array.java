package com.yash.training;

public class Freq_Array {
    
    public static int printFreq(int arr[],int key)
    {
        int freq = 0;
        for(int i=0; i<arr.length; i++)
        {

                if(arr[i]==key)
                {
                    freq++;
                }

        }
        return freq;
    
    }
    
    public static void main(String[] args) {
        int arr[]={12,1,4,2,2,1,2,1,1};
        System.out.println(printFreq(arr,1));
    }
}
