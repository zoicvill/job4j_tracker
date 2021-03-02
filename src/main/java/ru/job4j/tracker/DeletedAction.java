package ru.job4j.tracker;

public class DeletedAction implements UserAction {
    private final Output output;

    public DeletedAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            output.outPrintln("Deleted true ");
        } else output.outPrintln("Deleted false");
        return true;
    }
}
