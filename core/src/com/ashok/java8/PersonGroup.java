package com.ashok.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGroup {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Doe"),
                new Person("Jane", "Smith"),
                new Person("Michael", "Johnson"),
                new Person("Emily", "Brown"),
                new Person("David", "Williams"),
                new Person("Sarah", "Johnson")
        );

        // Group by last name using Java Stream
        Map<String, Long> lastNameCounts = people.stream()
                .collect(Collectors.groupingBy(Person::getLastName, Collectors.counting()));

        people.stream()
                .collect(Collectors.groupingBy(Person::getLastName, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + "" + value));


        // Print the results
        lastNameCounts.forEach((lastName, count) -> {
            System.out.println("Last Name: " + lastName + ", Count: " + count);
        });
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters (optional, depending on your use case)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


