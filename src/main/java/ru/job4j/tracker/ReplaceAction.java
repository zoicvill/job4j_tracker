package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
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
            out.println("Edit true ");
        } else out.println("Edit false");
        return true;
    }
}
