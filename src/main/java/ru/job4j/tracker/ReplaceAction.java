package ru.job4j.tracker;

import static java.lang.System.out;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int firstId = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item editItem = new Item(firstId, name);
        if (tracker.replace(firstId, editItem)) {
            out.println("Edit true ");
        } else out.println("Edit false");
        return true;
    }
}
