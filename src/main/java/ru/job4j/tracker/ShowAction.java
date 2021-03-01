package ru.job4j.tracker;

import static java.lang.System.out;

public class ShowAction implements UserAction {

    @Override
    public String name() {
        return"=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (Item value : item) {
            out.println(value.toString());
        }
        return true;
    }
}