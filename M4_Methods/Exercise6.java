package com.sohail.M4_Methods;

public class Exercise6 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        int size = getArraySize(names);
        System.out.println("Number of items in the array: " + size);
    }

    public static int getArraySize(String[] arr) {
        return arr.length;
    }
}
