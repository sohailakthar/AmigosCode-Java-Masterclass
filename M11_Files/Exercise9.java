package com.sohail.M11_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        String path = "src/com/sohail/M11_Files/foo.txt";
        File file = new File(path);

        List<String> fileContent = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                fileContent.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(String s : fileContent)
            System.out.println(s);
    }
}
