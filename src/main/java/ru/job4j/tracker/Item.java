package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {

    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String iName) {
        this.id = id;
        this.name = iName;
    }

}