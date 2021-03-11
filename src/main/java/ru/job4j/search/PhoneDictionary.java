package ru.job4j.search;

import ru.job4j.ex.ElementNotFoundException;

import java.util.ArrayList;

public class PhoneDictionary {
    ArrayList<Person> personArr = new ArrayList<>();

    public void add(Person p){
        this.personArr.add(p);
    }

    public ArrayList<Person> search(String key) throws IndexOutOfBoundsException {
        ArrayList<Person> result = new ArrayList<>();

            for (Person person : personArr) {
                if (person.getAddress().contains(key) ||
                        person.getName().contains(key) ||
                        person.getLastName().contains(key)||
                        person.getPhone().contains(key)) {
                    result.add(person);
                }
            }
        return result;
    }
}
