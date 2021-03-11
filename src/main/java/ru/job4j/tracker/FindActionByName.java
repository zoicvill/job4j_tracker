package ru.job4j.tracker;

import java.util.List;

public class FindActionByName implements UserAction {
    private final Output output;

    public FindActionByName(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> item = tracker.findByName(name);

        if (item.size() > 0) {
            for (Item value : item) {
                output.outPrintln(value.toString());
            }
        } else {
            output.outPrintln("Find false");
        }
        return true;
    }
}
