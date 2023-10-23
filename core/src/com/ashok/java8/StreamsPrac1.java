package com.ashok.java8;

import java.util.*;
import java.util.stream.IntStream;

public class StreamsPrac1 {
    public static void main(String[] args) {
        //sample1();
        //sample2();
        // sample3();
        //sample4();
        sample5();

    }

    private static void sample5() {
        //5	Write a Java Stream to find the average of a list of doubles.
        List<Double> values = Arrays.asList(3.14, 2.71, 1.618, 0.577, 4.669);
        System.out.println(values.stream().mapToDouble(e -> e.doubleValue()).average().getAsDouble());
    }

    private static void sample4() {
        //4	Given a list of strings, filter out all strings with a length less than 5 using Java Streams.
        List<String> names = Arrays.asList("abc", "bkfkdkdfnkfn", "ca");
        names.stream()
                .filter(e -> e.length() < 5)
                .forEach(System.out::println);
    }

    private static void sample3() {
        //3	Write a Java Stream to convert a list of strings to uppercase
        List<String> names = Arrays.asList("a", "b", "c");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void sample2() {
        // 2	How do you find the maximum value in a list of integers using Java Streams?
        OptionalInt max = IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10)
                .max();
        if (max.isPresent()) {
            System.out.println("Max is " + max.getAsInt());
        } else {
            System.out.println("No value");
        }

    }

    private static void sample1() {
        //1	Given a list of integers, find the sum of all elements using Java Streams.
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .limit(10)
                .forEach(System.out::println);

        System.out.println(
                IntStream.rangeClosed(1, Integer.MAX_VALUE)
                        .limit(10)
                        .reduce(0, (x, y) -> x + y));
        ;

    }
}
