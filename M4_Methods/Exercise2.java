package com.sohail.M4_Methods;

public class Exercise2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -10;

        int negation1 = negate(num1);
        int negation2 = negate(num2);

        System.out.println("Negation of " + num1 + " is: " + negation1);
        System.out.println("Negation of " + num2 + " is: " + negation2);
    }

    public static int negate(int num) {
        return -num;
    }
}
