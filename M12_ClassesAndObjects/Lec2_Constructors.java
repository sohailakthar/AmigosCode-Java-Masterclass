package com.sohail.M12_ClassesAndObjects;

public class Lec2_Constructors {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose", 5);
        Cat star = new Cat("Star");

        // Testing the overridden toString() method.
        System.out.println(rose);
        System.out.println(star.toString());
    }

    static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat(String name) {
            this.name = name;
            this.age = 0;
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
            return "Name: " + this.name + ", Age: " + this.age;
        }
    }
}
