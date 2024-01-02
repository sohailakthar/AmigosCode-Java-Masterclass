package com.sohail.M2_Conditionals;

public class Exercise3 {
    public static void main(String[] args) {
        String str1 = new String("Hello!");
        String str2 = new String("Hello!");

        System.out.println("Using ==");
        if(str1 == str2)
            System.out.println("They are equal.");
        else
            System.out.println("They are NOT equal.");

        System.out.println("\nUsing .equals()");
        if(str1.equals(str2))
            System.out.println("They are equal.");
        else
            System.out.println("They are NOT equal.");
    }
}
