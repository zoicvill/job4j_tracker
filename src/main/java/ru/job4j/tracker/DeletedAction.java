package ru.job4j.tracker;

import static java.lang.System.out;

public class DeletedAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Deleted true ");
        } else out.println("Deleted false");
        return true;
    }
}
