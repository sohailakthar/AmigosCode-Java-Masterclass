package com.sohail.M4_Methods;

public class Exercise3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int num3 = 10;

        boolean result1 = areNumbersEqual(num1, num2);
        boolean result2 = areNumbersEqual(num1, num3);

        System.out.println(num1 + " and " + num2 + " are equal: " + result1);
        System.out.println(num1 + " and " + num3 + " are equal: " + result2);
    }

    public static boolean areNumbersEqual(int a, int b) {
        return a == b;
    }
}
