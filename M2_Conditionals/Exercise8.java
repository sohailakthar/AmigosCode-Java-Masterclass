package com.sohail.M2_Conditionals;

public class Exercise8 {
    public static void main(String[] args) {
        // Create a String variable
        String word = "Hello, World!";

        // Specify the character to check for (convert to lowercase for case-insensitive check)
        char specifiedCharacter = 'o'; // You can change this character to test different cases

        // Convert the specified character to lowercase for case-insensitive check
        char specifiedCharLowercase = Character.toLowerCase(specifiedCharacter);

        // Use a for loop to check if the specified character is present in the word
        boolean characterFound = false;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            if (currentChar == specifiedCharLowercase) {
                characterFound = true;
                break; // Exit the loop early as soon as the character is found
            }
        }

        // Check if the character was found and print the result
        if (characterFound) {
            System.out.println("The word contains the specified character '" + specifiedCharacter + "' (case-insensitive).");
        } else {
            System.out.println("The word does not contain the specified character '" + specifiedCharacter + "' (case-insensitive).");
        }
    }
}
