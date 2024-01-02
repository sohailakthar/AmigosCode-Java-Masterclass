package com.sohail.M2_Conditionals;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("Using ==");
        if(str1 == str2)
            System.out.println("They are equal.");
        else
            System.out.println("They are NOT equal.");

        System.out.println("Using .equals()");
        if(str1.equals(str2))
            System.out.println("They are equal.");
        else
            System.out.println("They are NOT equal.");
    }
}
