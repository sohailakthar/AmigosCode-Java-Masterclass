package com.sohail.M3_ArraysConditionalsAndMethods;

public class Exercise2 {
    public static String transformString(String input) {
        if (input == null || input.isEmpty()) {
            return ""; // Return an empty string for empty or null input
        }

        String[] words = input.trim().split("\\s+"); // Remove leading/trailing spaces and split into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word);
            }
        }
        result.replace(0, 1, result.substring(0, 1).toUpperCase());

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "   amig os cod e  ";
        String transformedString = transformString(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Transformed: \"" + transformedString + "\"");
    }
}
