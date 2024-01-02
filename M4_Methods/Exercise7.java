package com.sohail.M4_Methods;

public class Exercise7 {
    public static void main(String[] args) {
        String sentence = "Hello, this is a sample sentence.";

        int wordCount = countWordsInSentence(sentence);
        System.out.println("The sentence contains " + wordCount + " words.");
    }

    public static int countWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Return the number of words in the sentence
        return words.length;
    }
}
