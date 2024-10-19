package com.yash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentWithJava8Lambda {
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

        List<String> femaleNames=people.stream().filter(person -> person.getGender().equals("Female") && person.getAge()>6)
                .map(person -> person.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println(femaleNames);
    }
}
