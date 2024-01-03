package com.sohail.M8_Enum;

public class Exercise1 {
    enum TshirtSizes {S, M, L, XL, XXL}

    public static void main(String[] args) {
        TshirtSizes size = TshirtSizes.M;
        System.out.println("Selected size is: " + size);
    }
}
