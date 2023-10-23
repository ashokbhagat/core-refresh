package com.ashok.prac;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial :" + fact(5));
    }

    private static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {

            return n * fact(n - 1);
        }


    }

}
