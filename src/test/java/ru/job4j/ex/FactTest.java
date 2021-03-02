package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenTestFact(){
        Fact fact = new Fact();
        fact.calc(-3);
    }

    @Test
    public void whenTastTry(){
        Fact fact = new Fact();
        int res = fact.calc(5);
        assertThat(res, is(120));
    }

}