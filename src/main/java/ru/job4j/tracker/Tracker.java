package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findByName(String key) {
        Item[] items = new Item[size];
        int digit = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                items[digit] = items[i];
                digit++;
            }
        }
        return Arrays.copyOf(items,digit);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
    public Item[] findAll() {
        Item [] bufIt = new Item[size];
        int resize = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                bufIt[resize] = item;
                resize++;
            }
        }
        return Arrays.copyOf(bufIt, resize);
    }
}