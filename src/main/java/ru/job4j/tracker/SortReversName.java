package ru.job4j.tracker;

import java.util.Comparator;

public class SortReversName implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o2.getName().compareToIgnoreCase(o1.getName());
    }
}
