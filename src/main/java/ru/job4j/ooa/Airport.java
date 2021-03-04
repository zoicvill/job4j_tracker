package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine(airbus.getName());
        System.out.println();

        airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printCountEngine(airbus.getName());
        airbus.setName("A380");
        System.out.println(airbus);
    }
}
