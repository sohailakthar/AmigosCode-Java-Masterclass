package com.sohail.M11_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String path = "src/com/sohail/M11_Files/data.csv";
        File file = new File(path);

        readFile(file);
    }

    private static void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
