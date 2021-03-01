package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output myOut;

    public ReplaceAction(Output myOut) {
        this.myOut = myOut;
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
            myOut.myPrintln("Edit true ");
        } else myOut.myPrintln("Edit false");
        return true;
    }
}
