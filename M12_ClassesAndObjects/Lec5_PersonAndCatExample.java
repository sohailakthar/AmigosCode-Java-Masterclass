package com.sohail.M12_ClassesAndObjects;

import com.sohail.M12_ClassesAndObjects.Cat.Cat;
import com.sohail.M12_ClassesAndObjects.Person.Gender;
import com.sohail.M12_ClassesAndObjects.Person.Person;

public class Lec5_PersonAndCatExample {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose", 3, "White");
        Cat mini = new Cat("Mini", 2, "Black");

        Cat[] cats = new Cat[] {rose, mini};

        Person peter = new Person("Peter", "Parker", Gender.MALE);
        Person emma = new Person("Emma", "Watson", Gender.FEMALE, cats);

        System.out.println(peter.toString());
        System.out.println(emma.toString());
    }
}
