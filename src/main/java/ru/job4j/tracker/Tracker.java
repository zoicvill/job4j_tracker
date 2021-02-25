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
        Item[] findItems = new Item[size];
        int digit = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                findItems[digit] = items[i];
                digit++;
            }
        }
        return Arrays.copyOf(findItems, digit);
    }

    public Item findById(int id) {
        int ind = indexOf(id);
        return ind != -1 ? items[ind] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int i = indexOf(id);
        if (i == -1) {
            return false;
        }
        items[i] = item;
        items[i].setId(id);
        return true;
    }

    public boolean delete(int id) {
        int i = indexOf(id);
        if (i == -1) {
            return false;
        }
        System.arraycopy(items, i + 1, items, i, size - i - 1);
        items[size - 1] = null;
        size--;
        return true;
    }
}