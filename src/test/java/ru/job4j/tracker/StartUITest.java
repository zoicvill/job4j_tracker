package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        UserAction[] actions = {
                new CreateAction(output),
                new EndAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output myOut = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1, "Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", "1", replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output myOut = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(1));
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = {
                new DeletedAction(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output myOut = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new EndAction()
        };
        new StartUI(myOut).init(in, tracker, actions);
        assertThat(myOut.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Exit Program ===" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAction() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(0, "ShowAction"));
        Output myOut = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1"});
        UserAction[] actions = {
                new ShowAction(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(in, tracker, actions);
        assertThat(myOut.toString(), is("Menu." + System.lineSeparator() +
                "0. === Show all items ===" + System.lineSeparator() +
                "1. === Exit Program ===" + System.lineSeparator() +
                item + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. === Show all items ===" + System.lineSeparator() +
                "1. === Exit Program ===" + System.lineSeparator() + ""));

    }

    @Test
    public void FindByNameAction(){
        Tracker tracker = new Tracker();
        Item first = tracker.add(new Item(0,"First"));
        Output myOut = new StubOutput();
        Input in = new StubInput(new String[]{"0","First", "1"});
        UserAction[] actions = {
                new FindActionByName(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(in,tracker,actions);
        assertThat(myOut.toString(),is("Menu." + System.lineSeparator() +
                "0. === Find items by name ===" + System.lineSeparator() +
                "1. === Exit Program ===" + System.lineSeparator() +
                first + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. === Find items by name ===" + System.lineSeparator() +
                "1. === Exit Program ===" + System.lineSeparator() + ""));

    }
    @Test
    public void  FindByIdAction(){
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(0, "first"));
        Output myOut = new StubOutput();
        Input in = new StubInput(new String[]{"0",String.valueOf(item.getId()),"1"});
        UserAction [] actions = {
                new FindActionById(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(in,tracker,actions);
        assertThat(myOut.toString(),is("Menu." + System.lineSeparator() +
                "0. === Find item by Id ===" + System.lineSeparator() +
                "1. === Exit Program ===" + System.lineSeparator() +
                item + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. === Find item by Id ===" + System.lineSeparator() +
                "1. === Exit Program ===" + System.lineSeparator() + ""));
    }
}