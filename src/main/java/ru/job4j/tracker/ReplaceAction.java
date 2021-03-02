package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output output;

    public ReplaceAction(Output output) {
        this.output = output;
    }

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
            output.outPrintln("Edit true ");
        } else output.outPrintln("Edit false");
        return true;
    }
}
