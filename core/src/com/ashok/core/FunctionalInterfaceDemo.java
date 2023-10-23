package com.ashok.core;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 3, 45, 1, 6, 8, 9);


        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer e) {
                return e % 2 == 0;
            }
        };

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer e) {
                return e * e;
            }
        };

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer e) {
                System.out.println(e);
            }
        };


        numbers.stream()
                .filter(isEven)
                .map(e -> e * e)
                .forEach(consumer);

    }
}
