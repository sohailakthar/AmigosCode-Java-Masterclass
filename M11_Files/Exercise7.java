package com.sohail.M11_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise7 {
    public static void main(String[] args) {
        String file1 = "src/com/sohail/M11_Files/data.csv";
        String file2 = "src/com/sohail/M11_Files/dataCopied.csv";

        try (
                FileInputStream input = new FileInputStream(file1);
                FileOutputStream output = new FileOutputStream(file2);
        ) {
            int byteVal;
            while((byteVal = input.read()) != -1) {
                output.write(byteVal);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
