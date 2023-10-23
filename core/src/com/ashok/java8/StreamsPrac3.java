package com.ashok.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamsPrac3 {
    public static void main(String[] args) {
        //sample13();
        //sample14();
        //sample15();
        sample23();
    }


    public static void sample24() {
        //24	Given a list of integers, find the maximum value less than 100 using Java Streams.
        IntStream.rangeClosed(1, Integer.MAX_VALUE).filter(e->e%2==0)
                .limit(500);

    }

    public static void sample23() {
        //23	Write a Java Stream to find the third to sixth elements of a list of strings.
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10)
                .skip(2)
                .limit(4)
                .forEach(System.out::println);
    }

    public static void sample20() {
        //20	Write a Java Stream to find the first 5 elements of a list of integers.
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10)
                .limit(5).forEach(System.out::println);
    }

    public static void sample16() {
        //16 : Given a list of integers, find the average of the square of each number using Java Streams.
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10)
                .map(e -> e*e)
                .average();
    }

    public static void sample15() {
        //15 Write a Java Stream to find the longest string in a list of strings
        List<String> names = Arrays.asList("abc", "z", "m", "a", "kdmmgmg","k","k");
        System.out.println(
                names.stream()
                        .max(Comparator.comparing(e -> e.length()))
        );
    }

    public static void sample14() {
        // 14 How do you check if a list of strings contains a specific substring using Java Streams?
        List<String> names = Arrays.asList("abc", "z", "m", "a", "k","k","k");
        System.out.println(
                names.stream()
                        .anyMatch(e -> e.contains("aa")));
    }

    public static void sample13() {
        //13	Given a list of strings, count the number of occurrences of a specific character using Java Streams.
        List<String> names = Arrays.asList("a", "z", "m", "a", "k","k","k");
        System.out.println(
                names.stream()
                .flatMap(e -> e.chars().mapToObj( c -> (char )c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    }
    public static void sample11() {
        // 11 Given a list of strings, concatenate them all into a single string using Java Streams.
        List<String> names = Arrays.asList("a", "z", "m", "a", "k");
        System.out.println(names.stream().reduce((x, y) -> x + y));
    }




//            24	Given a list of integers, find the maximum value less than 100 using Java Streams.
//25	How do you check if none of the elements in a list of strings are empty using Java Streams?
//            26	Write a Java Stream to find the sum of the squares of even numbers in a list of integers.
//27	Given a list of strings, remove all strings with a length greater than 10 using Java Streams.
//28	How do you check if a list of strings contains at least one palindrome using Java Streams?
//            29	Write a Java Stream to find the distinct characters in a list of strings.
//            30	Given a list of integers, find the product of the square of each number using Java Streams.
//            31	How do you check if a list of strings contains only numeric values using Java Streams?
//            32	Write a Java Stream to filter out all strings that are null or empty.
//            33	Given a list of strings, find the average length of the strings using Java Streams.
//            34	How do you check if all elements in a list of integers are positive using Java Streams?
//            35	Write a Java Stream to find the second smallest element in a list of integers.
//36	Given a list of strings, find the number of strings that have a length of 7 using Java Streams.
//37	How do you check if any element in a list of doubles is NaN using Java Streams?
//            38	Write a Java Stream to find the maximum length among strings that start with a vowel in a list of strings.
//39	Given a list of integers, find the sum of all odd numbers using Java Streams.
//            40	How do you check if none of the strings in a list contain a specific character using Java Streams?
//            41	Write a Java Stream to filter out all strings with a length between 5 and 10 (inclusive).
//            42	Given a list of strings, find the number of strings that contain the letter 'a' using Java Streams.
//43	How do you check if a list of integers contains duplicates using Java Streams?
//            44	Write a Java Stream to find the second to last element in a list of strings.
//            45	Given a list of doubles, find the average of the absolute values using Java Streams.
//            46	How do you check if all elements in a list of strings are non-null using Java Streams?
//            47	Write a Java Stream to remove all whitespace from a list of strings.
//48	Given a list of integers, find the sum of all positive numbers using Java Streams.
//            49	How do you check if any element in a list of strings is an empty string using Java Streams?
//            50	Write a Java Stream to find the longest string that starts with a consonant in a list of strings.
}
