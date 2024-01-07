package com.sohail.M12_ClassesAndObjects;

import java.util.Arrays;
import java.util.Objects;

// POJOs - Plain Old Java Object
// Objects/Class that doesn't depend on any framework ie. it doesn't extend/implement something else.
// They have no dependencies on other frameworks.
// The below class, Person and also Cat class are examples of POJO
public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cats;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, Gender gender, Cat[] cats) {
        this(firstName, lastName, gender);
        this.cats = cats;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Arrays.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender);
        result = 31 * result + Arrays.hashCode(cats);
        return result;
    }
}
