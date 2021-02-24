package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item(10,"i");
        Item test = new Item(12,"test");
        Item test1 = new Item(15,"test1");
        Tracker tracker = new Tracker();
        tracker.add(item);
        System.out.println(tracker.findById(1).getName());
        System.out.println(item + "\n" + test + "\n" + test1);
    }
}
