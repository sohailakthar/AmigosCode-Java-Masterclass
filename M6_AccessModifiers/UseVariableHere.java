package com.sohail.M6_AccessModifiers;
import com.sohail.M6_AccessModifiers.Main;
public class UseVariableHere {
    public static void main(String[] args) {
        System.out.println(Main.pub);       // can be accessed from anywhere
//        System.out.println(Main.pri);     // can be accessed only in same class
        System.out.println(Main.def);       // can be accessed from same package
        System.out.println(Main.prot);      // cannot access from different package

    }
}
