package ru.job4j.tracker;


import static java.lang.System.out;

public class StartUI {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItem(Input input, Tracker tracker) {
        out.println("===  Show all items ===");
        Item[] item = tracker.findAll();
        for (Item value : item) {
            out.println(value.toString());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        out.println("===  Edit item ===");
        int firstId = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item editItem = new Item(firstId, name);
        if (tracker.replace(firstId, editItem)) {
            out.println("Edit true ");
        } else out.println("Edit false");
    }

    public static void deletedItem(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Deleted true ");
        } else out.println("Deleted false");
    }

    public static void findItem(Input input, Tracker tracker) {
        out.println("=== Find item by Id ===");
        int id = input.askInt("Enter id: ");
        Item fnder = tracker.findById(id);
        if (fnder != null) {
            out.println("Find true " + fnder.toString());
        } else out.println("Find false");
    }

    public static void findItemByName(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item value : item) {
                out.println(value.toString());
            }
        } else {
            out.println("Find false");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
                genItem(tracker);
            } else if (select == 1) {
                StartUI.showItem(input, tracker);

            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);

            } else if (select == 3) {
                StartUI.deletedItem(input, tracker);

            } else if (select == 4) {
                StartUI.findItem(input, tracker);

            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        out.println("Menu.");
        out.println("0. Add new Item");
        out.println("1. Show all items");
        out.println("2. Edit item");
        out.println("3. Delete item");
        out.println("4. Find item by Id");
        out.println("5. Find items by name");
        out.println("6. Exit Program");
    }

    private void genItem(Tracker tracker) {
        for (int i = 0; i < 10; i++) {
            Item item = new Item("GenItem" + i * 3);
            tracker.add(item);
        }
    }

}
