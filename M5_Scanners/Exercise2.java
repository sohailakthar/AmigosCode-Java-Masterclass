package com.sohail.M5_Scanners;

public class Exercise2 {
    public static void main(String[] args) {
        // Check if the program was run with arguments
        if (args.length == 0) {
            System.out.println("Please provide numbers as program arguments.");
            return;
        }

        // Iterate through each argument and check if it's even or odd
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer.");
            }
        }
    }
}
