package com.yash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AssignmentWithJava8Predicate {
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
        Predicate<Person> femaleOlderThan6=person -> person.getGender().equals("Female") && person.getAge()>6;
        Function<Person,String> nameToUpper=person -> person.getName().toUpperCase();

        List<String> femaleNames=people.stream().filter(e->e.getGender().equals("Female") && e.getAge()>6).map(e-> e.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println(femaleNames);
    }
}
