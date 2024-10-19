package com.yash.training;

class Patient
{
String patientName="Divyanee";
double height;
double weight;

Patient(String patientName,double height,double weight)
{
    this.patientName=patientName;
    this.height=height;
    this.weight=weight;
}

double calculateBMI()
{
    return weight/(height*height);
}
}


public class _19_2_Patient {
    public static void main(String[] args) {
        Patient p=new Patient("Divyanee",1.5748, 58.4); //properly at the time of creation
        double Bmi= p.calculateBMI();
        System.out.println("Name of Patient : "+p.patientName+" The BMI of the Patient: "+Bmi);
    }
}
