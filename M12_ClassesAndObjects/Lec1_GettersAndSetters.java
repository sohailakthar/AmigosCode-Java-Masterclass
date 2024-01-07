package com.sohail.M12_ClassesAndObjects;

public class Lec1_GettersAndSetters {
    public static void main(String[] args) {
        Cat rose = new Cat();
        rose.setName("Rose");
        rose.meow();

        Cat star = new Cat();
        star.setName("Star");
        star.meow();

        System.out.println(rose.getName());
        System.out.println(star.getName());
    }
}
