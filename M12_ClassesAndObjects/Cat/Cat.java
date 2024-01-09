package com.sohail.M12_ClassesAndObjects.Cat;

import java.util.Objects;

public class Cat {
    private int age;
    private String name;
    private String color;

    public Cat() { }    // Default Constructor.

    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }

    // The Inside Constructors.
    public Cat(String name, int age) {
        this(name);     // Doing this, instead of the below line. We're calling previous constructor -> public Cat(String name)
//            this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color) {
        this(name, age);        // Using a predefined constructor with specified arguments, instead of writing again.
        this.color = color;
    }

    public void meow() {
        System.out.println(name + ": meow...");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Color: " + this.color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color);
    }
}
