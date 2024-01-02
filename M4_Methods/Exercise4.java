package com.sohail.M4_Methods;

public class Exercise4 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        compareNumbers(num1, num2);
    }

    public static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("The first number is larger");
        } else if (a < b) {
            System.out.println("The second number is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
