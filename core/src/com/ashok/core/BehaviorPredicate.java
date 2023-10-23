package com.ashok.core;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorPredicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 3, 45, 1, 6, 8, 9);

        Predicate<Integer> evenPredicate = e -> e%2 == 0;
        Predicate<Integer> oddPredicate = e -> e%2 != 0;

        filterAndPrint(numbers, e -> e%2 == 0);
        filterAndPrint(numbers, e -> e%2 != 0);
    }

    public static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate){
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);

    }

}
