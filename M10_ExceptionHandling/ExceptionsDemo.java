package com.sohail.M10_ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        // Checked/Compile Time Exceptions: Exceptions checked for, during compile time. Cannot run before fixing(try or throws).
        // Unchecked/Run Time Exceptions: Exceptions checked for, at run time. Can run.


        // Checked. Ex: File i.e IOException
        // If we remove the try-catch block, the program won't compile/run.
        try {
            File file = new File("src/com/sohail/M10_ExceptionHandling/foo.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created!");
            } else {
                System.out.println("File exists!");
            }
        } catch (IOException e) {
            System.out.println(e);
        }


        // Unchecked. Ex: Divide by zero i.e ArithmeticException
        // We can compile/execute the program without the try-catch block. Program will abruptly terminate at run time.
        System.out.println(10/0);
    }
}
