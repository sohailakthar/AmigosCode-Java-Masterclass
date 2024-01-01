package com.sohail.LoopsAndArrays;

import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
        String[] arr = {"you", "are", "how", "hello"};

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
            if(i != 0)
                System.out.print(" ");
        }

        System.out.println("?");
    }
}
