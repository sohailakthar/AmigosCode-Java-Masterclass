package com.sohail.LoopsAndArrays;

import java.util.Arrays;

public class Exercise12 {
    public static void main(String[] args) {
        String[] arr = {"i", "sure", "do", "love", "bees"};

        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        System.out.println("Array: " + Arrays.toString(arr));
    }
}
