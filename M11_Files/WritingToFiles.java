package com.sohail.M11_Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws InterruptedException {
        String path = "src/com/sohail/M11_Files/foo.txt";

        File file = createFile(path);

        String message1 = "Hello World";
        String message2 = "I had a pen, I had an apple, Ah! Apple Pen!";
        String message3 = "With great powers come great responsibilities.";

        writeToFile(path, message1, true);
        writeToFile(path, message2, true);
        writeToFile(path, message3, true);
    }

    private static File createFile(String path) {
        File file = null;
        try {
            file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return file;
    }

    private static void writeToFile(String path, String text, boolean append) {
        // Instead of having to write flush() and close(), we can use 'try with resources'.
        // Anything that implements 'closeable' and 'flushable' can use 'try with resources'.
        // In our case, FileWriter implements 'closeable' and 'flushable'.
        try {
            FileWriter fileWriter = new FileWriter(path, append);   // append=false overwrites the file. append=true appends the new content to end of file.
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Notice 'try()' instead of just 'try'.
    // This is 'try with resources'.
    // Here we don't have to 'flush' or 'close', everything is taken care of.
    private static void writeTryWithResources(String path, String text, boolean append) {
        try(
                FileWriter fileWriter = new FileWriter(path, append);
                PrintWriter writer = new PrintWriter(fileWriter);
        ) {
            writer.println(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
