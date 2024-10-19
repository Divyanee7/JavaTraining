package com.yash.java8;
import java.util.*;
import java.util.List;

public class AssignmentWithoutJava8 {

    public static List<Person> createPeople()
    {
        return Arrays.asList(
                new Person("Pankaj",42,"Male"),
                new Person("Manvi",6,"Female"),
                new Person("Jaynam",32,"Male"),
                new Person("Bindu",26,"Female"),
                new Person("Kabir",46,"Male"),
                new Person("Divyanee",22,"Female")
        );
    }

    public static void main(String[] args) {
        List<Person> people=createPeople();
        List<String> femaleNames=new ArrayList<>();
        for(Person person: people)
        {
            if(person.getGender().equals("Female") && person.getAge()>6)
            {
                femaleNames.add(person.getName().toUpperCase());
            }
        }
        System.out.println(femaleNames);
    }
}
