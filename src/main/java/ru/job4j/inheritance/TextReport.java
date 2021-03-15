package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String text) {
        return name + System.lineSeparator() + text;
    }
}
