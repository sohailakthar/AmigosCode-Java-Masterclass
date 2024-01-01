package com.sohail.LoopsAndArrays;

public class Exercise15 {
    public static void main(String[] args) {
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0.0;

        String[] splitedInputs = input.split(", ");

        for(String s : splitedInputs) {
            result += Double.parseDouble(s);
        }

        System.out.println("Total: " + result);
    }
}
