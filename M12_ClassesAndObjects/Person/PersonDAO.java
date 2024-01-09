package com.sohail.M12_ClassesAndObjects.Person;

public class PersonDAO {
    private static Person[] persons;   // Let's use this instead of a db for now
    private static int CAPACITY = 5;
    private static int nextAvailableIndex = 0;

    static {
        persons = new Person[CAPACITY];
    }

    public void savePerson(Person person) {
        if(nextAvailableIndex + 1 >= CAPACITY) {
            // Grow DB... Size of array in our case
        }

        persons[nextAvailableIndex++] = person;
    }

    public Person[] getAllPersons() {
        return persons;
    }
}
