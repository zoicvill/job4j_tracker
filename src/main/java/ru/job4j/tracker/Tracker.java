package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    List<Item> items = new ArrayList<>();
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
//        int ind = indexOf(id);
        return indexOf(id) != -1 ? items.get(indexOf(id)) : null;
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
        boolean result = false;
        for (Item i : items) {
            if (i.getId() == id) {
                items.set(items.indexOf(i), item);
                item.setId(id);
                result = true;
            }
        }
        return result;
    }

    public boolean delete(int id) {
        boolean b = false;
        for (Item item : items) {
            if (item.getId() == id) {
                items.remove(item);
                b = true;
                break;
            }
        }
        return b;
    }
}