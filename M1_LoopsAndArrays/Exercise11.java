package com.sohail.M1_LoopsAndArrays;

public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}
