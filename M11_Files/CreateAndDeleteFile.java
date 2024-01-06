package com.sohail.M11_Files;

import java.io.File;
import java.io.IOException;

public class CreateAndDeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/sohail/M11_Files/foo.txt");

            if(!file.exists()) {
                if(file.createNewFile())
                    System.out.println("File created.");
            }

            Thread.sleep(3000);     // Sleep, so file isn't deleted immediately after creation.

            if(file.delete())
                System.out.println("File deleted.");

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
