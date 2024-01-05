package com.sohail.M10_ExceptionHandling;

public class MyCustomExceptionsMain {
    public static void main(String[] args) {
        System.out.println(divideUnchecked(10, 0));

        try {
            System.out.println(divideChecked(10, 0));
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }
    }

    private static int divideUnchecked(int a, int b) {
        if(b == 0) {
            throw new MyUncheckedException("Cannot Divide by Zero.");
        }

        return a/b;
    }

    private static int divideChecked(int a, int b) throws MyCheckedException {
        if(b == 0) {
            throw new MyCheckedException("Cannot Divide by Zero.");
        }

        return a/b;
    }
}
