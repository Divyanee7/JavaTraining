package com.yash.training;

class StringUtils
{
    public String generatePassword(String firstName,String lastName,String yob)
    {
        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        yob=yob.toLowerCase();

        String firstPart=firstName.substring(3,4); //IT will get third to third character it will excluded the last one character

        String secondPart=lastName.substring(1,4);//Start from 1st end on 3rd

        String year=yob.substring(2,4);

        return firstPart+secondPart+year; //used to combine and to form the generated password

    }
}

public class _19_7_GeneratePassword {

    public static void main(String[] args) {
        StringUtils str=new StringUtils();
        String generatedPass=str.generatePassword("Jaynam","Sanghvi","1991");
        System.out.println("The Generated Password for the user is: "+generatedPass);
    }
}
