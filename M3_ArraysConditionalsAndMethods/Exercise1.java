package com.sohail.M3_ArraysConditionalsAndMethods;

public class Exercise1 {
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return the input as is for empty or null strings
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test the reverseString method with sample input
        String input = "Hello, World!";
        String reversedInput = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversedInput);
    }
}
