package ru.job4j.tracker;

public class FindActionById implements UserAction {
    private final Output myOut;

    public FindActionById(Output out) {
        this.myOut = out;
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
            myOut.myPrintln(fnder.toString());
        } else myOut.myPrintln("Find false");
        return true;
    }
}
