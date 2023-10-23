package com.ashok.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;


public class StreamsPrac2 {

    public static void main(String[] args) {
        //sample6();
        //sample7();
        //sample8();
        //sample9();
        sample10();
    }


    private static void sample10() {
        //10	Write a Java Stream to filter out all even numbers from a list of integers.
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10).filter(e -> e%2==0).forEach(System.out::println);
    }

    private static void sample9() {
        //9	How do you sort a list of strings in ascending order using Java Streams?
        List<String> names = Arrays.asList("a", "z", "m","a","k");
        names.stream()
                .sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    private static void sample8() {
        //8	Given a list of integers, find the square of each number using Java Streams.
        List<String> names = Arrays.asList("a", "b", "c","a","b");
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10)
                .map(e -> e*e).forEach(System.out::println);
    }

    private static void sample7() {
        //7	Write a Java Stream to remove all duplicates from a list of strings.
        List<String> names = Arrays.asList("a", "b", "c","a","b");
        names.stream().distinct().forEach(System.out::println);

    }

    private static void sample6() {
        //6	Given a list of integers, find the product of all elements using Java Streams
        System.out.println(
                IntStream.rangeClosed(1, Integer.MAX_VALUE)
                        .limit(10)
                        .reduce(1, (x, y) -> x * y));
    }
}
