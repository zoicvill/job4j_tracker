package ru.job4j.oop;

public class Fix {
    private final String desc;

    public Fix(String text) {
        this.desc = text;
    }

    public static void main(String[] args) {
        Fix fix = new Fix("New fix");
    }

}
