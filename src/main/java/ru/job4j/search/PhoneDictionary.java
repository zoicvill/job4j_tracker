package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person p) {
        this.persons.add(p);
    }

    public ArrayList<Person> search(String key) {
        Predicate<Person> name = pes -> pes.getName().contains(key);
        Predicate<Person> lastName = pes -> pes.getLastName().contains(key);
        Predicate<Person> phone = pes -> pes.getPhone().contains(key);
        Predicate<Person> address = pes -> pes.getAddress().contains(key);
        Predicate<Person> combine = name.or(lastName.or(phone.or(address)));

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
