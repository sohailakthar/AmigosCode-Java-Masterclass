package com.sohail.M10_ExceptionHandling;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. " + e);
        }

    }
}
