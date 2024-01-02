package com.sohail.M5_Scanners;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the input number from the user
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
