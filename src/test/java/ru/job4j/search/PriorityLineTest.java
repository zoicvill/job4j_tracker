package ru.job4j.search;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriorityLineTest {

    @Test
    public void whenHigherPriority() {
        PriorityLine queue = new PriorityLine();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

}