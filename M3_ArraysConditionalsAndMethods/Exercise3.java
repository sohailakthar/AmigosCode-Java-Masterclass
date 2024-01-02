package com.sohail.M3_ArraysConditionalsAndMethods;

public class Exercise3 {
    public static String findLongestString(String[] array) {
        if (array == null || array.length == 0) {
            return ""; // Return an empty string for empty or null arrays
        }

        String longestString = "";
        int maxLength = 0;

        for (String str : array) {
            if (str != null && str.length() > maxLength) {
                maxLength = str.length();
                longestString = str;
            } else if (str != null && str.length() == maxLength && !longestString.contains(str)) {
                longestString += ", " + str;
            }
        }

        return longestString;
    }

    public static void main(String[] args) {
        String[] array1 = {};
        String[] array2 = {"hello", "ola", "bye", "ciao"};
        String[] array3 = {"hello", "hello", "ola", "bye", "ciao"};
        String[] array4 = {"hello", "bingo", "ola", "bye", "ciao"};

        System.out.println("Longest string in array1: \"" + findLongestString(array1) + "\"");
        System.out.println("Longest string in array2: \"" + findLongestString(array2) + "\"");
        System.out.println("Longest string in array3: \"" + findLongestString(array3) + "\"");
        System.out.println("Longest string in array4: \"" + findLongestString(array4) + "\"");
    }
}
