package com.sohail.M12_ClassesAndObjects;

public class Lec3_InsideConstructors {
    public static void main(String[] args) {
        Cat star = new Cat("Star");
        Cat rose = new Cat("Rose", 5);
        Cat jupiter = new Cat("Jupiter", 3, "Orange");

        // Testing the overridden toString() method.
        System.out.println(rose);
        System.out.println(star);
        System.out.println(jupiter);
    }
}
