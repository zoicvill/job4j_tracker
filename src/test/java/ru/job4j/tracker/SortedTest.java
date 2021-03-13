package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortedTest {

    @Test
    public void whenUpSortId() {
        Item item2 = new Item(12, "i2");
        Item item1 = new Item(10, "i1");
        Item item4 = new Item(20, "i4");
        Item item3 = new Item(19, "i3");
        List<Item> listSort = Arrays.asList(item4, item2, item3, item1);
        Collections.sort(listSort, new SortByItemUp());
        List<Item> expected = Arrays.asList(item1, item2, item3, item4);
        assertThat(listSort, is(expected));
    }

    @Test
    public void whenDownSortId() {
        Item item2 = new Item(12, "i2");
        Item item1 = new Item(10, "i1");
        Item item4 = new Item(20, "i4");
        Item item3 = new Item(19, "i3");
        List<Item> listSort = Arrays.asList(item4, item2, item3, item1);
        Collections.sort(listSort, new SortByItemDown());
        List<Item> expected = Arrays.asList(item4, item3, item2, item1);
        assertThat(listSort, is(expected));
    }

    @Test
    public void whenUpSortName() {
        Item item2 = new Item(12, "i2");
        Item item1 = new Item(10, "i1");
        Item item4 = new Item(20, "i4");
        Item item3 = new Item(19, "i3");
        List<Item> listSort = Arrays.asList(item4, item2, item3, item1);
        Collections.sort(listSort, new SortByNameUp());
        List<Item> expected = Arrays.asList(item1, item2, item3, item4);
        assertThat(listSort, is(expected));
    }

    @Test
    public void whenReversSortName() {
        Item item2 = new Item(12, "i2");
        Item item1 = new Item(10, "i1");
        Item item4 = new Item(20, "i4");
        Item item3 = new Item(19, "i3");
        List<Item> listSort = Arrays.asList(item4, item2, item3, item1);
        Collections.sort(listSort, new SortReversName());
        List<Item> expected = Arrays.asList(item4, item3, item2, item1);
        assertThat(listSort, is(expected));
    }


}
