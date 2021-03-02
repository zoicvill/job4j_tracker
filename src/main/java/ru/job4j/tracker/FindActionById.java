package ru.job4j.tracker;

public class FindActionById implements UserAction {
    private final Output output;

    public FindActionById(Output output) {
        this.output = output;
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
            output.outPrintln(fnder.toString());
        } else output.outPrintln("Find false");
        return true;
    }
}
