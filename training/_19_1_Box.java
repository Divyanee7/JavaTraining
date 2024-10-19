package com.yash.training;

import java.util.Scanner;

class Box{
    int len;
    int wid;
    int bred;
   //method which used to initialized the dimensions of the box
    void setDimensionBox(int len,int wid,int bred)
    {
        this.len=len;
        this.bred=bred;
        this.wid=wid;
    }
    //used to calculate the volume
    int volume()
    {
        return len*bred*wid;
    }
}

public class _19_1_Box {
    public static void main(String[] args) {
        Box b=new Box();
        b.setDimensionBox(10,5,6);
        System.out.println("The Volume of the box: "+b.volume());


    }

}
