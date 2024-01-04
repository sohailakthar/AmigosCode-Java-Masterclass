package com.sohail.M10_ExceptionHandling;

public class Exercise1 {
    public static void main(String[] args) {
        int result = 0;
        StringBuilder sb = new StringBuilder();

        for(String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                result += num;
            } catch (NumberFormatException e) {
                if(sb.length() > 0)
                    sb.append(", ");
                sb.append(arg);
            }
        }

        System.out.println("Sum: " + result);
        System.out.println("Non-Integers: " + sb.toString());
    }
}
