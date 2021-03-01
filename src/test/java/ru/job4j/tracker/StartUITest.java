package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

//      @Test
//    public void whenCreateItem() {
//          Input in = new StubInput(
//                  new String[] {"0", "Item name", "1"}
//          );
//          Tracker tracker = new Tracker();
//          Output output = new StubOutput();
//          UserAction[] actions = {
//                  new CreateAction(output),
//                  new EndAction()
//          };
//          new StartUI().init(in, tracker, actions);
//          assertThat(tracker.findAll()[0].getName(), is("Item name"));
//      }
//    @Test
//    public void whenReplaceItem() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item(1,"Replaced item"));
//        String replacedName = "New item name";
//        Input in = new StubInput(
//                new String[] {"0","1", replacedName, "1"}
//        );
//        UserAction[] actions = {
//                new ReplaceAction(),
//                new EndAction()
//        };
//        new StartUI().init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item(1));
//        Input in = new StubInput(
//                new String[] {"0", "1", "1"}
//        );
//        UserAction[] actions = {
//                new DeletedAction(),
//                new EndAction()
//        };
//        new StartUI().init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
//    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new EndAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === Exit Program ===" + System.lineSeparator()
        ));
    }
}