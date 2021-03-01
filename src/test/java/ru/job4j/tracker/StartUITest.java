package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenCreateItem() {
        String[] answers = {"Create a new Item"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Create a new Item");
        assertThat(created.getName(), is(expected.getName()));

    }

    @Test
    public void whenReplaceItem(){
        Item item = new Item("new item");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String [] answers = {String.valueOf(item.getId()),"new old item"};
        StartUI.replaceItem(new StubInput(answers),tracker);
        Item rep = tracker.findById(item.getId());
        assertThat(rep.getName(),is("new old item"));
    }

    @Test
    public void whenDeletedItem(){
        Item item = new Item("new item");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String [] del = {String.valueOf(item.getId())};
        StartUI.deletedItem(new StubInput(del),tracker);
        Item rep = tracker.findById(item.getId());
        assertNull(rep);
    }
}