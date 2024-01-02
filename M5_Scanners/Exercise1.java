package com.sohail.M5_Scanners;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string from the user
        String inputString = scanner.nextLine();

        // Convert the string to upper case
        String upperCaseString = inputString.toUpperCase();

        // Print the string in upper case
        System.out.println("String in upper case: " + upperCaseString);

        // Close the scanner
        scanner.close();
    }
}
