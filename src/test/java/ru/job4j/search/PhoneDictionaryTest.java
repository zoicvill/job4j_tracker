package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByNameFalse() {
        PhoneDictionary p = new PhoneDictionary();
        p.add(
                new Person("inav", "poporev", "8989", "gogopon")
        );
        ArrayList<Person> persons = p.search("potpo");
        assertThat(persons.isEmpty(), is(true));
    }

    @Test
    public void whenFindByNames() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.search("48");
        assertThat(persons.get(0).getLastName(), is("Arsentev"));
    }

}