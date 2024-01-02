package com.sohail.M2_Conditionals;

public class Exercise7 {
    public static void main(String[] args) {
        // Create a String variable
        String myString = "Hello, World!";

        // Specify the character to check for
        char specifiedCharacter = 'H'; // You can change this character to test different cases

        // Check if myString starts with the specifiedCharacter
        if (myString.charAt(0) == specifiedCharacter) {
            System.out.println("The string starts with the specified character '" + specifiedCharacter + "'.");
        } else {
            System.out.println("The string does not start with the specified character '" + specifiedCharacter + "'.");
        }
    }
}
