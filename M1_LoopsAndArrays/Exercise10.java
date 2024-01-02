package com.sohail.M1_LoopsAndArrays;

import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        int[] arr = new int[11];

        for(int i=0; i<=10; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
