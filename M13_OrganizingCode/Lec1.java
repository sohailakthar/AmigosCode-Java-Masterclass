package com.sohail.M13_OrganizingCode;

import com.sohail.M12_ClassesAndObjects.Person.Gender;
import com.sohail.M12_ClassesAndObjects.Person.Person;
import com.sohail.M12_ClassesAndObjects.Person.PersonService;

import java.util.Arrays;

public class Lec1 {
    public static void main(String[] args) {
        /*
        Organize code into:-
        1. Packages:
            - Refers to folder containing related classes and files. Ex: person package including the Person, Address class and Gender enum etc

        2. Domain/Models:
            - Refers to POJO (Plain Old Java Object), classes/objects not related to business logic. Ex: Car class

        3. Services classes/Business logic:
            - They are the main meat of our backend. They define business logic. Ex: PersonService class in previous package (M12_ClassesAndObjects), as it defines business logic, when to add or not a person to DB.

        4. DAO (Data Access Object):
            - They are responsible for interacting with database or store. Handles how data is stored. Ex: PersonDAO, consisting of methods taking care of storage

        5. Controllers / REST API
            - The Controller/API/Main class from where the client sends requests & receives response. Ex: Below we've implemented this class as the Controller by making Person object then sending request to store it, and retrieve it.

        6. Utility Classes:
            - The classes which can be used by every other package.
         */


        Person person = new Person("Sohail", "Akthar", Gender.MALE);

        PersonService personService = new PersonService();

        personService.addPerson(person);

        System.out.println(Arrays.deepToString(personService.getAllPersons()));
    }
}
