package com.sohail.M11_Files;

import java.io.File;

public class Exercise5 {
    public static void main(String[] args) {
        String path = "src/com/sohail/M11_Files/data.csv";
        File file = new File(path);
        System.out.println(file.length() + " Bytes");
        System.out.println(file.getAbsolutePath());
    }
}
