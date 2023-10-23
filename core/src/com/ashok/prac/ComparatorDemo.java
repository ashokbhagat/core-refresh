package com.ashok.prac;

import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {
            List<Employee> emps = new ArrayList<>();
            emps.add(new Employee("L",10));
            emps.add(new Employee("A",15));
            emps.add(new Employee("M",11));
            emps.add(new Employee("B",8));

            System.out.println(emps);
            Collections.sort(emps , new AgeComparator());
            System.out.println(emps);
    }
}


class AgeComparator implements  Comparator<Employee>{

    public int compare(Employee e1, Employee e2){
        return e1.age.compareTo(e2.age);
    }

}



class Employee{

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

     String name;
     Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
