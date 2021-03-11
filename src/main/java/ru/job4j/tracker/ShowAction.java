package ru.job4j.tracker;


import java.util.List;

public class ShowAction implements UserAction {
    private final Output output;

    public ShowAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findAll();
        for (Item value : item) {
            output.outPrintln(value.toString());
        }
        return true;
    }
}
