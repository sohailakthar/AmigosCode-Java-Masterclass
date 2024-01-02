package com.sohail.M1_LoopsAndArrays;
import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d"};

        String[] arr2 = arr1;

        arr2[0] = "z";

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("New Array: " + Arrays.toString(arr2));

        System.out.println("Both the arrays have been changed! Because arrays are reference types.");
    }
}
