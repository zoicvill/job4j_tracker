package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenTest() {
        List<Address> addr = Stream.of(
                new Address("Fore", "Goolo", 12, 15),
                new Address("Uore", "Polo", 16, 75))
                .collect(Collectors.toList());

        List<Profile> profiles = Stream.of(
                new Profile(addr.get(0)),
                new Profile(addr.get(1))
        ).collect(Collectors.toList());

        List<Address> res = Stream.of(
                new Address("Fore", "Goolo", 12, 15),
                new Address("Uore", "Polo", 16, 75))
                .collect(Collectors.toList());
        
        assertThat(Profiles.collectProf(profiles), is(res));
    }

}