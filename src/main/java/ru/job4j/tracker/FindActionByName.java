package ru.job4j.tracker;

import static java.lang.System.out;

public class FindActionByName implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item value : item) {
                out.println(value.toString());
            }
        } else {
            out.println("Find false");
        }
        return true;
    }
}
