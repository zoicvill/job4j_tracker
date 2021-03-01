package ru.job4j.tracker;

public class DeletedAction implements UserAction{
    private final Output myOut;

    public DeletedAction(Output myOut) {
        this.myOut = myOut;
    }

    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            myOut.myPrintln("Deleted true ");
        } else myOut.myPrintln("Deleted false");
        return true;
    }
}
