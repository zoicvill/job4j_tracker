package ru.job4j.tracker;

public class FindActionByName implements UserAction {
    private final Output myOut;

    public FindActionByName(Output myOut) {
        this.myOut = myOut;
    }

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
                myOut.myPrintln(value.toString());
            }
        } else {
            myOut.myPrintln("Find false");
        }
        return true;
    }
}
