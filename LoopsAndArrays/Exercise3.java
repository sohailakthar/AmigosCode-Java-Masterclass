package com.sohail.LoopsAndArrays;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        Arrays.fill(arr, 4);

        arr[1] = 17;

        System.out.println(Arrays.toString(arr));
    }
}
