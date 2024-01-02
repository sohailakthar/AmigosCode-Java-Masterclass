package com.sohail.M1_LoopsAndArrays;

import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        String[] arr = {"i", "sure", "do", "love", "bees"};

        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }

        System.out.println("Array: " + Arrays.toString(arr));
    }
}
