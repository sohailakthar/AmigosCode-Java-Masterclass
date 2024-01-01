package com.sohail.LoopsAndArrays;
import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d"};

        String[] arr2 = Arrays.copyOf(arr1, arr1.length);

        arr2[0] = "z";

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("New Array: " + Arrays.toString(arr2));

        System.out.println("Only the new array has been changed!");


        // Trying with length less or more, in the argument of Arrays.copyOf()
        String[] arr3 = Arrays.copyOf(arr1, 2);     // Values beyond the length are removed
        String[] arr4 = Arrays.copyOf(arr1, 5);     // Default values are stored in extra place

        System.out.println("Less Length: " + Arrays.toString(arr3));
        System.out.println("More Length: " + Arrays.toString(arr4));

    }
}
