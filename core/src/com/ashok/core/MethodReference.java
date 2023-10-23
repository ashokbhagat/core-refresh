package com.ashok.core;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("a","b","c");

        names.stream().map(MethodReference::toUpperCase).forEach(System.out::println);
    }

    public static String toUpperCase(String value){
        return value.toUpperCase();
    }
}
