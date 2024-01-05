package com.sohail.BigDecimalDemo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.03-0.02);      // Prints 0.009999999999999998, instead of 0.01

        /*
        Floating-point numbers are an approximation to the mathematical idea of real numbers.
        Since a floating-point number has only a fixed number of bits, it has only a fixed accuracy.
        This is not a Java-specific problem. It happens with any programming language that uses IEEE 754 floating point numbers.

        If you want to do arbitrary precision calculations, use java.math.BigDecimal instead of double.
         */

        BigDecimal number1 = new BigDecimal("0.03");    // Put it in ""
        BigDecimal number2 = new BigDecimal("0.02");
        System.out.println(number1.subtract(number2));

        //Working with BigDecimal
        BigDecimal num = BigDecimal.TEN;
        System.out.println(num.add(BigDecimal.ONE));

        System.out.println(num.max(BigDecimal.ZERO));

        System.out.println(num.compareTo(BigDecimal.ONE));
        System.out.println(num.compareTo(new BigDecimal("15")));
        System.out.println(num.compareTo(BigDecimal.TEN));


    }
}
