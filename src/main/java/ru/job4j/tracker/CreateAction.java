package ru.job4j.tracker;

public class CreateAction implements UserAction{
    private final Output myOut;

    public CreateAction(Output myOut) {
        this.myOut = myOut;
    }

    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        genItem(tracker);
        return true;
    }
    private void genItem(Tracker tracker) {
        for (int i = 0; i < 10; i++) {
            Item item = new Item("GenItem" + i * 3);
            tracker.add(item);
        }
    }
}
