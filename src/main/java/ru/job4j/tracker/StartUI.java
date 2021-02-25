package ru.job4j.tracker;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class StartUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                out.println("=== Create a new Item ===");
                out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                genItem(tracker);
            } else if (select == 1) {
                out.println("===  Show all items ===");
                Item[] item = tracker.findAll();
                for (Item value : item) {
                    out.println(value.toString());
                }

            } else if (select == 2) {
                out.println("===  Edit item ===");
                out.println("Enter id: ");
                int firstId = Integer.parseInt(scanner.nextLine());
                out.println("Enter name: ");
                String name = scanner.nextLine();
                Item editItem = new Item(firstId, name);
                if (tracker.replace(firstId, editItem)) {
                    out.println("Edit true ");
                } else out.println("Edit false");

            } else if (select == 3) {
                out.println("=== Delete item ===");
                out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    out.println("Deleted true");
                } else out.println("Deleted false");

            } else if (select == 4) {
                out.println("=== Find item by Id ===");
                out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item fnder = tracker.findById(id);
                if (fnder != null) {
                    out.println("Find true" + fnder.toString());
                } else out.println("Find false");

            } else if (select == 5) {
                out.println("=== Find items by name ===");
                out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (Item value : item) {
                        out.println(value.toString());
                    }
                } else {
                    out.println("Find false");
                }

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
