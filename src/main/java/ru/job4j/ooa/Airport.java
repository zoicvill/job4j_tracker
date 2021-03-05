package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        Airbus airbus = new Airbus();
        airbus.setName("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine(airbus.getName());
        System.out.println("---------");

        airbus = new Airbus();
        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine(airbus.getName());
    }
}
