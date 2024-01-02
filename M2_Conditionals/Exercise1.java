package com.sohail.M2_Conditionals;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2)
            System.out.println("They are equal.");
        else
            System.out.println("They are NOT equal.");
    }
}
