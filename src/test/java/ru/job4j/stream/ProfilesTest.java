package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenTest() {
        List<Address> addr = List.of(
                new Address("Fore", "Goolo", 12, 15),
                new Address("Uore", "Polo", 16, 75));

        List<Profile> profiles = List.of(
                new Profile(addr.get(0)),
                new Profile(addr.get(1))
        );

        List<Address> res = List.of(
                new Address("Fore", "Goolo", 12, 15),
                new Address("Uore", "Polo", 16, 75));

        assertThat(Profiles.collectProf(profiles), is(res));
    }

}