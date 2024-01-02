package com.sohail.M5_Scanners;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What do you call fake spaghetti? An impasta!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the math book sad? It had too many problems.",
                "Why did the bicycle fall over? Because it was two-tired!",
                "Why don't some fish play piano? You can't tuna fish!"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Want to hear a joke? (Yes/No): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("no")) {
                System.out.println("Alright, goodbye!");
                break;
            } else if (input.equals("yes")) {
                int randomNumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);
            } else {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        }

        scanner.close();
    }
}
