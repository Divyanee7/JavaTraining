package com.yash.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
class ListExercises {

    public static int countCharacters(List<String> list) {
        int count = 0;
        for (String s : list) {
            count += s.length();
        }
        return count;
    }

    public static List<String> split(String string) {
        if (string.isEmpty()) {
            return Collections.singletonList("");
        }
        return Arrays.asList(string.split("\\s+"));
    }

    public static List<String> uppercased(List<String> list) {
        List<String> uppercasedList = new ArrayList<>();
        for (String s : list) {
            uppercasedList.add(s.toUpperCase());
        }
        return uppercasedList;
    }

    public static boolean allCapitalizedWords(List<String> list) {
        for (String s : list) {
            if (!Character.isUpperCase(s.charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public static List<String> filterContaining(List<String> list, char c) {
        List<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (s.indexOf(c) != -1) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

    public static void insertInOrder(String string, List<String> list) {
        int index = 0;
        while (index < list.size() && list.get(index).compareTo(string) < 0) {
            index++;
        }
        list.add(index, string);
    }
}

public class ListExercisesTest {

    public static void main(String[] args) {
        // Test countCharacters
        List<String> list1 = Arrays.asList("hello", "world", "java");
        System.out.println("Count characters: " + ListExercises.countCharacters(list1));

        // Test split
        String string = "hello world java";
        List<String> list2 = ListExercises.split(string);
        System.out.println("Split string: " + list2);

        // Test uppercased
        List<String> list3 = Arrays.asList("hello", "world", "java");
        List<String> uppercasedList = ListExercises.uppercased(list3);
        System.out.println("Uppercased list: " + uppercasedList);

        // Test allCapitalizedWords
        List<String> list4 = Arrays.asList("Hello", "World", "Java");
        System.out.println("All capitalized words: " + ListExercises.allCapitalizedWords(list4));

        // Test filterContaining
        List<String> list5 = Arrays.asList("hello", "world", "java", "hello world");
        char c = 'o';
        List<String> filteredList = ListExercises.filterContaining(list5, c);
        System.out.println("Filtered list: " + filteredList);

        // Test insertInOrder
        List<String> list6 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        String stringToInsert = "blueberry";
        ListExercises.insertInOrder(stringToInsert, list6);
        System.out.println("Inserted list: " + list6);
    }
}