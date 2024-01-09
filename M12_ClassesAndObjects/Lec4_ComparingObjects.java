package com.sohail.M12_ClassesAndObjects;

import com.sohail.M12_ClassesAndObjects.Cat.Cat;

public class Lec4_ComparingObjects {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Rose", 3, "Yellow");
        Cat cat2 = new Cat("Rose", 3, "Yellow");

        System.out.println("Using == : " + (cat1 == cat2));
        System.out.println("Using equals : " + (cat1.equals(cat2)));    // false. But we can override the equals() method.
    }
}
