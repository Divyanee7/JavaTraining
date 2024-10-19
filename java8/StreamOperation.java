package com.yash.java8;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {

        //to conver array into fixed size list and also it's used to perform the list-based operation.
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //to create numbers as a stream
        Stream<Integer> numberStream=numbers.stream();
        //filter() method used to keep only the elements that match a certain condition.
        //takes predicate as an argument that returns true or false
        //collect is used to collect the result into the stream

        List<Integer> evenNumbers=numberStream.filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Filtered: "+evenNumbers);

        //resetting the stream because we cannot reused the stream
        numberStream=numbers.stream();

        numberStream.map(n->n*n).forEach(System.out::println);

        List<Integer> first5EvenNumbers=Stream.iterate(2,n->n+2).limit(5).collect(Collectors.toList());
        System.out.println("First 5 even numbers are: " +first5EvenNumbers);

        List<Integer> limitedNumbers=numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Numbers: "+limitedNumbers);

        //Reduces the Stream to a single value using an accumulator function.
        //the use of 0 is identity value.if the list empty it simply return the 0 which is logical since the sum of no number is zero
        Integer sum=numbers.stream().reduce(0,Integer::sum);
        System.out.println("The sum is: " +sum);

        //joins all the element into a single string which is separated by delimiter
        String joinedNumbers=numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("joined  numbers: "+joinedNumbers);




    }
}
