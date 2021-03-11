package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;


    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findByName(String key) {
        List<Item> findItems = new ArrayList<>();
        for (Item value : items) {
            if (value.getName().equals(key)) {
                findItems.add(value);
            }
        }
        return findItems;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return items;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean b = index != 1;
        if (b) {
            items.set(index, item);
            item.setId(id);
        }
        return b;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean b = index != 1;
        if (b) {
            items.remove(index);
        }
        return b;
    }
}