package com.sohail.M12_ClassesAndObjects.Person;

public class PersonService {
    PersonDAO personDao;

    public PersonService() {
        this.personDao = new PersonDAO();
    }

    public int addPerson(Person person) {
        if(person.getFirstName().isBlank()) {
            throw new IllegalArgumentException("First Name cannot be blank.");
        }

        // Store person to DB.
        personDao.savePerson(person);
        return 1;   // meaning success
    }

    public Person[] getAllPersons() {
        return personDao.getAllPersons();
    }
}
