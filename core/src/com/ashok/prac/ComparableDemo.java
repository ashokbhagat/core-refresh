package com.ashok.prac;

import java.util.*;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("L",10));
        students.add(new Student("A",15));
        students.add(new Student("M",11));
        students.add(new Student("B",8));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}


class Student implements  Comparable<Student>{

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public  int compareTo(Student obj){
        return this.name.compareTo(obj.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
