package com.sohail.M10_ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class ThrowAndThrows {
    public static void main(String[] args) {
        // Unchecked Exception.
        System.out.println(divide(10, 2));

        // Checked Exception. The method instead of handling exception, threw it for user method to handle. So we use try-catch here.
        try {
            System.out.println(createIfAbsent("src/com/sohail/M10_ExceptionHandling/foo.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // Unchecked Exception.
    private static double divide(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Cannot divide by Zero.");
        }

        return a / b;
    }


    // Checked Exception. Here, instead of handling exception, we're throwing(throws) it for someone else to handle.
    private static String createIfAbsent(String filename) throws IOException {
        File file = new File(filename);
        if(!file.exists()) {
            file.createNewFile();
            return "Created!";
        }
        return "Exists!";
    }
}
