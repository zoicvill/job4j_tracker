package ru.job4j.collection;

import java.util.Objects;

public class Citizen {
    private final String passport;
    private final String name;

    public Citizen(String passport, String name) {
        this.passport = passport;
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen that = (Citizen) o;
        return Objects.equals(passport, that.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
