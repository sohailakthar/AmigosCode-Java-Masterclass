package com.sohail.M6_AccessModifiers;

public class Main {
    public static String pub = "I'm a public variable";
    private static String pri = "I'm a private variable";
    protected static String prot = "I'm a protected variable";

    static String def = "I'm a default variable";

    public static void main(String[] args) {
        String pub = "Changed";

        System.out.println(pub);    // Changed
    }
}
