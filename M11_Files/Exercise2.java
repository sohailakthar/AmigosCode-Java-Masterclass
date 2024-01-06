package com.sohail.M11_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String path = "src/com/sohail/M11_Files/data.csv";
        File file = new File(path);

        String fileContent = readFile(file);
        System.out.println(fileContent);
    }

    private static String readFile(File file) {
        StringBuilder sb = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return sb.toString();
    }
}
