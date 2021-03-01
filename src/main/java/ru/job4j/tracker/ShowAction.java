package ru.job4j.tracker;


public class ShowAction implements UserAction {
    private final Output myOut;

    public ShowAction(Output out) {
        this.myOut = out;
    }

    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (Item value : item) {
            myOut.myPrintln(value.toString());
        }
        return true;
    }
}
