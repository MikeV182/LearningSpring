package com.learning.REST.springRESTApp.dao;

import com.learning.REST.springRESTApp.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("personDAO")
public class PersonDAO {
    private final List<Person> people;
    private static int currentId = 0;

    {
        people = new ArrayList<>();

        people.add(new Person(currentId++, "Vasily"));
        people.add(new Person(currentId++, "Evgeniy"));
        people.add(new Person(currentId++, "Mike"));
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person getPersonById(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(currentId++);
        people.add(person);
    }

}
