package com.yash.training;

class Students
{

    String name;   //instance variable
    int rollNo;    //instance variable
    static String clgName="JSPM's Rajarshi Shahu college of engineering,Tathwade";   //static variable


    Students(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
    }
    public void show()
    {
        String div="CS"; //local variable
        System.out.println("Name of Student is: "+name+" RollNumber: "+rollNo+" CollegeName: "+clgName+" Divison: "+div);
    }

}

public class Variables {
    public static void main(String[] args) {
      Students s1=new Students(1,"Divyanee");
      Students s2=new Students(2,"DD");
      Students.clgName="RSCOE,Tathwade";
      s1.show();
      s2.show();
    }
}
