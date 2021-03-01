package ru.job4j.tracker;

import static java.lang.System.out;

public class FindActionById implements UserAction{
    private final Output out;

    public FindActionById(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item fnder = tracker.findById(id);
        if (fnder != null) {
            out.println("Find true " + fnder.toString());
        } else out.println("Find false");
        return true;
    }
}
