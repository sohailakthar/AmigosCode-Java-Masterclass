package com.sohail.M11_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String path = "src/com/sohail/M11_Files/foo.txt";
        File file = new File(path);
        String longestWord = "";

        try {
            if(!file.exists()) {
                System.out.println("The file doesn't exist.");
                return;
            }

            Scanner sc = new Scanner(file);

            while(sc.hasNext()) {
                String word = sc.next();
                if(word.length() > longestWord.length())
                    longestWord = word;
            }

            System.out.println("Longest word in given file is: " + longestWord);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
