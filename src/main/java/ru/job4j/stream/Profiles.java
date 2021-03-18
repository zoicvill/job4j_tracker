package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collectProf(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(new AddressComparator())
                .distinct()
                .collect(Collectors.toList());
    }

}
