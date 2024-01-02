package com.sohail.M4_Methods;

public class Exercise5 {
    public static void main(String[] args) {
        String inputString = "hello world";
        String capitalizedString = capitalizeFirstLetter(inputString);
        System.out.println(capitalizedString);
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Split the first letter from the rest of the string
        String firstLetter = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1);

        // Join the capitalized first letter with the rest of the string
        return firstLetter + restOfString;
    }
}
