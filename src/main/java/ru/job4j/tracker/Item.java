package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private final LocalDateTime created = LocalDateTime.now();
    private int id;
    private String name;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String iName) {
        this.id = id;
        this.name = iName;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Item " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" +
                created.format(DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy HH:mm:ss"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

